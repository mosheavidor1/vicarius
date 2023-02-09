package Project.Infra.Login;


import Project.Infra.Driver.DriverSettings;
import Project.Infra.Driver.Wait;
import Project.Infra.LoginSettings.LoginCredentials;
import Project.Infra.LoginSettings.LoginElements;
import Project.Infra.LoginSettings.UserCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn implements DriverSettings{
    WebDriver driver;




//SigIn test

        public void Sign(WebDriver driver) throws InterruptedException {


            Wait wait = new Wait(driver, 100);

            UserCredentials userCredentials =new UserCredentials();

            this.driver = driver;
            driver.get(LoginCredentials.urlSignIn);
            driver.manage().window().fullscreen();

            wait.waitForElement(By.xpath(LoginElements.workEmail));
            driver.findElement(By.xpath(LoginElements.workEmail)).sendKeys(userCredentials.getWorkEmail());

            wait.waitForElement(By.xpath(LoginElements.StartButton));
            driver.findElement(By.xpath(LoginElements.StartButton)).click();







        }


        }





