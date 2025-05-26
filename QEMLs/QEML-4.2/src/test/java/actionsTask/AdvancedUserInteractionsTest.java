package actionsTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdvancedUserInteractionsTest {

    static WebDriver driver;
    static Actions actions;
    GFGPage gfgPage;
    FormyPage formyPage;


    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        actions = new Actions(driver);
        gfgPage = new GFGPage(driver);
        formyPage = new FormyPage(driver);
    }

    @Test
    public void  performDragAndDrop() throws InterruptedException {
        String actualText = formyPage.DragAndDrops()
                .getDescription();
        String expectedText = "Dropped!";
        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void performMouseHover() throws InterruptedException {
        String expectedText = gfgPage.performMouseHovers()
                .getDescription();
        String actualText ="DSA Tutorial - Learn Data Structures and Algorithms";
        Assert.assertEquals(actualText,expectedText);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
