import org.openqa.selenium.WebDriver;

public class SingletonDriver {
    public static void main(String[] args) {
        WebDriver driver = WebDriverSingleton.getDriver();
        System.out.println(driver);
        WebDriver driver1 = WebDriverSingleton.getDriver();
        System.out.println(driver1);
    }

}
