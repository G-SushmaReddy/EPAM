package actionsTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class FormyPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@id = 'image']")
    WebElement source;

    @FindBy(xpath = "//div[@id = 'box']")
    WebElement target;

    @FindBy(xpath = "//div[@id = 'box']//p")
    WebElement actualText;

    public FormyPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public FormyPage DragAndDrops(){
        driver.get("https://formy-project.herokuapp.com/dragdrop");
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();
        return this;
    }

    public String getDescription(){
        return actualText.getText();
    }


}
