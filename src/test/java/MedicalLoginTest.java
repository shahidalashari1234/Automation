
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
//import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import Pages.MedicalLogin;

public class MedicalLoginTest {
    @Test
    public void Demo_Patient_login() throws InterruptedException {
        String baseUrl = "https://demo.openmrs.org/openmrs/login.htm";
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        //WebElement username=driver.findElement(By.id("username"));
        MedicalLogin.login_pageName(driver).sendKeys("Admin");
        MedicalLogin.login_pagePass(driver).sendKeys("Admin123");
       // WebElement password=driver.findElement(By.id("password"));
       // username.sendKeys("Admin");
        Thread.sleep(2000);
       // password.sendKeys("Admin123");
        // select one from Unordered List

        MedicalLogin.clickRegDesk(driver).click();
        Thread.sleep(2000);


        //Then Click on LOgin
        //driver.findElement(By.id("loginButton")).click();
        MedicalLogin.clickLogin(driver).click();
        MedicalLogin.clickRegPatient(driver).click();
       // WebElement Given= driver.findElement(By.name("givenName"));
        MedicalLogin.EnterName(driver).sendKeys("Zahida");
        //WebElement MiddleName = driver.findElement(By.name("middleName"));
        MedicalLogin.EnterMiddleName(driver).sendKeys("lashari");
        Thread.sleep(2000);
        //WebElement FamilyName = driver.findElement(By.name("familyName"));
        //FamilyName.sendKeys("Lashari");
        MedicalLogin.EnterFamilyName(driver);
        Thread.sleep(2000);
        //driver.findElement(By.id("checkbox-unknown-patient")).click();
        MedicalLogin.CheckFOrUnidentifiedPatient(driver).click();
        Thread.sleep(2000);
        MedicalLogin.clickOnNext(driver).click();
        // for gender selection
        Select dropdown = new Select(driver.findElement(By.name("gender")));
        dropdown.selectByVisibleText("Female");

        Thread.sleep(2000);

        MedicalLogin.clickOnNext(driver).click();
        //Enter birthDate Day
        WebElement Day = driver.findElement(By.name("birthdateDay"));
        Day.sendKeys("5");
        Select Dropdown = new Select(driver.findElement(By.id("birthdateMonth-field")));
        Dropdown.selectByVisibleText("February");
        WebElement Year = driver.findElement(By.name("birthdateYear"));
        Year.sendKeys("1998");
        MedicalLogin.clickOnNext(driver).click();


        //Add Address
       //WebElement Address= driver.findElement(By.id("address1"));
      // Address.sendKeys("Lahore Pakistan");
        MedicalLogin.AddAddress1(driver);
       // WebElement Address1= driver.findElement(By.id("address2"));
        //Address1.sendKeys("Okara Pakistan");
        MedicalLogin.AddAddress2(driver);
        //Add City
        //WebElement CityVillage= driver.findElement(By.id("cityVillage"));
       // CityVillage.sendKeys("Okara(Habibabad)");
        MedicalLogin.AddCity(driver);
        //Add State
       // WebElement StateOrProvince= driver.findElement(By.id("stateProvince"));
        //StateOrProvince.sendKeys("Punjab");
        MedicalLogin.Addprovince(driver);
        // Add Country
       // WebElement Country= driver.findElement(By.id("country"));
        //Country.sendKeys("Pakistan");
        MedicalLogin.AddCountry(driver);
// Add postal code
       // WebElement PstalCode= driver.findElement(By.id("postalCode"));
       // PstalCode.sendKeys("51144");
        MedicalLogin.AddPostalCode(driver);

        MedicalLogin.clickOnNext(driver).click();

        //WebElement Phone= driver.findElement(By.name("phoneNumber"));
       // Phone.sendKeys("0314567788");
        MedicalLogin.AddPhone(driver);
        MedicalLogin.clickOnNext(driver).click();


        Select Dropdown1= new Select(driver.findElement(By.xpath("//*[@id=\"relationship_type\"]")));
        Dropdown1.selectByVisibleText("Sibling");

        //WebElement PersonName = driver.findElement(By.xpath("//*[@id=\"relationship\"]/p[2]/input[1]"));
        //PersonName.sendKeys("Shumaila");
        MedicalLogin.EnterPersonName(driver);

        MedicalLogin.clickOnNext(driver).click();
        driver.findElement(By.id("submit")).click();
        // Selecting CheckkBox
       // WebElement Estimated = driver.findElement(By.id("birthdateEstimated-field"));

        // This will Toggle the Check box
        //Estimated.click();

        // Check whether the Check box is toggled on
        MedicalLogin.SelectCheckbox(driver);
        //if (Estimated.isSelected()) {
        //    System.out.println("Checkbox is Toggled On");

       // } else {
        //    System.out.println("Checkbox is Toggled Off");
      //  }
        //click on next Button
        MedicalLogin.clickOnNextByPath(driver).click();
        //Save Form
        MedicalLogin.saveForm(driver).click();
        MedicalLogin.RegSubmit(driver).click();
        //For getting Error message
        String actual_msg=driver.findElement(By.id("error-message")).getText();
        String expect="plz enter valid user name and password";
        Assert.assertEquals(actual_msg, expect);

        String actualUrl="https://demo.openmrs.org/openmrs/login.htm";
        String expectedUrl= driver.getCurrentUrl();


        Thread.sleep(2000);



        driver.close();
        //*[@id="Outpatient Clinic"]

    }
}
