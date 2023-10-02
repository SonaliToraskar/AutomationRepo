package MavenDemoPckage.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void verifyRediffmailWebsite(){
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("webdriver.chrome","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi//");
        driver.manage().window().maximize();

        WebElement userNameTextBox = driver.findElement(By.id("login1"));

        softAssert.assertEquals(driver.getTitle(), "Rediffmail", "Title should match");
        softAssert.assertTrue(userNameTextBox.isDisplayed(), "Username text box should be displayed");
        driver.close();
        softAssert.assertAll();
    }

    }