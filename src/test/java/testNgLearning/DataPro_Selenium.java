/*package testNgLearning;

import excelUtil.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;*/

/*import java.time.Duration;

public class DataPro_Selenium {
    WebDriver driver;
    @DataProvider(name = "data_set")
    public static Object[][] DataSet() throws Exception {
       //read the json or excel data
       //Object[][] obj = {{"valid","standard_user","secret_sauce"}
         //      ,{"Invalid","standard_user","123"}};
        ExcelReader excel = new ExcelReader();
        excel.setExcelFile(ExcelPath:"./testdata.xlsx",SheetName="Sheet2");
        Object[][] obj = excel.to2DArray();
        return  obj;
    }
    @Test(dataProvider = "data_set")
    public void DataProviderSampletest(String type, String username, String password) throws InterruptedException {
        System.out.println(type + " " + username + " " + password);
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        if (type.equals("valid"))
        {
            wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("[class='title']")));
        }
        else
        {
            wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("[data-test='error']")));
        }
        Thread.sleep(2000);
        driver.quit();

    }
}*/
