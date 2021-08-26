package MidTrans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummary extends MidTranBase{
    public OrderSummary(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//td[@class='table-amount text-body']")
    WebElement Price;
    @FindBy(xpath = "//span[@class='item-name']")
    WebElement ProductName;
    public void orderSummary()
    {
//        int size = driver.findElements(By.tagName("iframe")).size();
//        driver.switchTo().frame(0);


    }
}
