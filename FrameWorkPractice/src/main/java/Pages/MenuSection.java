package Pages;

import CommonMethods.Predefined;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class MenuSection  extends  CommonPage{
    public MenuSection(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class=\"navbar navbar-expand-lg\"]")
    WebElement MenuSectionButton;

    public void menu(){
        Assert.assertTrue(Predefined.isDisplayedElement("//div[@class=\"navbar navbar-expand-lg\"]"));
        //System.out.println("Menu option is present on the page");

    }
}
