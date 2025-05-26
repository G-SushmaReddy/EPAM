package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IPLTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.iplt20.com/points-table/men/2024");

        List<WebElement> elements = driver.findElements(By.xpath("//div[@ng-if='pointsTableData.length > 0']//table//tr/th"));

        for(WebElement element : elements)
        {
            String text = element.getText();
            System.out.println(text);
        }




        /*List<WebElement> elementList = driver.findElements(By.xpath("//div[@class='ih-pt-fb ng-binding'][count(span[@class='rf W ih-pt-g'])=3]//parent::td//preceding-sibling::td[@class='ih-t-color']//ancestor::h2[1]"));
        for(WebElement element:elementList)
        {
            System.out.println(element.getText());
        }
        //System.out.println(elementList.size());*/
        driver.quit();
    }
}
