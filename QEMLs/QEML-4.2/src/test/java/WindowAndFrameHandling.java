import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;

public class WindowAndFrameHandling {
    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        //maximizing the window screen
        driver.manage().window().maximize();
    }

    @Test
    public void handleMultipleWindows() throws InterruptedException {
        //storing the original window handle for further uses
        String originalWindowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[@id = 'new-tab-button']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for(String handle : windowHandles)
        {
            if(!handle.equals(originalWindowHandle))
            {
                driver.switchTo().window(handle);
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text() = 'Here are the list of all the components']/following::a[text() = 'Autocomplete']"))).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id = 'street_number']"))).sendKeys("Hitech city");
                driver.close();
            }
        }
        //switching back to the original window and not quitting the driver for next task
        driver.switchTo().window(originalWindowHandle);
    }

    @Test
    public void  handleFrames() throws Exception{
        driver.get("https://qa-practice.netlify.app/iframe");
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id = 'sidebarCollapse']"))).click();
        WebElement element = driver.findElement(By.xpath("//iframe[@id ='iframe-checkboxes']"));
        //Entering the frame
        driver.switchTo().frame(element);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text() = 'Learn more']"))).click();
        //coming out of the frame
        driver.switchTo().defaultContent();
        driver.quit();
    }
}