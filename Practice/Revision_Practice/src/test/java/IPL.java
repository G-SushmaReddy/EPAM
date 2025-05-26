import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IPL {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.iplt20.com/points-table/men");
        WebElement table = driver.findElement(By.xpath("//table[@class = 'ih-td-tab']"));
        System.out.println(table.getText());
        driver.quit();
    }
}
