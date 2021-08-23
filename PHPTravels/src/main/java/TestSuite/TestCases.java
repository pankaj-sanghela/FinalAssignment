package TestSuite;

import Automation.Setup;
import Common.Predefined;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases {
    public WebDriver driver;
    CommonPage CommonPage;
    Logo Logo;
    CurrencyClass CurrencyClass;
    Signup Signup;
    Login Login;
    CompanyDropdown CompanyDropdown;
    HomePage HomePage;
    HotelPage HotelPage;
    Flight Flight;
    Tour Tour;

    @BeforeClass
    public void tearUp() {
        driver = Setup.LaunchBrowser("firefox");
        CommonPage = new CommonPage(driver);
        driver.get(CommonPage.properties.getProperty("url"));
        Logo  = new Logo(driver);
        CurrencyClass= new CurrencyClass(driver);
        Signup =new Signup(driver);
        Login = new Login(driver);
        CompanyDropdown=new CompanyDropdown(driver);
        HomePage =new HomePage(driver);
        HotelPage= new HotelPage(driver);
        Flight=  new Flight(driver);
        Tour= new Tour(driver);


    }
    @Test(priority =13 )
    public void HotelSearchFunctionality()
    {
        HotelPage.HotelSearchFunctionality();
    }
    @Test(priority = 12)
    public void TourSearchFunctionality()
    {
        Tour.TourSearch();
    }
    @Test(priority = 11)
    public void FlightButtonFunctionality()
    {
        Flight.FlightButtonVisibility();
    }
    @Test(priority = 10)
    public void HotelButtonFunctionality()
    {
        HotelPage.Hotel();
    }
    @Test(priority = 4)
     public void homePageButton()
    {
        HomePage.HomePageButton();
    }
    @Test(priority = 5)
     public  void CompanyHoverFunctionality()
    {
        CompanyDropdown.hoverOnCompany();
    }
    @Test(priority = 1)
    public void AboutUsPage()
    {
       Predefined.holdExecutionForSeconds(2);
        CompanyDropdown.AboutUsPage();
    }
    @Test(priority = 6)
    public void FAQFunctionality()
    {
        CompanyDropdown.FAQFunction();
        Predefined.holdExecutionForSeconds(2);
    }
    @Test(priority = 8)
    public void TermAndConditionsFunctionality()
    {
        CompanyDropdown.TermAndCondition();
    }
    @Test(priority = 9)

    public void LoginFunctionality()
    {
        Login.LoginFunction();
    }

    @Test(priority = 3)
    public void SignupDetails()
    {
        Signup.SignupDetails();
    }


    @Test(priority = 2)
    public void CurrencyDropDownVisibility()
    {
        CurrencyClass.CurrencyDropdown();
    }
    @Test(priority = 7)
    public void LogoVisibility()
    {
        Logo.LogoVisible();
    }
}
