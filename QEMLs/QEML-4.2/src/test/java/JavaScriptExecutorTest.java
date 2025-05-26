import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaScriptExecutorTest {

    static WebDriver driver;
    static JavascriptExecutor js;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        js = (JavascriptExecutor) driver;
        driver.get("file:///C:/Users/gantagari_sushma/Desktop/QEMLs/QEML-4.2/HiddenElement.html");
    }

    public void clickHiddenElement(WebDriver driver, WebElement element) throws InterruptedException {
        js.executeScript("arguments[0].click()",element);
        WebElement hiddenElement = driver.findElement(By.id("hiddenButton"));
        js.executeScript("arguments[0].click()",hiddenElement);

    }

    @Test
    public void testHiddenElementClick() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//button[@id='hiddenButton']/following-sibling::button"));
        clickHiddenElement(driver,element);
        Assert.assertEquals(driver.findElement(By.id("statusLabel")).getText(),"Hidden button clicked");
    }

    public void scrollToElementAndClick(WebDriver driver,WebElement element)
    {
        js.executeScript("arguments[0].scrollIntoView()",element);
        js.executeScript("arguments[0].click()",element);
    }
    @Test
    public void testScrollElement(){
        driver.get("https://www.selenium.dev/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//a[normalize-space(.)='Learn more']"));
        scrollToElementAndClick(driver,element);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.selenium.dev/sponsors/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}