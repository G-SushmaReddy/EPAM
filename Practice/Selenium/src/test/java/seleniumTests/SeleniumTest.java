package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumTest {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        /*WebDriver driver = new ChromeDriver(options);*/
        options.setAcceptInsecureCerts(true);
//        options.merge(caps);
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://cacert.com");
    }
}
