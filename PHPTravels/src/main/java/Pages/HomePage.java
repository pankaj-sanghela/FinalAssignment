package Pages;

import Common.Predefined;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends  CommonPage{
    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
 public void HomePageButton()
 {
     HomeButton.click();
     Assert.assertTrue(Predefined.isDisplayedElement("//div[@class='col-lg-12 mx-auto responsive--column-l']"));
 }
}
