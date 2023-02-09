package Testing;


import Project.Infra.Driver.DriverSettings;
import Project.Infra.Login.SignIn;
import Project.Infra.Login.SignUp;
import Project.Infra.ProductPage.VideoDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestRun {


    @Autowired
    private WebDriver driver;


    @BeforeTest
    public void setup() {
        System.setProperty(DriverSettings.WebDriver, DriverSettings.path);
        driver = new ChromeDriver();


    }


    @Test(priority = 1)
    public void Register() throws InterruptedException {
        SignUp signUp = new SignUp();
        signUp.Sign(driver);
    }


    @Test(priority = 2)
    public void Login() throws InterruptedException {
        SignIn signIn = new SignIn();
        signIn.Sign(driver);
    }


    @Test(priority = 3)
    public void watchTheDemo() throws InterruptedException {

        VideoDemo videoDemo = new VideoDemo();
        videoDemo.Watch(driver);

    }

    @AfterClass
    public void tearDown() {

        driver.quit();

}



    }





