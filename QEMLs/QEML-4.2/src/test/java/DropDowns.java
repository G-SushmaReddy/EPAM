import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class DropDowns {

    static WebDriver driver;
    static JavascriptExecutor js;


    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        js = (JavascriptExecutor) driver;
    }

    //Select By value
    @Test(priority = 1)
    public void testSelectValue() {
        WebElement element = driver.findElement(By.xpath(" //div[@id = 'withOptGroup']"));
        js.executeScript("arguments[0].scrollIntoView(true)",element);
        element.click();
        WebElement element1 = driver.findElement(By.xpath("//div[@id = 'react-select-2-option-0-0']"));
        String actualText = element1.getText();
        element1.click();
        String expectedText = "Group 1, option 1";
        Assert.assertEquals(actualText,expectedText);
    }

    //Select One DropDown
    @Test(priority = 2)
    public void testSelectOption() {
        driver.findElement(By.xpath("//div[text() = 'Select Title']")).click();
        WebElement element =driver.findElement(By.xpath("//div[@id= 'react-select-3-option-0-0']"));
        String actualText = element.getText();
        element.click();
        String expectedText = "Dr.";
        Assert.assertEquals(actualText,expectedText);
    }

    //Old Style Select Menu
    @Test(priority = 3)
    public void testSingleSelectOldDropDown() {
        WebElement element = driver.findElement(By.id("oldSelectMenu"));
        Select element_dd = new Select(element);
        element_dd.selectByVisibleText("Blue");
        String expectedText = element_dd.getFirstSelectedOption().getText();
        String actualText = "Blue";
        Assert.assertEquals(actualText, expectedText);
    }

    //MultiSelect DropDown
    @Test(priority = 4)
    public void testMultiSelectValue() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//div[text() = 'Select...']"));
        element.click();
        WebElement element1 = driver.findElement(By.xpath("//div[text()='Blue']"));
        String expectedText = element1.getText();
        element1.click();
        String actualText = "Blue";
        Assert.assertEquals(actualText,expectedText);
        driver.findElement(By.xpath("//div[text() = 'Blue']//following::div")).click();
        List<WebElement> element2 = driver.findElements(By.xpath("//div[@class=' css-26l3qy-menu']//div//div"));
        Assert.assertEquals(4,element2.size());
    }

    @Test(priority = 5)
    public void testDropDownWithSearchBox(){
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//div[text() = 'Select...']"));
        element.click();
        actions.sendKeys("Green").perform();
        actions.sendKeys(Keys.ENTER).perform();

        List<WebElement> element2 = driver.findElements(By.xpath("//div[@class=' css-26l3qy-menu']//div//div"));
        Assert.assertEquals(3,element2.size());
    }



    //old Style Multi Select DropDown
    @Test(priority = 6)
    public void testMultiSelectOldDropDown() {
        WebElement multipleSelect = driver.findElement(By.xpath("//select[@id = 'cars']"));
        Select multipleSelect_dd = new Select(multipleSelect);
        multipleSelect_dd.selectByVisibleText("Volvo");
        String expectedValue = multipleSelect_dd.getFirstSelectedOption().getText();
        String actualText = "Volvo";
        Assert.assertEquals(actualText,expectedValue);
        multipleSelect_dd.selectByVisibleText("Saab");
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
