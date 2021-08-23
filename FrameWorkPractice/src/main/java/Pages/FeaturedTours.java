package Pages;

import CommonMethods.Predefined;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FeaturedTours extends CommonPage {


    public FeaturedTours(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h2[@class='float-none'][normalize-space()='Featured Tours']")
    WebElement FuturedTripMenu;
    @FindBy (xpath = "//div[4]//div[1]//div[2]//div[2]//figure[1]//a[1]")
    WebElement FeaturedTripImage;
    @FindBy(xpath ="//body/div[@class='body-inner']/div[@class='main-wrapper scrollspy-action']/div[4]/div[1]/div[2]/div[1]/figure[1]/figcaption[1]/span[1]" )
    WebElement BookNowButton;

    public void FeaturedTrip()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        Assert.assertTrue(Predefined.isDisplayedElement("//h2[@class='float-none'][normalize-space()='Featured Tours']"));
    }
    public void FeaturedTripOnHovering()
    {
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1250)");
        actions.moveToElement(FeaturedTripImage).perform();
        BookNowButton.isDisplayed();
//        Assert.assertTrue(Predefined.isDisplayedElement("//body/div[@class='body-inner']/div[@class='main-wrapper scrollspy-action']/div[4]/div[1]/div[2]/div[1]/figure[1]/figcaption[1]/span[1]"));
//        Predefined.holdExecutionForSeconds(2);


    }
}
