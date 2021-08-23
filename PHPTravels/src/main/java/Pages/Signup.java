package Pages;

import Common.Predefined;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Signup extends  CommonPage{
    public Signup(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[@type='submit']")
    WebElement SignupButton;
    @FindBy(xpath = "//a[contains(@class,'theme-btn theme-btn-small waves-effect')]")
    WebElement SignUpMenuButton;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement Firstname;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement Lastname;
    @FindBy(xpath = "//input[@placeholder='Phone']")
    WebElement Phone;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement MainSignupButton;
public void SignupDetails() {


     SignUpMenuButton.click();
    Predefined.holdExecutionForSeconds(3);
    Firstname.sendKeys(CommonPage.properties.getProperty("FirstName"));
    Predefined.holdExecutionForSeconds(3);
       Lastname.sendKeys(CommonPage.properties.getProperty("LastName"));
        Predefined.holdExecutionForSeconds(3);

    Phone.sendKeys(CommonPage.properties.getProperty("MobileNumber"));
    Predefined.holdExecutionForSeconds(3);

    Email.sendKeys(CommonPage.properties.getProperty("email"));
    Predefined.holdExecutionForSeconds(3);

    Password.sendKeys(CommonPage.properties.getProperty("password"));
    Predefined.holdExecutionForSeconds(3);
        driver.findElement(By.xpath("//span[@role='combobox']"));
        Predefined.holdExecutionForSeconds(3);

    Cookie.click();
    Predefined.holdExecutionForSeconds(2);

    MainSignupButton.click();
    Predefined.holdExecutionForSeconds(3);


    }
}
