import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Test {

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        // Set up WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void validateTextUsingXPath() {
        driver.get("file:///C:/Users/gantagari_sushma/Desktop/QEMLs/QEML-4.2/task1.html");
        String actualText = driver.findElement(By.xpath("//span[@class='mySpan']/preceding::div/child::span")).getText();
        String expectedText = "Engineer Your Future";
        Assert.assertEquals("Text does not match!", expectedText, actualText);
    }

    public String findProductByName(WebDriver driver, String productName) {
       //Add quotes around the productName to form a valid XPath
        return driver.findElement(By.xpath("//td[text()='" + productName + "']/preceding-sibling::td")).getText();
    }

    @Test
    public void testFindProductByName() {
        driver.get("file:///C:/Users/gantagari_sushma/Desktop/QEMLs/QEML-4.2/ProductsTable.html");
        String actual = findProductByName(driver, "Apple MacBook Pro");
        String expected = "PROD_001";
        Assert.assertEquals("Product code does not match!", expected, actual);
    }

    @AfterClass
    public static void tearDown() {
        // Quit the driver after all tests
        if (driver != null) {
            driver.quit();
        }
    }
}