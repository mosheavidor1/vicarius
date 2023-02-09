package Project.Infra.Login;

import Project.Infra.Driver.DriverSettings;
import Project.Infra.Driver.Wait;
import Project.Infra.LoginSettings.LoginCredentials;
import Project.Infra.LoginSettings.LoginElements;
import Project.Infra.LoginSettings.UserCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp implements DriverSettings {

WebDriver driver;

//SignUp test

public void Sign(WebDriver driver) throws InterruptedException {


    Wait wait = new Wait(driver, 100);

    UserCredentials userCredentials =new UserCredentials();

    this.driver = driver;
    driver.get(LoginCredentials.urlSignUP);
    driver.manage().window().fullscreen();

    wait.waitForElement(By.cssSelector(LoginElements.firstName));
    driver.findElement(By.cssSelector(LoginElements.firstName)).sendKeys(userCredentials.getName());
    driver.findElement(By.cssSelector(LoginElements.lastName)).sendKeys(userCredentials.getLastname());

    wait.waitForElement(By.xpath(LoginElements.workEmail));
 driver.findElement(By.xpath(LoginElements.workEmail)).sendKeys(userCredentials.getWorkEmail());


    wait.waitForElement(By.xpath(LoginElements.company));
    driver.findElement(By.xpath(LoginElements.company)).sendKeys(userCredentials.getCompany());


    wait.waitForElement(By.xpath(LoginElements.Continue));
    driver.findElement(By.xpath(LoginElements.Continue)).click();



    wait.waitForElement(By.xpath(LoginElements.password));
    driver.findElement(By.xpath(LoginElements.password)).sendKeys(userCredentials.getPass());

    wait.waitForElement(By.xpath(LoginElements.ConfirmPassword));
    driver.findElement(By.xpath(LoginElements.ConfirmPassword)).sendKeys(userCredentials.getPass());



    wait.waitForElement(By.xpath(LoginElements.StartButton));
    driver.findElement(By.xpath(LoginElements.StartButton)).click();















}
}
