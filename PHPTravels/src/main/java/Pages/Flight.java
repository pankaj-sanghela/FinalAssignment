package Pages;

import Common.Predefined;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Flight extends CommonPage{
    public Flight(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public void FlightButtonVisibility()
    {
        flightButton.click();
        Assert.assertTrue(Predefined.isDisplayedElement("//h2[normalize-space()='SEARCH FOR BEST FLIGHTS']"));
    }
}
