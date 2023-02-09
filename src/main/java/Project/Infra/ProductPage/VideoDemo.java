package Project.Infra.ProductPage;

import Project.Infra.Driver.Wait;
import Project.Infra.LoginSettings.LoginCredentials;
import Project.Infra.LoginSettings.LoginElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.lang.model.element.Element;


public class VideoDemo implements VideoDemoElements {

        WebDriver driver;

//Watch Demo

        public void Watch(WebDriver driver) throws InterruptedException {


            Wait wait = new Wait(driver, 100);



            this.driver = driver;
            driver.get(VideoDemoElements.url);
            driver.manage().window().fullscreen();

            wait.waitForElement(By.xpath(VideoDemoElements.watchDemo));
            driver.findElement(By.xpath(VideoDemoElements.watchDemo)).click();



            driver.findElement(By.xpath(VideoDemoElements.PauseVideo)).click();



            driver.findElement(By.xpath(VideoDemoElements.CloseVideo)).click();




        }

    }


