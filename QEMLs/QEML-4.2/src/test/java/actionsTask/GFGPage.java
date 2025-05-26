package actionsTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GFGPage {

    WebDriver driver;

    @FindBy(xpath = "//div[text()='Tutorials']")
    public WebElement tutorials;

    @FindBy(xpath = "//a[text()='Data Structures & Algorithms']")
    public WebElement dataStructures;

    @FindBy(xpath = "//h1[text() = 'DSA Tutorial - Learn Data Structures and Algorithms']")
    public WebElement datastructuresText;

    public GFGPage(WebDriver driver)
    {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    public GFGPage performMouseHovers(){
        driver.get("https://www.geeksforgeeks.org/");
        Actions actions = new Actions(driver);
        actions.moveToElement(tutorials).perform();
        actions.moveToElement(dataStructures).click().perform();
        return this;
    }

    public String getDescription(){
        return datastructuresText.getText();
    }
}
