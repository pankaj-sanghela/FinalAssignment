package Pages;

import CommonMethods.Predefined;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchOptionVisibility extends  CommonPage {
    public SearchOptionVisibility(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }



    public void color() {
        Predefined.holdExecutionForSeconds(2);
        FlightButton.click();
        Predefined.holdExecutionForSeconds(2);
        WebElement flight = driver.findElement(By.xpath("//a[normalize-space()='Flights']/child::span[@class=\"ink animate\"]"));
        if (flight.isDisplayed()) {
            String i = "true";
            Assert.assertTrue(true, i);
            Assert.assertEquals("//a[@class=\"text-center flights active\"", flight.isDisplayed());
        }
    }
}
