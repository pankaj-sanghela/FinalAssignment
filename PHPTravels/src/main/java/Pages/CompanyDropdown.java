package Pages;

import Common.Predefined;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CompanyDropdown extends CommonPage{
    public CompanyDropdown(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void hoverOnCompany()
    {
        Actions act= new Actions(driver);
        act.moveToElement(CompanyDropDown).perform();
        Assert.assertTrue(Predefined.isDisplayedElement("//div[@class='main-menu-content']//ul[@class='dropdown-menu-item']"));
        Predefined.holdExecutionForSeconds(3);
    }
    public void AboutUsPage()
    {
        Actions act= new Actions(driver);
        act.moveToElement(CompanyDropDown).perform();
        AboutUs.click();
        Assert.assertTrue(Predefined.isDisplayedElement("//h3[normalize-space()='About Us']"));
        Predefined.holdExecutionForSeconds(3);
    }
    public void TermAndCondition()
    {
        Actions act= new Actions(driver);
        act.moveToElement(CompanyDropDown).perform();
        TermAndConditionButton.click();
        Assert.assertTrue(Predefined.isDisplayedElement("//h3[normalize-space()='Terms of Use']"));
        Predefined.holdExecutionForSeconds(3);
    }
    public void FAQFunction()
    {
        Actions act= new Actions(driver);
        act.moveToElement(CompanyDropDown).perform();
        FaqButton.click();
        Assert.assertTrue(Predefined.isDisplayedElement("//h3[normalize-space()='FAQ']"));
        Predefined.holdExecutionForSeconds(3);
    }
}
