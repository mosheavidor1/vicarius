package Testing;

import Project.Infra.Driver.DriverSettings;
import Project.Infra.Login.SignIn;
import Project.Infra.Login.SignUp;
import Project.Infra.Product.Pricing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestRun {

//initializing driver
    @Autowired
    private WebDriver driver;


    @BeforeTest
    public void setup() {
        System.setProperty(DriverSettings.WebDriver, DriverSettings.path);
        driver = new ChromeDriver();


    }

//SignUp page
    @Test(priority = 1)
    public void Register() throws InterruptedException {
        SignUp signUp = new SignUp();
        signUp.Sign(driver);
    }

//Login page
    @Test(priority = 2)
    public void Login() throws InterruptedException {
        SignIn signIn = new SignIn();
        signIn.Sign(driver);
    }

//Verifying title equals to the expected on the test
    @Test(priority = 3)

    public void VerifySubtitle() throws InterruptedException {

        Pricing pricing = new Pricing();
        pricing.VerifySub(driver);


    }

  //  Verifying title is not  equals to the expected on the  test , negative test
    @Test(priority = 4)

    public void WrongSubtitle() throws InterruptedException {

        Pricing pricing = new Pricing();
        pricing.WrongSelect(driver);


    }
//Close the browser
    @AfterClass
    public void tearDown() {

        driver.quit();

    }

}








