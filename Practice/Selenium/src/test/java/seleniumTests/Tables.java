package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        WebElement scroll= driver.findElement(By.xpath("//span[.=\"Structure\"]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)",scroll);
        List<WebElement> heights = driver.findElements(By.xpath("//tbody[@style = 'margin:0;padding:0']//descendant::td[3]//span"));
        List<Integer> heightsss = new ArrayList<>();
        System.out.println(heights);
        for(WebElement element : heights)
        {
            StringBuilder ele = new StringBuilder(element.getText());
            ele.deleteCharAt(ele.length()-1);
            heightsss.add(Integer.parseInt(ele.toString()));
        }
        Collections.sort(heightsss,Collections.reverseOrder());
        System.out.println(heightsss.get(0));
        driver.quit();
    }
}
