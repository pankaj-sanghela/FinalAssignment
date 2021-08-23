package Pages;

import Common.Predefined;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Logo extends CommonPage{
    public Logo(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

   public void LogoVisible()
  {
      Assert.assertTrue(Predefined.isDisplayedElement("//div[@class='logo']//img[@alt='logo']"));
  }
}
