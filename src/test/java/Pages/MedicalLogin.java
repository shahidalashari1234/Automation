package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MedicalLogin {
    WebDriver driver;
    private static WebElement element =null;
    public static WebElement login_pageName(WebDriver driver){
        element=driver.findElement(By.id("username"));
        return element;
    }

    public static WebElement login_pagePass(WebDriver driver){
        element=driver.findElement(By.id("password"));
        return element;
    }
    public static WebElement clickRegDesk(WebDriver driver)
    {
        element=driver.findElement(By.id("Registration Desk"));
        return element;
    }
    public static WebElement clickLogin(WebDriver driver)
    {
        element=driver.findElement(By.id("loginButton"));
        return element;
    }
    public static WebElement clickRegPatient(WebDriver driver)
    {
        element=driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension"));
        return element;
    }
    public static WebElement EnterName(WebDriver driver)
    {
        WebElement Given= driver.findElement(By.name("givenName"));
        return Given;
    }
    public static WebElement EnterMiddleName(WebDriver driver)
    {
        WebElement MiddleName= driver.findElement(By.name("givenName"));
        return MiddleName;
    }
    public static WebElement EnterFamilyName(WebDriver driver)
    {
        WebElement FamilyName = driver.findElement(By.name("familyName"));
        FamilyName.sendKeys("Lashari");
        return FamilyName;
    }
    public static WebElement CheckFOrUnidentifiedPatient(WebDriver driver)
    {
        WebElement Check = driver.findElement(By.id("checkbox-unknown-patient"));
        return  Check;
    }
    public static WebElement clickOnNext(WebDriver driver)
    {
        element=driver.findElement(By.id("next-button"));
        return element;
    }
    public static WebElement AddAddress1(WebDriver driver)
    {
        WebElement Address= driver.findElement(By.id("address1"));
        Address.sendKeys("Lahore Pakistan");
        return Address;
    }
    public static WebElement AddAddress2(WebDriver driver)
    {
        WebElement Address1= driver.findElement(By.id("address2"));
        Address1.sendKeys("Okara Pakistan");
        return Address1;
    }
    public static WebElement AddCity(WebDriver driver)
    {
        WebElement CityVillage= driver.findElement(By.id("cityVillage"));
        CityVillage.sendKeys("Okara(Habibabad)");
        return CityVillage;
    }
    public static WebElement Addprovince(WebDriver driver)
    {
        WebElement StateOrProvince= driver.findElement(By.id("stateProvince"));
        StateOrProvince.sendKeys("Punjab");
        return StateOrProvince;
    }
    public static WebElement AddCountry(WebDriver driver)
    {
        WebElement Country= driver.findElement(By.id("country"));
        Country.sendKeys("Pakistan");
        return Country;
    }
    public static WebElement AddPostalCode(WebDriver driver)
    {
        WebElement PstalCode= driver.findElement(By.id("postalCode"));
        PstalCode.sendKeys("51144");
        return PstalCode;
    }
    public static WebElement AddPhone(WebDriver driver)
    {
        WebElement Phone= driver.findElement(By.name("phoneNumber"));
        Phone.sendKeys("0314567788");
        return Phone;
    }
    public static WebElement EnterPersonName(WebDriver driver) {
        WebElement PersonName = driver.findElement(By.xpath("//*[@id=\"relationship\"]/p[2]/input[1]"));
        PersonName.sendKeys("Shumaila");
        return PersonName;
    }
    public static WebElement SelectCheckbox(WebDriver driver) {
        WebElement Estimated = driver.findElement(By.id("birthdateEstimated-field"));

        // This will Toggle the Check box
        Estimated.click();
        if (Estimated.isSelected()) {
            System.out.println("Checkbox is Toggled On");

        } else {
            System.out.println("Checkbox is Toggled Off");
        }
        return Estimated;
    }
    public static WebElement clickOnNextByPath(WebDriver driver)
    {
        element= driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
        return element;
    }
    public static WebElement saveForm(WebDriver driver)
    {
        element=driver.findElement(By.id("save-form"));
        return element;
    }
    public static WebElement RegSubmit(WebDriver driver)
    {
        element=   driver.findElement(By.xpath("//*[@id=\"registration-submit\"]"));
        return element;
    }
}
