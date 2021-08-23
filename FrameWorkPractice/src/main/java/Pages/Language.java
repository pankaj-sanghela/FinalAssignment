package Pages;

import CommonMethods.Predefined;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Language extends CommonPage {


    public Language(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@id='dropdownLangauge']")
    WebElement LanguageButton;
    @FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']")
    WebElement LanguageDropdown;
    @FindBy(xpath = "//a[normalize-space()='Turkish']")
    WebElement changedLanguage;


    public void languageButtonFuction()
    {
        LanguageButton.click();
        Assert.assertTrue(Predefined.isDisplayedElement("//div[@class='dropdown-menu dropdown-menu-right show']"));
    }

    public void languageChangeMethods()
    {
        LanguageButton.click();
       Predefined.holdExecutionForSeconds(2);
      //  driver.findElement(By.xpath("//a[@id='es']")).click();
       changedLanguage.click();




    }



}
