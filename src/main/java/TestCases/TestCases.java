package TestCases;

import DriverSetup.Setup;
import MidTrans.Checkout;
import MidTrans.MidTranBase;
import MidTrans.OrderSummary;
import MidTrans.Payment;
import Predefined.Methods;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestCases {

    public WebDriver driver;
    MidTranBase midTranBase;
    Checkout Checkout;
    OrderSummary OrderSummary;
    Payment Payment;


    @BeforeClass
    public void tearUp() {
        driver = Setup.LaunchBrowser("chrome");
        midTranBase = new MidTranBase(driver);
        driver.get(midTranBase.properties.getProperty("url"));
        Checkout = new Checkout(driver);
        OrderSummary = new OrderSummary(driver);
        Payment = new Payment(driver);


    }
//
//    @Test(priority = 1)
//    public void BuyNowRedirectToCheckoutPopUp() {
//        midTranBase.BuyNowButtonFunction();
//        Assert.assertTrue(Methods.isDisplayedElement("//div[@class='cart-content buying']"));
//        Methods.holdExecutionForSeconds(2);
//
//    }
//
//    @Test(priority = 2)
//    public void CheckoutPopUpElementsVisibility() {
//        Methods.holdExecutionForSeconds(1);
//        // midTranBase.BuyNowButtonFunction();
//        Assert.assertTrue(Methods.isDisplayedElement("//td[@class='input-label'][normalize-space()='Name']"));
//        Methods.holdExecutionForSeconds(1);
//        Assert.assertTrue(Methods.isDisplayedElement("//td[@class='input-label'][normalize-space()='Email']"));
//        Methods.holdExecutionForSeconds(1);
//        Assert.assertTrue(Methods.isDisplayedElement("//td[@class='input-label'][normalize-space()='Phone no']"));
//        Methods.holdExecutionForSeconds(1);
//        Assert.assertTrue(Methods.isDisplayedElement("//td[@class='input-label'][normalize-space()='City']"));
//        Methods.holdExecutionForSeconds(1);
//        Assert.assertTrue(Methods.isDisplayedElement("//td[@class='input-label'][normalize-space()='Address']"));
//        Methods.holdExecutionForSeconds(1);
//        Assert.assertTrue(Methods.isDisplayedElement("//td[@class='input-label'][normalize-space()='Postal Code']"));
//        Methods.holdExecutionForSeconds(1);
//    }
//
//    @Test(priority = 3)
//    public void FillingDetails() {
//        // midTranBase.BuyNowButtonFunction();
//        Checkout.CheckoutPopDetails();
//        Methods.holdExecutionForSeconds(3);
//
//    }
//
//    @Test(priority = 4)
//    public void CheckOutButton() {
//        Methods.holdExecutionForSeconds(2);
//        Checkout.ClickingCheckOutButton();
//        Methods.holdExecutionForSeconds(2);
//        Assert.assertTrue(Methods.isDisplayedElement("//p[text()='Order Summary']"));
//        Methods.holdExecutionForSeconds(2);
//    }
//
//    @Test(priority = 5)
//    public void OrderSummaryProductDetail() {
//        Methods.holdExecutionForSeconds(2);
//        // OrderSummary.orderSummary();
//        Assert.assertTrue(Methods.isDisplayedElement("//td[@class='table-amount text-body']"));
//        Assert.assertTrue(Methods.isDisplayedElement("//span[@class='item-name']"));
//    }
//
//    @Test(priority = 6)
//    public void ContinueButton() {
//        driver.findElement(By.xpath("//a[@class='button-main-content']")).click();
//    }
//
//    @Test(priority = 7)
//    public void paymentOptionsAvailable() {
//        {
////            midTranBase.BuyNowButtonFunction();
////            Checkout.ClickingCheckOutButton();
//            driver.findElement(By.xpath("//a[@class='button-main-content']")).click();
//
//            driver.findElement(By.xpath("//a[@class='button-main-content']")).click();
//            List<WebElement> options = driver.findElements(By.xpath("//div[@id='payment-list']"));
//            System.out.println(options.size());
//            List actualDropDownValues = new ArrayList();
//            for (WebElement e2 : options) {
//                actualDropDownValues.add(e2.getText());
//
//            }
//
//
//            List expectedOptions = new ArrayList();
//            expectedOptions.add("Credit/Debit Card");
//            expectedOptions.add("ATM/Bank Transfer");
//            expectedOptions.add("GoPay/other e-Wallets");
//            expectedOptions.add("ShopeePay/other e-Wallets");
//            expectedOptions.add("KlikBCA");
//            expectedOptions.add("BCA KlikPay");
//            expectedOptions.add("OCTO Clicks");
//            expectedOptions.add("Danamon Online Banking");
//            expectedOptions.add("e-Pay BRI");
//            expectedOptions.add("LINE Pay e-cash | mandiri e-cash");
//            expectedOptions.add("Telkomsel Cash");
//            expectedOptions.add("Indomaret");
//            expectedOptions.add("Alfa Group");
//            expectedOptions.add("Akulaku");
//
//            for (int i = 0; i < actualDropDownValues.size(); i++) {
//
//                System.out.println("Actual: \n" + actualDropDownValues.get(i));
//                System.out.println(" & Expected: \n" + expectedOptions.get(i));
//                // Assert.assertTrue(actualDropDownValues.get(i).equals(expectedOptions.get(i)));
//
//            }
//        }
//    }
//
//    @Test(priority = 8)
//    public void SelectingPaymentOption() {
//        driver.findElement(By.xpath("//a[@class='list with-promo']")).click();
//        Methods.holdExecutionForSeconds(2);
//        Assert.assertTrue(Methods.isDisplayedElement("//a[@class='button-main-content']"));
//        Methods.holdExecutionForSeconds(2);
//        WebElement CardNumber = driver.findElement(By.xpath("//input[@name='cardnumber']"));
//        //CardNumber.clear();
//        Methods.holdExecutionForSeconds(3);
//        CardNumber.sendKeys("4811111111111114");
//        Methods.holdExecutionForSeconds(2);
//        WebElement expiryDate = driver.findElement(By.xpath("//input[@placeholder='MM / YY']"));
//        Methods.holdExecutionForSeconds(2);
//        expiryDate.clear();
//        expiryDate.sendKeys("0222");
//        Methods.holdExecutionForSeconds(2);
//        WebElement Cvv = driver.findElement(By.xpath("//input[@placeholder='123']"));
//        Methods.holdExecutionForSeconds(2);
//        Cvv.clear();
//        Cvv.sendKeys("123");
//        Methods.holdExecutionForSeconds(2);
//        driver.findElement(By.xpath("//a[@class='button-main-content']")).click();
//        Methods.holdExecutionForSeconds(3);
//
//
//    }
//
//
//
//    @Test(priority = 1)
//    public void MidTransPillow() {
//        Assert.assertTrue(Methods.isDisplayedElement("//span[text()='20,000']"));
//        Assert.assertTrue(Methods.isDisplayedElement("//a[@class='btn buy']"));
//    }
//
//    @Test(priority = 12)
//    public void TransactionDetails() {
//        driver.get(midTranBase.properties.getProperty("url"));
//        int size = driver.findElements(By.tagName("iframe")).size();
//        driver.switchTo().frame(0);
//
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='row page-header']")));
//
//        Assert.assertTrue(Methods.isDisplayedElement("//label[text()='Merchant Name:']"));
//        Methods.holdExecutionForSeconds(2);
//        Assert.assertTrue(Methods.isDisplayedElement("//label[text()='Card Number:']"));
//        Assert.assertTrue(Methods.isDisplayedElement("//label[text()='Amount:']"));
//        Assert.assertTrue(Methods.isDisplayedElement("//label[text()='Transaction Time:']"));
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1122334");
//        Methods.holdExecutionForSeconds(2);
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        Methods.holdExecutionForSeconds(3);
//        driver.switchTo().frame(0);
//        Assert.assertTrue(Methods.isDisplayedElement("//div[@class='final-panel failed']//div[@class='text-failed text-bold']"));
//        Assert.assertTrue(Methods.isDisplayedElement("//div[@class='text-failed text-bold']"));
//    }


