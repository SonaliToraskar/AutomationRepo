package MavenDemoPckage.Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WithParameterization1 {
    public WebDriver driver;

    @Parameters("browsername")
    @BeforeMethod
    public void beforeMethodExample(String browsername) {
        if (browsername.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browsername.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browsername.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\Downloads\\msedgedriver-win64\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Please select the correct browser");
        }
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @Parameters({"CourseName", "CityName"})
    @Test
    public void verifyGoogleWebsite(String courseName, String cityName) throws InterruptedException {
        WebElement nameElement = driver.findElement(By.name("q"));
        nameElement.sendKeys("selenium " + courseName + " " + cityName);
        nameElement.sendKeys(Keys.ENTER);
        Thread.sleep(2000); //
        driver.close();
    }
}
