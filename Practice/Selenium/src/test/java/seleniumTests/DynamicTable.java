package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTable {

    private static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/dynamictable");
        List<WebElement> elements = driver.findElements(By.xpath("//div[@role='row']/span[.='Chrome']//ancestor::div[@role='rowgroup']//parent::div[@role='table']//following-sibling::div/div/span[.='Memory']/preceding-sibling::span"));
        System.out.println(elements.size());
        int size = elements.size()+1;
        String memory = driver.findElement(By.xpath("//div[@role='row']//span[.='Chrome']//following-sibling::span["+size+"]")).getText();
        System.out.println(memory);
       /* int size = driver.findElements(By.xpath("count(//div[@role='row']/span[.='Chrome']//ancestor::div[@role='rowgroup']//parent::div[@role='table']//following-sibling::div/div/span[.='Memory']/preceding-sibling::span)")).size();
        System.out.println(size);*/

       driver.quit();
    }

}
