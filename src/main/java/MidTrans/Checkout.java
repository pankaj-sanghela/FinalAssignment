package MidTrans;

import Predefined.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Checkout extends  MidTranBase{
    public Checkout(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//td[@class='input-label'][normalize-space()='Name']")
    WebElement NameField;
    @FindBy(xpath = "//td[@class='input-label'][normalize-space()='Email']")
    WebElement EmailField;
    @FindBy(xpath = "//td[@class='input-label'][normalize-space()='Phone no']")
    WebElement phoneField;
    @FindBy(xpath = "//td[@class='input-label'][normalize-space()='City']")
    WebElement CityField;
    @FindBy(xpath = "//td[@class='input-label'][normalize-space()='Address']")
    WebElement AddressField;
    @FindBy(xpath = "//td[@class='input-label'][normalize-space()='Postal Code']")
    WebElement PostalCodeField;
    @FindBy(xpath = "//tr[@class='table-content']//input[@value='Budi']")
    WebElement NameInput;
    @FindBy(xpath = "//tr[@class='table-content']//input[@value='budi@utomo.com']")
    WebElement EmailInput;
    @FindBy(xpath = "//tr[@class='table-content']//input[@value='081808466410']")
    WebElement PhoneInput;
    @FindBy(xpath = "//tr[@class='table-content']//input[@value='Jakarta']")
    WebElement CityInput;
    @FindBy(xpath = "//tr[@class='table-content']//textarea")
    WebElement AddressInput;
    @FindBy(xpath = "//tr[@class='table-content']//input[@value='10220']")
    WebElement PostalCodeInput;
    @FindBy(xpath = "//div[text()='CHECKOUT']")
    WebElement CheckoutButton;
    @FindBy(xpath = "//p[text()='Order Summary']")
    WebElement OrderSummaryPopUp;


   public void CheckoutPopDetails()
   {
       //BuyNowButton.click();
       NameInput.clear();
       NameInput.sendKeys("pankaj");
       EmailInput.clear();
       EmailInput.sendKeys("pankajsanghela@gmain.com");
       PhoneInput.clear();
       PhoneInput.sendKeys("9599366935");
       CityInput.clear();
       CityInput.sendKeys("delhi");
       AddressInput.clear();
       AddressInput.sendKeys("kaushik enclave burari delhi");
       PostalCodeInput.clear();
       PostalCodeInput.sendKeys("110084");

   }
   public void ClickingCheckOutButton()
   {
       CheckoutButton.click();

       int size = driver.findElements(By.tagName("iframe")).size();
       System.out.println(size);
       driver.switchTo().frame(0);

   }



}
