package Pages;

import Automation.Setup;
import CommonMethods.Predefined;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MultipleFilterOption extends CommonPage {
    public MultipleFilterOption(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Hotels']")
    WebElement HotelButton;


    @FindBy (xpath = "//a[normalize-space()='Boats']")
    WebElement BoatButton;

    @FindBy(xpath = "//a[normalize-space()='Rentals']")
    WebElement RentalButton;

   public void CheckingMultipleFilterOptionVisible()
   {
       HotelButton.click();
       Assert.assertTrue(Predefined.isDisplayedElement("//a[normalize-space()='Hotels']"));
//       Predefined.holdExecutionForSeconds(2);
       FlightButton.click();
       Assert.assertTrue(Predefined.isDisplayedElement("//a[normalize-space()='Flights']"));
       Predefined.holdExecutionForSeconds(2);
       BoatButton.click();
       Assert.assertTrue(Predefined.isDisplayedElement("//a[normalize-space()='Boats']"));
       Predefined.holdExecutionForSeconds(2);
       RentalButton.click();
       Assert.assertTrue(Predefined.isDisplayedElement("//a[normalize-space()='Rentals']"));
       Predefined.holdExecutionForSeconds(2);
   }

}