//        @Test
//        public void FetchingLinksOfPayment()
//        {
//           // driver.get(midTranBase.properties.getProperty("url"));
//            driver.findElement(By.xpath("//a[@class='btn buy']")).click();
//            Methods.holdExecutionForSeconds(2);
//            driver.findElement(By.xpath("//div[@class='cart-checkout']")).click();
//
//            int size = driver.findElements(By.tagName("iframe")).size();
//            driver.switchTo().frame(0);
//            Methods.holdExecutionForSeconds(2);
//            driver.findElement(By.xpath("//a[@class='button-main-content']")).click();
//            List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='page-container scroll']//div[@class='list-title text-actionable-bold']"));
//
//            //Traversing through the list and printing its text along with link address
//            for(WebElement link:allLinks){
//                System.out.println(link.getText() + " - " + link.getAttribute("text"));
//            }
//        }
    @Test(priority = 3)
    public void ClickOnCancelButton()
    {
        driver.get(midTranBase.properties.getProperty("url"));
        Payment.ClickOnCancelButton();
        Assert.assertTrue(Methods.isDisplayedElement("//div[@class='text-failed text-bold']"));

    }
    @Test(priority = 2)
    public  void clickOkWithRightOtp()
    {
        driver.get(midTranBase.properties.getProperty("url"));
        Payment.ClickOnOkButton();
        WebDriverWait wait = new WebDriverWait(driver, 30);

        Assert.assertTrue(Methods.isDisplayedElement("//div[@class='trans-status trans-success']"));

    }
    @Test(priority = 1)
    public void ClickOkButtonWrongPasskey()
    {
        Payment.ClickOnOkButtonWithWrongOtp();
        Assert.assertTrue(Methods.isDisplayedElement("//div[@class='final-panel failed']//div[@class='text-failed text-bold']"));

    }

    }


