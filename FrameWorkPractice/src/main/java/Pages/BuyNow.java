package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BuyNow extends CommonPage{


    public BuyNow(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    public void BuyNowFunctionality()
    {
        BuyNowButton.click();
        Set<String> windows =driver.getWindowHandles(); //[suppose those are store time parent,child]
        Iterator<String> it=windows.iterator();
        String ParentWindow=it.next();
        String ChildWindow=it.next();

        driver.switchTo().window(ChildWindow);
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://phptravels.com/order");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().window(ParentWindow);
        System.out.println(driver.getCurrentUrl());
    }
}
