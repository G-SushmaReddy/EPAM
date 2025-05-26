package com.epam.automation.tests;

import com.epam.automation.model.HomePage;
import com.epam.automation.pages.SignInPage;
import com.epam.automation.pages.StartPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vitali_Shulha on 22-Oct-15.
 */
public class Test1 {

    //The naming convention for the username and password is not proper it should be username, password
    private final String USERNAME = "testautomationuser";
    private final String PASSWORD = "Time4Death!";


    //This is not following the Single responsibility principle
    //The initialization of webDriver should be in other test using annotation BeforeClass
    //The driver.quirt() should be in a test under the annotation AfterClass
    @Test
    public void testOneCanLoginGithub(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        StartPage startPage = new StartPage(driver);
        startPage.open();
        SignInPage signInPage = startPage.invokeSignIn();
        HomePage homePage = signInPage.signIn(USERNAME, PASSWORD);
        String loggedInUserName = homePage.getLoggedInUserName();
        Assert.assertEquals(USERNAME, loggedInUserName);
        driver.quit();
    }
}
