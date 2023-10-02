package MavenDemoPckage.Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WithoutParameterization {
@Test
    public void verifyGoogleWebsite() {
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("webdriver.chrome", "C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement nameElement = driver.findElement(By.name("q"));
        nameElement.sendKeys("selenium" + "pune");
        nameElement.sendKeys(Keys.ENTER);


        driver.close();
    }
}
