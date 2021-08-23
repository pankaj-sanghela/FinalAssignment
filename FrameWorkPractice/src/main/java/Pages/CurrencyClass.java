package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CurrencyClass extends CommonPage {
    public CurrencyClass(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    public void CurrencyColorOnHovering()
    {

        Actions act = new Actions(driver);
        act.moveToElement(CurrencyButton).perform();
        String Colour=CurrencyButton.getCssValue("color");
        System.out.println(Colour);
        String HoverColor = Color.fromString(Colour).asHex();
        System.out.println(HoverColor);
        Assert.assertEquals("#000000", HoverColor);

    }
}
