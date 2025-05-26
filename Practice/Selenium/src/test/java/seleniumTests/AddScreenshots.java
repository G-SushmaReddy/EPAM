package seleniumTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.api.internal.Utils;
import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class AddScreenshots {

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //Locators using id strategy
        driver.findElement(By.id("name")).sendKeys("Sushma");
        Thread.sleep(2000);
        Screenshot.takeScreenshot(driver,"Imag1.png");



       /* TakesScreenshot ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("src/test/java/screenshots/Image1.png"));

        driver.findElement(By.id("email")).sendKeys("gantagari_sushma@epam.com");
        Thread.sleep(2000);
        String base64 = ts.getScreenshotAs(OutputType.BASE64);
        byte[] byteArray = Base64.getDecoder().decode(base64);
        FileOutputStream fos = new FileOutputStream(new File("src/test/java/screenshots/Image2.jpeg"));
        fos.write(byteArray);
        fos.close();*/
        driver.quit();
    }

}
