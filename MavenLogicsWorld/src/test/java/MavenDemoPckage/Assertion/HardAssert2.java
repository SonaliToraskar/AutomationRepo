package MavenDemoPckage.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert2{

    @Test
    public void testcase2(){
        System.setProperty("webdriver.chrome","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com//");
        driver.manage().window().maximize();

        WebElement userNameTextBox = driver.findElement(By.id("login1"));

        Assert.assertEquals(driver.getTitle(),"Rediff.mail","title should be match");
        Assert.assertTrue(userNameTextBox.isDisplayed(),"username text box should be displayed");
        driver.close();
    }
}

