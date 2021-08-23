package Pages;

import CommonMethods.Predefined;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import javax.swing.text.html.HTMLDocument;
import javax.xml.xpath.XPath;

public class RentalOptions extends CommonPage{
    public RentalOptions(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[normalize-space()='Rentals']")
    WebElement RentalOption;

  public void RentalFilterOptionVisibility()
  {
      RentalOption.click();
      Assert.assertTrue(Predefined.isDisplayedElement("//form[@action='https://www.phptravels.net/rentals/search']//label[contains(text(),'Destination')]"));
      Assert.assertTrue(Predefined.isDisplayedElement("//label[normalize-space()='Rental Type']"));
      Assert.assertTrue(Predefined.isDisplayedElement("//div[@class='col-lg-4 col-sm-12 col-xs-12']//label[@for='room-amount'][normalize-space()='Date']"));
      Assert.assertTrue(Predefined.isDisplayedElement("//div[@id='rentals']//div[@class='col-lg-4 col-sm-12 col-xs-12']//div[2]//div[1]//label[1]"));
  }
  
}
