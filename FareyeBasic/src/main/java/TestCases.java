import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class TestCases {
    WebDriver driver;

    @BeforeClass
    public void tearUp() {
        driver = Setup.LaunchBrowser("chrome");
    }

    @BeforeMethod
    public void launchWebsite() {
        driver.get("https://staging.fareye.co");
        Setup.holdExecutionForSeconds(2);
        // Assert.assertTrue(Setup.isDisplayedElement("//h1[normalize-space()='Welcome to the-internet']"));
    }
    @Test
    void LogIn()
    {
          WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
          Username.click();
          Username.sendKeys("ovadmin_admin");
          Setup.holdExecutionForSeconds(2);
          driver.findElement(By.xpath("//button[@type='submit']")).click();
        Setup.holdExecutionForSeconds(3);
        WebElement passKey= driver.findElement(By.xpath("//input[@name='password']"));
        passKey.click();
        passKey.sendKeys("Fareye@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Setup.holdExecutionForSeconds(5);


    }
}
