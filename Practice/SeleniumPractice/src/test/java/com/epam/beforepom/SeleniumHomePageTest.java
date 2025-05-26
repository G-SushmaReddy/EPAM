package com.epam.beforepom;

import com.epam.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumHomePageTest {
    private WebDriver driver;
    HomePage homePage;


    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
        homePage = new HomePage(driver);
    }

    @Test
    public void downloadTest(){
        Assert.assertEquals(homePage.clickOnDownload().getDownloadText(),"Downloads");

        driver.navigate().back();
    }

    @Test
    public void documentationTest() {
        driver.findElement(By.linkText("Documentation"))
                .click();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
