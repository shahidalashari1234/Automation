
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


//import java.util.List;


public class SampleTest {
   /* @Test
    public void Test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qabox.github.io/demo");
        Thread.sleep(3000);
        System.out.println("Hello Heloo");
    }*/
   /* @Test
   public void login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        Thread.sleep(3000);
        WebElement username=driver.findElement(By.name("user_login"));
        WebElement password=driver.findElement(By.id("user_password"));
        WebElement login=driver.findElement(By.name("commit"));
        username.sendKeys("username");
        password.sendKeys("your_password");
        driver.findElement(By.name("user_password")).sendKeys("your_password");
        driver.findElement(By.name("submit")).click();
        //driver.findElement(By.xpath("//input[@value='sign in' and @type='submit']")).click();
        String expected_title = "zero - Account Summary";
        String Actual_title = driver.getTitle();
        Assert.assertEquals("Actual_title", "Actual_title");
    }*/

       /* public String baseUrl = "http://10.10.0.224:8080/admin";
        public WebDriver driver;
        @BeforeTest
    public void launchBrowser(){
            System.out.println("launching chromeDriver Browser");
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            driver.manage();
            driver = new ChromeDriver();
            driver.get(baseUrl);
    }
    @Test
    public void verifyHomepageTitle()
    {

        String expectedTitle = "SeamlessWebAdmin";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @AfterTest
    public void terminateBrowser()
    {
        driver.close();
    }*/
   /* @Test
    public void seamless_login()
    {
        String baseUrl = "http://10.10.0.224:8080/admin";
        //WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
      WebElement username=driver.findElement(By.xpath("//*[@id=\"49\"]"));//
      WebElement password=driver.findElement(By.xpath("//*[@id=\"51\"]"));//
        username.sendKeys("root");
        password.sendKeys("root");
      driver.findElement(By.xpath("//*[@id=\"03\"]")).click();
        String actualUrl="http://10.10.0.224:8080/admin";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        driver.close();
    }*/

    @Test
       public void Demo_Patient_login() throws InterruptedException {
           String baseUrl = "https://demo.openmrs.org/openmrs/login.htm";
           System.setProperty("webdriver.chrome.driver", "chromedriver");
           WebDriverManager.chromedriver().setup();
           WebDriver driver = new ChromeDriver();
           driver.get(baseUrl);
           WebElement username=driver.findElement(By.id("username"));
           WebElement password=driver.findElement(By.id("password"));
           username.sendKeys("Admin");
           Thread.sleep(2000);
           password.sendKeys("Admin123");
           // select one from Unordered List

           driver.findElement(By.id("Registration Desk")).click();
           Thread.sleep(2000);


           //Then Click on LOgin
           driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")).click();
        WebElement Given= driver.findElement(By.name("givenName"));
        Given.sendKeys("Zahida");
        WebElement MiddleName = driver.findElement(By.name("middleName"));
        MiddleName.sendKeys("lashari");
        Thread.sleep(2000);
        WebElement FamilyName = driver.findElement(By.name("familyName"));
         FamilyName.sendKeys("Lashari");
        Thread.sleep(2000);
        driver.findElement(By.id("checkbox-unknown-patient")).click();
        Thread.sleep(2000);
         driver.findElement(By.id("next-button")).click();
        // for gender selection
        Select dropdown = new Select(driver.findElement(By.name("gender")));
        dropdown.selectByVisibleText("Female");

        Thread.sleep(2000);

        driver.findElement(By.id("next-button")).click();
        //Enter birthDate Day
        WebElement Day = driver.findElement(By.name("birthdateDay"));
        Day.sendKeys("5");
        Select Dropdown = new Select(driver.findElement(By.id("birthdateMonth-field")));
        Dropdown.selectByVisibleText("February");
        WebElement Year = driver.findElement(By.name("birthdateYear"));
        Year.sendKeys("1998");
        driver.findElement(By.id("next-button")).click();


        //Add Address
        WebElement Address= driver.findElement(By.id("address1"));
       Address.sendKeys("Lahore Pakistan");
        WebElement Address1= driver.findElement(By.id("address2"));
        Address.sendKeys("Okara Pakistan");
        //Add City
        WebElement CityVillage= driver.findElement(By.id("cityVillage"));
        Address.sendKeys("Okara(Habibabad)");
        //Add State
        WebElement StateOrProvince= driver.findElement(By.id("stateProvince"));
        Address.sendKeys("Punjab");
        // Add Country
        WebElement Country= driver.findElement(By.id("country"));
        Address.sendKeys("Pakistan");
// Add postal code
        WebElement PstalCode= driver.findElement(By.id("postalCode"));
        Address.sendKeys("51144");

        driver.findElement(By.id("next-button")).click();

        WebElement Phone= driver.findElement(By.name("phoneNumber"));
        Phone.sendKeys("0314567788");
        driver.findElement(By.id("next-button")).click();


        Select Dropdown1= new Select(driver.findElement(By.xpath("//*[@id=\"relationship_type\"]")));
        Dropdown1.selectByVisibleText("Sibling");

       WebElement PersonName = driver.findElement(By.xpath("//*[@id=\"relationship\"]/p[2]/input[1]"));
        PersonName.sendKeys("Shumaila");

        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("submit")).click();
        // Selecting CheckkBox
        WebElement Estimated = driver.findElement(By.id("birthdateEstimated-field"));

        // This will Toggle the Check box
        Estimated.click();

        // Check whether the Check box is toggled on
        if (Estimated.isSelected()) {
            System.out.println("Checkbox is Toggled On");

        } else {
            System.out.println("Checkbox is Toggled Off");
        }
        //click on next Button
        driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
        //Save Form
        driver.findElement(By.id("save-form")).click();
        driver.findElement(By.xpath("//*[@id=\"registration-submit\"]")).click();
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



