package Pages;

import CommonMethods.Predefined;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturnToTop extends  CommonPage{
    public ReturnToTop(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@id='back-to-top']")
    WebElement ClickToTopButton;

    public void VerificationClickToTopButton()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        ClickToTopButton.click();
        Predefined.isDisplayedElement("//a[@class='btn btn-primary animated flash']");
    }
}
