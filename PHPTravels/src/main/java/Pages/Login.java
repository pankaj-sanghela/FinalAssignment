package Pages;

import Common.Predefined;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Login extends CommonPage {
    public Login(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    public void LoginFunction()
    {

        LoginMenuButton.click();
        Predefined.holdExecutionForSeconds(3);

        Email.click();
        Email.sendKeys(CommonPage.properties.getProperty("email"));
        Predefined.holdExecutionForSeconds(3);

        Password.sendKeys(CommonPage.properties.getProperty("password"));
        Predefined.holdExecutionForSeconds(3);

      //  Cookie.click();

        MainLoginButton.click();
        Predefined.holdExecutionForSeconds(3);

    }
    }

