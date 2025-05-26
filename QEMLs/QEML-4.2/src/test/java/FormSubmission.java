import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormSubmission {

    WebDriver driver = new ChromeDriver();

    @Test
    public void FillingtheForm(){
        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();
        //Filling the first name
        driver.findElement(By.id("first-name")).sendKeys("Sushma");
        //Filling the last name
        driver.findElement(By.id("last-name")).sendKeys("Gantagari");
        //filling the job title
        driver.findElement(By.id("job-title")).sendKeys("Tester");
        //Selecting the highest education
        driver.findElement(By.id("radio-button-2")).click();
        //Checking if the checkbox has already clicked or else clicking it
        WebElement element =driver.findElement(By.id("checkbox-2"));
        if(!element.isSelected())
        {
            element.click();
        }
        //Selecting from the dropdown
        WebElement experience = driver.findElement(By.id("select-menu"));
        Select experience_dd = new Select(experience);
        experience_dd.selectByIndex(2);
        //Sending the date
        driver.findElement(By.id("datepicker")).sendKeys("04/07/2004");
        //Submitting the form
        //driver.findElement(By.className("btn btn-lg btn-primary")).click();
        driver.findElement(By.linkText("Submit")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        String expectedValue = "The form was successfully submitted!";
        //Waiting for the form to submit
        String actualValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'alert alert-success']"))).getText();
        //Validating the form submission
        Assert.assertEquals(actualValue,expectedValue);
        driver.quit();
    }
}