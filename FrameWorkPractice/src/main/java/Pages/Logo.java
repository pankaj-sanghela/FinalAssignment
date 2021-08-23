package Pages;

import CommonMethods.Predefined;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Logo extends CommonPage {
    public Logo(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='animated flash d-none d-md-block']")
    WebElement LogoButton;

    public void verifyLogoDisplayedonLeftmostsideoftheWebsite() {

        Assert.assertTrue(Predefined.isDisplayedElement("//div[@class='animated flash d-none d-md-block']"));
    }

}
