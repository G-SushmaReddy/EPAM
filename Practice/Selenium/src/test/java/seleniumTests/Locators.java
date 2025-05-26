package seleniumTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;
import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        //Id locator
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //Locators using id strategy
        driver.findElement(By.id("name")).sendKeys("Sushma");
        //Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("gantagari_sushma@epam.com");
       // Thread.sleep(2000);
        driver.findElement(By.id("phone")).sendKeys("676587044334");
       // Thread.sleep(2000);
        driver.findElement(By.id("textarea")).sendKeys("Abdullapur");
       // Thread.sleep(2000);
        driver.findElement(By.id("female")).click();
       // Thread.sleep(2000);
        WebElement day = driver.findElement(By.id("sunday"));
       // Thread.sleep(2000);
        driver.findElement(By.id("saturday")).click();
      //  Thread.sleep(2000);

        //DropDown to click the single Element
        WebElement countryElement = driver.findElement(By.id("country"));
        Select countryElement_dd = new Select(countryElement);
        countryElement_dd.selectByIndex(9); //We can use ByValue ByVisibleText

        //DropDown to select multiple Elements
        WebElement colorsElement = driver.findElement(By.id("colors"));
        Select colorsElement_dd = new Select(colorsElement);
        colorsElement_dd.selectByIndex(4);
        colorsElement_dd.selectByValue("yellow");
        colorsElement_dd.selectByVisibleText("Green");

        //To deselect Multiple elements
        colorsElement_dd.deselectByValue("yellow");

        driver.findElement(By.id("country")).sendKeys("India");
//        Thread.sleep(2000);
        driver.findElement(By.id("colors")).sendKeys("red");
//        Thread.sleep(2000);
        driver.findElement(By.id("datepicker")).sendKeys("04/07/2004");
//        Thread.sleep(2000);
        driver.findElement(By.id("txtDate")).sendKeys("03/20/2025");
//        Thread.sleep(2000);
        driver.findElement(By.id("start-date")).sendKeys("26/02/2025");
//        Thread.sleep(2000);
        driver.findElement(By.id("end-date")).sendKeys("20/03/2025");
//        Thread.sleep(2000);

        //Locator using className
        driver.findElement(By.className("submit-btn")).click();
//        Thread.sleep(2000);
        driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Hello");
//        Thread.sleep(2000);
        driver.findElement(By.className("wikipedia-search-button")).click();
//        Thread.sleep(2000);

        //Locator using name
        driver.findElement(By.name("start")).click();
        //Thread.sleep(2000);

        driver.findElement(By.id("alertBtn")).click();
        //WebdriverWait which waits for some condition to satisfy to proceed with other tests
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);

        driver.findElement(By.id("confirmBtn")).click();
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);


        driver.findElement(By.id("promptBtn")).click();
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        alert.sendKeys("Sushma");
        alert.accept();
        Thread.sleep(2000);

        String originalWindow = driver.getWindowHandle();
        //Using the CSSSelectors locating strategy
        driver.findElement(By.cssSelector("#HTML4>div>button")).click();
        Thread.sleep(2000);
        Set<String> windowHandles = driver.getWindowHandles();
        for(String handle:windowHandles)
        {
            if(!handle.equals(originalWindow))
            {
                driver.switchTo().window(handle);
                driver.close();
            }

        }
        driver.switchTo().window(originalWindow);
        Thread.sleep(2000);

        driver.findElement(By.id("PopUp")).click();
        windowHandles = driver.getWindowHandles();
        for(String handle:windowHandles)
        {
            if(!handle.equals(originalWindow))
            {
                driver.switchTo().window(handle);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        Thread.sleep(2000);
        driver.quit();


    }
}
