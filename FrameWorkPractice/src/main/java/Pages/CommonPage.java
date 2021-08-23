package Pages;

import Automation.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage extends Setup {
    public WebDriver driver;

    public CommonPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//body/div[1]/div[1]/div[1]/div[3]/a[1]")
    WebElement BuyNowButton;
    @FindBy(linkText = "Demo")
    WebElement Demo;
    @FindBy(xpath = "//a[normalize-space()='Flights']")
    WebElement FlightButton;


    @FindBy(xpath = "//div[@class='dropdown dropdown-currency']")
    WebElement CurrencyButton;




}
