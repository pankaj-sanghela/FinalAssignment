package TestCases;


import DriverSetup.Setup;
import MidTrans.*;
import Predefined.Methods;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.plaf.metal.MetalToggleButtonUI;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MainTestClass {

    public WebDriver driver;
    MidTranBase midTranBase;
    Checkout Checkout;
    OrderSummary OrderSummary;
    Payment Payment;
    DebitClass DebitClass;
    PromoCode PromoCode;



    @BeforeClass (alwaysRun = true)
    public void tearUp() {
        driver = Setup.LaunchBrowser("chrome");
        midTranBase = new MidTranBase(driver);
//        driver.get(midTranBase.properties.getProperty("url"));
        Checkout = new Checkout(driver);
        OrderSummary = new OrderSummary(driver);
        Payment = new Payment(driver);
        DebitClass =new DebitClass(driver);
        PromoCode =new PromoCode(driver);


    }
    @BeforeMethod (alwaysRun = true)
    public void startup()
    {
        driver.get(midTranBase.properties.getProperty("url"));
    }
    //

    @Test(priority = 1, groups = {"smoke"})
    public void MidTransPillow() {
        driver.get(MidTranBase.properties.getProperty("url"));
        midTranBase.BuyNowButtonFunction();
        Assert.assertTrue(Methods.isDisplayedElement("//td[text()='Midtrans Pillow']"));
        Assert.assertTrue(Methods.isDisplayedElement("//td[text()='20,000']"));
    }
    @Test(priority = 2 , groups = {"regression","smoke"})
    public void BuyNowRedirectToCheckoutPopUp() {
        midTranBase.BuyNowButtonFunction();
        Methods.holdExecutionForSeconds(2);
        Assert.assertTrue(Methods.isDisplayedElement("//div[@class='cart-content buying']"));
        Methods.holdExecutionForSeconds(2);

    }
    @Test(priority = 3 , groups={"regression"})
    public void VisibilityOfCheckoutPopUp()
    {
        driver.get(MidTranBase.properties.getProperty("url"));
        Checkout.CheckoutPopUpElementsVisibility();
        Assert.assertTrue(Methods.isDisplayedElement("//td[@class='input-label'][normalize-space()='Name']"));
        Methods.holdExecutionForSeconds(1);
        Assert.assertTrue(Methods.isDisplayedElement("//td[@class='input-label'][normalize-space()='Email']"));
        Methods.holdExecutionForSeconds(1);
        Assert.assertTrue(Methods.isDisplayedElement("//td[@class='input-label'][normalize-space()='Phone no']"));
        Methods.holdExecutionForSeconds(1);
        Assert.assertTrue(Methods.isDisplayedElement("//td[@class='input-label'][normalize-space()='City']"));
        Methods.holdExecutionForSeconds(1);
        Assert.assertTrue(Methods.isDisplayedElement("//td[@class='input-label'][normalize-space()='Address']"));
        Methods.holdExecutionForSeconds(1);
        Assert.assertTrue(Methods.isDisplayedElement("//td[@class='input-label'][normalize-space()='Postal Code']"));
        Methods.holdExecutionForSeconds(1);
    }

    @Test(priority = 4)
    public void FillingDetails() {

        driver.get(MidTranBase.properties.getProperty("url"));
        Checkout.CheckoutPopDetails();
        Methods.holdExecutionForSeconds(3);

    }
    //
    @Test(priority = 5, groups={"smoke","regression"})
    public void CheckOutButton() {
        Methods.holdExecutionForSeconds(2);
        Checkout.ClickingCheckOutButton();
        Methods.holdExecutionForSeconds(2);
        Assert.assertTrue(Methods.isDisplayedElement("//p[text()='Order Summary']"));
        Methods.holdExecutionForSeconds(2);
    }
    //
    @Test(priority = 6,groups={"regression"})
    public void OrderSummaryProductDetail() {
        driver.get(MidTranBase.properties.getProperty("url"));
        Methods.holdExecutionForSeconds(2);
        OrderSummary.orderSummaryElement();
        driver.switchTo().frame(0);
        Methods.holdExecutionForSeconds(2);
        Assert.assertTrue(Methods.isDisplayedElement("//td[@class='table-amount text-body']"));
        Assert.assertTrue(Methods.isDisplayedElement("//span[@class='item-name']"));
    }
    //
    @Test(priority = 7 , groups={"regression","smoke"})
    public void ContinueButton() {
        driver.get(MidTranBase.properties.getProperty("url"));
        OrderSummary.ClickingOnContinueButton();
        Methods.holdExecutionForSeconds(2);
        Assert.assertTrue(Methods.isDisplayedElement("//p[@class='text-page-title-content']"));
    }
    //
    @Test(priority = 8 , groups={"regression"})
    public void paymentOptionsAvailable() {
        {
            midTranBase.BuyNowButtonFunction();
            Methods.holdExecutionForSeconds(2);
            driver.findElement(By.xpath("//div[@class='cart-checkout']")).click();
            Methods.holdExecutionForSeconds(2);
            driver.switchTo().frame(0);
            driver.findElement(By.xpath("//a[@class='button-main-content']")).click();
            List<WebElement> options = driver.findElements(By.xpath("//a[@class='list with-promo']"));
            System.out.println(options.size());
            List actualPaymentValue = new ArrayList();
            for (WebElement wb1 : options) {
                actualPaymentValue.add(wb1.getAttribute("href"));
                System.out.println(wb1.getText());
            }
        }
//            List expectedPaymentValue= new ArrayList();
//            for(WebElement wb2:options)
//            {
//                expectedPaymentValue.add(wb2.getText());
//                System.out.println(wb2.getText());
//            }
//            for(int i = 0; i<actualPaymentValue.size(); i++)
//            {
//
//                System.out.println("Actual: "+actualPaymentValue.get(i));
//                Assert.assertEquals(actualPaymentValue.get(i),equals(expectedPaymentValue.get(i)));
//                System.out.println("payment value is same as expected");
//
//            }
//        }

    }


    @Test(priority = 9, groups={"regression","smoke"})
    public void CheckingSelectingPaymentOptionRedirectToCardDetailScreen()
    {
        DebitClass.SelectingCreditCardAsAPayment();
        Assert.assertTrue(Methods.isDisplayedElement("//input[@name='cardnumber']"));
        Methods.holdExecutionForSeconds(2);
        Assert.assertTrue(Methods.isDisplayedElement("//input[@placeholder='MM / YY']"));
        Methods.holdExecutionForSeconds(2);
        Assert.assertTrue(Methods.isDisplayedElement("//input[@placeholder='123']"));
    }

    @Test(priority = 10, groups = {"smoke"})
    public void PromoCodeAmountCheck()
    {
        PromoCode.PromoCodeAmount();
    }



    @Test(priority = 11 ,groups={"smoke","regression"})
    public void EnteringCardDetails()
    {
        // DebitClass.SelectingCreditCardAsAPayment();
        DebitClass.EnteringCreditCardDetails();
    }

    @Test(priority = 12 , groups={"regression"})
    public void ActionAfterClickingOnPayNowButton()
    {
        DebitClass.CheckingPayNowButtonWorking();
        Assert.assertTrue(Methods.isDisplayedElement("//label[text()='Merchant Name:']"));
        Methods.holdExecutionForSeconds(2);
        Assert.assertTrue(Methods.isDisplayedElement("//label[text()='Amount:']"));
        Methods.holdExecutionForSeconds(2);
        Assert.assertTrue(Methods.isDisplayedElement("//label[text()='Transaction Time:']"));
        Methods.holdExecutionForSeconds(2);
        Assert.assertTrue(Methods.isDisplayedElement("//label[text()='Card Number:']"));


    }

    @Test(priority = 13 , groups={"regression","smoke"})
    public  void clickOkWithRightOtp()
    {
        driver.get(midTranBase.properties.getProperty("url"));
        Payment.ClickOnOkButton();
        Assert.assertTrue(Methods.isDisplayedElement("//div[@class='trans-status trans-success']"));

    }
    @Test(priority = 14 ,groups={"regression"})
    public void ClickOkButtonWrongPasskey()
    {
        Methods.holdExecutionForSeconds(2);
        driver.get(MidTranBase.properties.getProperty("url"));
        Payment.ClickOnOkButtonWithWrongOtp();
        Methods.holdExecutionForSeconds(2);
        Assert.assertTrue(Methods.isDisplayedElement("//div[@class='final-panel failed']//div[@class='text-failed text-bold']"));

    }

    @Test(priority = 15 , groups={"regression"})
    public void ClickOnCancelButton()
    {
        driver.get(midTranBase.properties.getProperty("url"));
        Payment.ClickOnCancelButton();
        Assert.assertTrue(Methods.isDisplayedElement("//div[@class='text-failed text-bold']"));

    }
//    @AfterClass
//    public void close()
//    {
//        driver.quit();
//    }



}