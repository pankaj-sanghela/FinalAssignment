package MidTrans;

import Predefined.Methods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PromoCode extends MidTranBase{
    public PromoCode(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@class='button-main-content']")
    WebElement ContinueButton;
    @FindBy(xpath = "//label[text()='Potongan 10 Rupiah']//input[@type='checkbox']")
    WebElement FirstOption;
    @FindBy(xpath = "//span[@class='text-amount-amount']")
    WebElement AmountAfterTenRupees;
    public void PromoCodeAmount()
    {
        BuyNowButton.click();
        Methods.holdExecutionForSeconds(2);
        CheckoutButton.click();
        Methods.holdExecutionForSeconds(2);
        driver.switchTo().frame(0);
        ContinueButton.click();
        Methods.holdExecutionForSeconds(2);
        CreditCardButton.click();
        Methods.holdExecutionForSeconds(2);
        driver.switchTo().frame(1);
        JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,1000)");
        FirstOption.click();
        System.out.println(AmountAfterTenRupees.getText());
    }
}
