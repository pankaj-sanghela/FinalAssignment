package TestSuite;

import Automation.Setup;
import CommonMethods.Predefined;
import Pages.*;
import jdk.internal.misc.FileSystemOption;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCases {
   public WebDriver driver;
   CommonPage commonPage;
   MultipleFilterOption MultipleFilterOption;
   Language language;
   CurrencyClass CurrencyClass;
    BuyNow BuyNow;
    FeaturedTours FeaturedTours;
    Logo Logo;
    LatestBlog LatestBlog;
    MenuSection MenuSection;
    RentalOptions RentalOptions;
    ReturnToTop ReturnToTop;
   SearchButton   SearchButton;
    SearchOptionVisibility SearchOptionVisibility;

    @BeforeClass
    public void tearUp() {
        driver = Setup.LaunchBrowser("chrome");
        driver.get("https://www.phptravels.net/home//");
        commonPage= new CommonPage(driver);
        MultipleFilterOption=new MultipleFilterOption(driver);
        language= new Language(driver);
        CurrencyClass =  new CurrencyClass(driver);
        BuyNow= new BuyNow(driver);
        FeaturedTours =new FeaturedTours(driver);
        Logo = new Logo(driver);
        LatestBlog =new LatestBlog(driver);
        MenuSection = new MenuSection(driver);
        RentalOptions=new RentalOptions(driver);
        ReturnToTop = new ReturnToTop(driver);
        SearchButton= new SearchButton(driver);
        SearchOptionVisibility = new SearchOptionVisibility(driver);


    }

    @Test(priority = 13)
   public void  SearchButtonVisibility()
    {
        SearchOptionVisibility.color();
    }

    @Test(priority = 14)
    public void SearchButtonFunctionalityChecking()
    {
        SearchButton.CheckingSearchFunctionality();

    }
    @Test(priority = 10)
    public void VerifyMultipleOptionsVisibleOnLanguageButton()
    {
        language.languageButtonFuction();
    }
//
    @Test(priority = 15)
    public void verifyUserIsAbleToChangeTheLanguage()
    {
        Predefined.holdExecutionForSeconds(5);
        language.languageChangeMethods();

    }
    @Test(priority = 9)
    public void MultipleFilterOptions() {
        MultipleFilterOption.CheckingMultipleFilterOptionVisible();
    }
    @Test(priority = 2)
    public void CheckingColorOnHovering()
    {
        CurrencyClass.CurrencyColorOnHovering();
    }
    @Test (priority = 3)
    public void BuyNowFunctionalityChecking()
    {
        BuyNow.BuyNowFunctionality();
    }
    @Test(priority = 4)
    public void FeaturedTripIsVisible()
    {

        FeaturedTours.FeaturedTrip();
    }

    @Test(priority = 6)
    public void LogoDisplacement()
    {
        Logo.verifyLogoDisplayedonLeftmostsideoftheWebsite();
    }

    @Test(priority = 7)
     public void CheckingLatestBlog()
    {
        LatestBlog.LatestOnBlog();
    }

    @Test(priority = 8)
     public void MenuSectionIsVisibleORNot()
    {
        MenuSection.menu();
    }
    @Test(priority = 11)
    public void CheckingAllTheFilterIsVisibleWhenClickOnRental()
    {
        RentalOptions.RentalFilterOptionVisibility();
    }
    @Test(priority = 2)
    public void FeaturedTripCheckingOnHovering()
    {
        FeaturedTours.FeaturedTripOnHovering();
    }
  @Test(priority = 5)
     public void VerificationOfReturnToTopButton()
  {
      ReturnToTop.VerificationClickToTopButton();
      Predefined.holdExecutionForSeconds(3);
      System.out.println("hello");
  }


}
