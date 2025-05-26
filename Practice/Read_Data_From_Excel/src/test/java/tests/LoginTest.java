package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelUtils;

public class LoginTest {

    static WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @DataProvider(name="loginData")
    public static Object[][] getLoginData(){
        String filePath = "src/test/resources/test_data.xlsx";
        String sheetName = "Login";
        return ExcelUtils.getTestData(filePath,sheetName);
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username,String password,String expectedResult)
    {
        driver.get("http://localhost:9000/login");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button")).click();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
