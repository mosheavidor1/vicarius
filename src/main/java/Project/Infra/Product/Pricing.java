package Project.Infra.Product;

import Project.Infra.Driver.Wait;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;


public class Pricing implements PricingElments {

    WebDriver driver;
//Verifying title equals to the expected on the test
    public void VerifySub(WebDriver driver) throws InterruptedException {
        this.driver = driver;

        driver.get(Pricing.url);

        Wait wait = new Wait(driver, 100);

        driver.manage().window().fullscreen();

        wait.waitForElement(By.xpath(PricingElments.pricing));
        driver.findElement(By.xpath(PricingElments.pricing)).click();

        Thread.sleep(2000);
        String actualText = driver.findElement(By.xpath(PricingElments.SubVerify)).getText();
        String expectedText = PricingElments.Text;
        if (actualText.equals(expectedText)) {
            System.out.println("The text is correct.");
        } else {
            System.out.println("The text is incorrect.");
            Assertions.fail();
        }



    }
//Verifying title is not  equals to the expected on the  test , negative test

    public void WrongSelect(WebDriver driver) throws InterruptedException {

        this.driver = driver;

        driver.get(Pricing.url);

        Wait wait = new Wait(driver, 100);

        driver.manage().window().fullscreen();

        wait.waitForElement(By.xpath(PricingElments.pricing));
        driver.findElement(By.xpath(PricingElments.pricing)).click();

        Thread.sleep(2000);
        String actualText = driver.findElement(By.xpath(PricingElments.SubVerify)).getText();
        String expectedText = PricingElments.WrongText;
        if (actualText.equals(expectedText)) {
            System.out.println("The text is correct.");
        } else {
            System.out.println("The text is incorrect.");

        }
    }
}









