package swaroopa;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragAndDrop {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        //Instantiating Chrome driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void performDragAndDrop(){
        driver.get("https://formy-project.herokuapp.com/dragdrop");
        Actions action = new Actions(driver);
        //getting source and destination elements
        WebElement source = driver.findElement(By.id("image"));
        WebElement destination = driver.findElement(By.id("box"));

        //getting initial location of source
        Point initial = source.getLocation();

        //performing drag and drop operation
        action.dragAndDrop(source,destination).build().perform();

        //getting final location of source after drag and drop operation
        Point finalLocation= source.getLocation();

        // asserting source position before and after drag and dropm operation performed
        Assert.assertNotEquals(initial,finalLocation,"Drag and Drop failed !");
    }


    @Test
    public void performMouseHover() throws InterruptedException {
        driver.get("https://www.geeksforgeeks.org/");

        // Finding Courses menu bar
        WebElement courseMenu = driver.findElement(By.xpath("//div[.='Courses']"));
        Actions action = new Actions(driver);

        // Moving cursor over menubar
        action.moveToElement(courseMenu).perform();

        // Clicking on All Courses
        WebElement allCoursesLink = driver.findElement(By.linkText("All Courses"));
        allCoursesLink.click();
        // Printing the actual URL for debugging
        String actualUrl = driver.getCurrentUrl();
        System.out.println("Actual URL: " + actualUrl);
        String expectedUrl = "https://www.geeksforgeeks.org/courses?itm_source=geeksforgeeks&itm_medium=main_header&itm_campaign=courses";
        // Asserting actions with 'contains' for dynamic URLs
        Assert.assertEquals(actualUrl,expectedUrl);
        driver.quit();
               // "Navigation to 'All Courses' failed! Actual URL: " + actualUrl);
    }

}