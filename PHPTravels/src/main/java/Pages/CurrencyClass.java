package Pages;

import Common.Predefined;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CurrencyClass extends CommonPage{
    public CurrencyClass(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void CurrencyDropdown()
    {
        CurrencyButton.click();
        Assert.assertTrue(Predefined.isDisplayedElement("//ul[@class='dropdown-menu show']"));
        Predefined.holdExecutionForSeconds(2);
    }
}
