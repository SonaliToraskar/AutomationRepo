import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMavenExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome", "C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.close();
    }
}