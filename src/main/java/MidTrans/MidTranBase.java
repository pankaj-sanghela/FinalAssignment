package MidTrans;

import DriverSetup.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Properties;


public class MidTranBase {
    public WebDriver driver;
    public static Properties properties;
    public  static FileInputStream fis;
     public MidTranBase(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);
        properties=new Properties();
        try{
            fis= new FileInputStream("Resources/config.properties");
            properties.load(fis);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    @FindBy(xpath = "//a[normalize-space()='BUY NOW']")
    WebElement BuyNowButton;
//    @FindBy(xpath = "//tr[@class='table-content']//input[@value='Budi']")
//    WebElement NameInput;


 public void BuyNowButtonFunction()
 {

     BuyNowButton.click();
 }

}
