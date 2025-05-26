package actions;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AuthenticationPopUps {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://httpbin.org/basic-auth/user/passwd");
       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());*/
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Admin");
        alert.sendKeys("admin");

    }
}
