package MavenDemoPckage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNG {
    @Test

    public void testcase1() {
        System.setProperty("webdriver.chrome", "C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.close();
    }

    @Test
    public void testcase2() {
        System.setProperty("webdriver.chrome", "C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        driver.close();
    }

    @Test
    public void testcase3() {
        System.setProperty("webdriver.chrome", "C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipcart.com/");
        driver.manage().window().maximize();

        driver.close();
    }
}