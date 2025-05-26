import org.openqa.selenium.WebDriver;

public class FactoryClient {
    public static void main(String[] args) {
        WebDriver driver = FactoryDriver.createDriver(Drivers.CHROME);
        System.out.println(driver);
        driver.quit();
    }
}
