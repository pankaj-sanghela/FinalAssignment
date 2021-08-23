package Pages;

import Automation.Setup;
import Common.Predefined;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.FileInputStream;
import java.util.Properties;

public class CommonPage  extends Setup {
    WebDriver driver;
    public  static Properties properties;
    public  static FileInputStream fis;
    public CommonPage(WebDriver driver)
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
    ///////////////////////////*******************************************//////////////////////
    /////////////////Logo class variable//////////////////
    @FindBy(xpath = "//div[@class='logo']//img[@alt='logo']")
    WebElement LogoButton;

    ////////////////////////////////////////////******************************///////////////////////
    ////////////////////////currency class variable////////////////////////////////
    @FindBy(xpath = "//button[normalize-space()='USD']")
    WebElement CurrencyButton;
    @FindBy(xpath = "//ul[@class='dropdown-menu show']")
    WebElement CurrencyDropDown;
    ///////////////////////////*******************************//////////////////////////////
    ////////////////////Signup Class variables

    @FindBy(xpath = "//a[@class='theme-btn theme-btn-small waves-effect']")
    WebElement SignupButton;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement FirstName;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement LastName;
    @FindBy(xpath = "//input[@placeholder='Phone']")
    WebElement Phone;
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement Email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement Password;
    @FindBy(xpath = "//input[@role='searchbox']")
    WebElement SearchBox;
    @FindBy(xpath = "//li[@id='select2-account_type-result-jxuh-supplier']")
   WebElement SearchInput;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement SubmitButton;

    ////////////////////////////////**********************************////////////////////////////////
    /////////////////Log in Class variables///////////////////////////
    @FindBy(xpath = "//a[@class='theme-btn theme-btn-small theme-btn-transparent ml-1 waves-effect']")
    WebElement LoginMenuButton;

    @FindBy(xpath = "//button[@class='cc-btn cc-dismiss waves-effect']")
    WebElement Cookie;
    @FindBy(xpath = "//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']")
    WebElement MainLoginButton;

    /////////////////////////////////////////****************************************///////////////////////
    /////////////////////////////////Company dropdown variables///////////////////
    @FindBy(xpath = "//div[@class='main-menu-content']//a[@class=' waves-effect'][normalize-space()='Company']")
    WebElement CompanyDropDown;
    @FindBy(xpath = "//div[@class='main-menu-content']//ul[@class='dropdown-menu-item']")
    WebElement DropDownValues;

    @FindBy(xpath = "//div[@class='main-menu-content']//nav//ul//li[@class='footm']//ul[@class='dropdown-menu-item']//li//a[contains(@class,'waves-effect')][normalize-space()='About Us']")
    WebElement AboutUs;
   @FindBy(xpath = "//div[@class='main-menu-content']//nav//ul//li[@class='footm']//ul[@class='dropdown-menu-item']//li//a[contains(@class,'waves-effect')][normalize-space()='Terms of Use']")
   WebElement TermAndConditionButton;
   @FindBy(xpath = "//div[@class='main-menu-content']//nav//ul//li[@class='footm']//ul[@class='dropdown-menu-item']//li//a[@class=' waves-effect'][normalize-space()='FAQ']")
   WebElement FaqButton;
   /////////////////////////////////////////*************************************////////////////////////////
    ////////////////////////Homepage Variables///////////////////
    @FindBy(xpath = "//a[normalize-space()='Home']")
    WebElement HomeButton;
    @FindBy(xpath = "//div[@class='col-lg-12 mx-auto responsive--column-l']")
    WebElement FiltersOptions;

    ////////////////////////////*******************************////////////////////////////////////
    /////////////////////Hotel Page variable////////////////////////////
    @FindBy(xpath = "//a[normalize-space()='Hotels']")
    WebElement HotelButton;
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement HotelSearchButton;

    ///////////////////////////////////***********************************///////////////////////////
    //////////////////////////Flight page Variable
    @FindBy(xpath = "//a[normalize-space()='flights']")
    WebElement flightButton;





}
