package MavenDemoPckage.Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import org.apache.poi.xssf.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcel {
    public static WebDriver driver;

    @DataProvider(name = "data")
    public Object[][] dataProviderFunction() throws IOException {
        Object[][] arrObj = getExcelData("C:\\Users\\admin\\book1.xlsx", "testcase1");
        return arrObj;
    }

    public String[][] getExcelData(String filepath, String Sheetname) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filepath);
        XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = wb.getSheet(Sheetname);

        int noofrow = sheet.getPhysicalNumberOfRows();
        int noofcols = sheet.getRow(0).getLastCellNum();

        String[][] data = new String[noofrow - 1][noofcols];

        for (int i = 1; i < noofrow; i++) {
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < noofcols; j++) {
                XSSFCell cell = row.getCell(j);
                data[i - 1][j] = cell.getStringCellValue();
            }
        }
        return data;
    }

    @Parameters("browsername")
    @BeforeMethod
    public void beforeMethodExample(String browsername) {
        if (browsername.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browsername.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browsername.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\Downloads\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Please select the correct browser");
        }
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "data")
    public void verifyGoogleWebsite(String courseName, String cityName) throws InterruptedException {
        WebElement nameElement = driver.findElement(By.name("q"));
        nameElement.sendKeys("selenium " + courseName + " " + cityName);
        nameElement.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.close();
    }
}
