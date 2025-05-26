package seleniumTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Youtube {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        driver.navigate().to("https://www.youtube.com/shorts/HXKA2Ex0dQc");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement nuvvosthavani = driver.findElement(By.xpath("//button[@class = 'ytp-large-play-button ytp-button'][1]"));
        wait.until(ExpectedConditions.visibilityOf(nuvvosthavani));
        nuvvosthavani.click();
/*

        WebElement element = driver.findElement(By.xpath("//input[@name = 'search_query']"));
        element.sendKeys("nuvvu vasthavani nenu ori abbaya");
        element.submit();
//        WebElement novvosthavani = driver.findElement(By.xpath("//div[@id='contents']/ytd-video-renderer[1]/yt-interaction[@id='interaction']"));
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguemnts[0].scrollIntoView()",novvosthavani);
//        novvosthavani.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.moveByOffset(0,1000)
                .click().perform();
//        js.executeScript("arguments[0].click()",novvosthavani);
*/
        Thread.sleep(10000);
       driver.quit();


    }
}






















