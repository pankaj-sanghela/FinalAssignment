import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.Colors;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.internal.thread.IThreadFactory;
import org.openqa.selenium.Point;
import javax.lang.model.element.Element;
import javax.print.attribute.standard.Destination;
import java.sql.Array;
import java.sql.Driver;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class Functionality {
    WebDriver driver;

    @BeforeClass
    public void tearUp() {
        driver = Setup.LaunchBrowser("chrome");
    }

    @BeforeMethod
    public void launchWebsite() {
        driver.get("https://www.phptravels.net/home//");
        // Assert.assertTrue(Setup.isDisplayedElement("//h1[normalize-space()='Welcome to the-internet']"));
    }

    @AfterMethod
    void clearCache() {
        driver.manage().deleteAllCookies();
    }

    @AfterTest
    void clearCookies() {
        driver.manage().deleteAllCookies();
    }

//    @Test(priority = 1)
//    void VerifyTheButtonBuyNowRedirectOrNot() throws InterruptedException {
//
//        // Assert.assertTrue(Setup.isDisplayedElement("//div[@class='animated fadeIn']/child::a[@target='_blank']"));
//
//        String parentWindow = driver.getWindowHandle();
//        driver.findElement(By.xpath("//div[@class='animated fadeIn']/child::a[@target='_blank']")).click();
//
//        System.out.println(parentWindow);
//        Set<String> Windows = driver.getWindowHandles();
//        for (String window : Windows) {
//            driver.switchTo().window(window);
//            System.out.println("Value   :" + window);
//            Thread.sleep(2000);
//            if (!window.equalsIgnoreCase(parentWindow)) {
//
////                Thread.sleep(1000);
//                Assert.assertTrue(Setup.isDisplayedElement("//div[@class='plan-type wow fadeIn animated']"));
//                Thread.sleep(2000);
//            }
////
//            Setup.holdExecutionForSeconds(2);
//            // driver.switchTo().window(parentWindow);
//            //Setup.holdExecutionForSeconds(2);
//
//       }
    //  }

    @Test(priority = 4)
    void VerifyTheCurrencyButtonWhileHovering() throws InterruptedException {
        WebElement Element = driver.findElement(By.xpath("//div[@class='dropdown dropdown-currency']"));
        Actions act = new Actions(driver);
        Thread.sleep(1000);
        act.moveToElement(Element).perform();
        String colour = driver.findElement(By.xpath("//div[@class='dropdown dropdown-currency']")).getCssValue("color");
        Thread.sleep(1000);
        System.out.println(colour);
        String HoverColor = Color.fromString(colour).asHex();
        System.out.println(HoverColor);
        Assert.assertEquals("#000000", HoverColor);

//        String[] hexValue = colour.replace("rgba(", "").replace(")", "").split(",");
//        hexValue[0] = hexValue[0].trim();
//        int hexValue1 = Integer.parseInt(hexValue[0]);
//        hexValue[1] = hexValue[1].trim();
//        int hexValue2 = Integer.parseInt(hexValue[1]);
//        hexValue[2] = hexValue[2].trim();
//        int hexValue3 = Integer.parseInt(hexValue[2]);
////        String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
//          System.out.println(Arrays.toString(hexValue));


    }

    @Test(priority = 14)
    void VerifyingClickToReturnToTopButton() throws InterruptedException {
        Thread.sleep(2000);

        // Long defaultScroll= (Long) ((JavascriptExecutor) driver).executeScript(" return window.scrollY");
        //((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(1000);
        // System.out.println(defaultScroll);

        driver.findElement(By.xpath("//i[@class='bx bx-chevron-up']")).click();
        Thread.sleep(2000);

        Assert.assertTrue(Setup.isDisplayedElement("//a[@title='home']"));
        Thread.sleep(3000);

    }

    @Test(priority = 9)
    void VerifyingTheOptionAvailableWhenClickOnRentals() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Rentals')]")).click();
        WebElement Destination = driver.findElement(By.xpath("//form[@action='https://www.phptravels.net/rentals/search']//label[contains(text(),'Destination')]"));
        //Assert.assertTrue(Setup.isDisplayedElement("//label[@class='fr'][normalize-space()='Destination'"));
        Thread.sleep(1000);
        Assert.assertTrue(Setup.isDisplayedElement("//form[@action='https://www.phptravels.net/rentals/search']//label[contains(text(),'Destination')]"));
        Thread.sleep(1000);
        WebElement RentalType = driver.findElement(By.xpath("//label[normalize-space()='Rental Type']"));
        Thread.sleep(1000);
        Assert.assertTrue(Setup.isDisplayedElement("//label[normalize-space()='Rental Type']"));
        Thread.sleep(1000);
        WebElement Date = driver.findElement(By.xpath("//div[@class='col-lg-4 col-sm-12 col-xs-12']//label[@for='room-amount'][normalize-space()='Date']"));
        Thread.sleep(1000);
        Assert.assertTrue(Setup.isDisplayedElement("//div[@class='col-lg-4 col-sm-12 col-xs-12']//label[@for='room-amount'][normalize-space()='Date']"));
        Thread.sleep(1000);
        WebElement Adults = driver.findElement(By.xpath("//div[@id='rentals']//div[@class='col-lg-4 col-sm-12 col-xs-12']//div[2]//div[1]//label[1]"));
        Thread.sleep(1000);
        Assert.assertTrue(Setup.isDisplayedElement("//div[@id='rentals']//div[@class='col-lg-4 col-sm-12 col-xs-12']//div[2]//div[1]//label[1]"));
        Thread.sleep(1000);
        //WebElement[] Elements= new WebElement[4];


    }

    //Verify that Menu Section Should be displayed
    @Test(priority = 3)
    public void menu() {
        Assert.assertEquals(true, driver.findElement(By.xpath("//div[@id=\"mobileMenuMain\"]")).isDisplayed());
        //System.out.println("Menu option is present on the page");
        Setup.holdExecutionForSeconds(2);
    }


//    @Test(priority = 6)
//    void VerifyingMenuButtonFunctionality() throws InterruptedException {
//        driver.findElement(By.xpath("//a[@id='dropdownLangauge']")).click();
//        Assert.assertTrue(Setup.isDisplayedElement("//div[@class='dropdown-menu dropdown-menu-right show']"));
//        Thread.sleep(2000);
//    }

    @Test(priority = 7)
    void VerifyingHoverOnFeaturedTrips() throws InterruptedException {
        JavascriptExecutor Script = (JavascriptExecutor) driver;
        Script.executeScript("window.scrollBy(0,1050)");
        Thread.sleep(2000);
        Assert.assertTrue(Setup.isDisplayedElement("//figure[@class='featured-image-grid-item with-highlight']//img[@alt='Spectaculars Of The Nile…']"));
        Thread.sleep(2000);
        WebElement FeatureTrip = driver.findElement(By.xpath("//figure[@class='featured-image-grid-item with-highlight']//img[@alt='Spectaculars Of The Nile…']"));
        Actions action = new Actions(driver);
        action.moveToElement(FeatureTrip).perform();
        Thread.sleep(2000);
    }

    @Test(priority = 10)
    void VerifyingSearchButtonFunctionality() throws InterruptedException {
        driver.manage().deleteAllCookies();
        //Setting value into Location to search field///////////////////////
        //  String ParentURl=driver.getCurrentUrl();
        // System.out.println(ParentURl);
        // driver.get("https://www.phptravels.net/home//");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Flights']")).click();
        driver.findElement(By.xpath("//div[@id='s2id_location_to']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='s2id_location_to']//a[contains(@class,'select2-choice')]")));
        element.sendKeys("Delhi" + "\n");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='select2-drop']//ul[contains(@class,'select2-results')]"));
        driver.findElement(By.xpath("//div[@id='select2-drop']//li[1]//div[1]")).click();
////         WebDriverWait waitOne = new WebDriverWait(driver, 30);
////        WebElement PopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='lc-p8pi2n edvz03i0']")));
////        if (PopUp.isDisplayed())
////        {
////            driver.findElement(By.xpath("//button[@class='e1mwfyk10 lc-16yjqft e1m5b1js0']")).click();
////        }
//        Thread.sleep(3000);
////
////     /////////////Setting value into location from Search field////////////////////
        driver.findElement(By.xpath("//div[@id='s2id_location_from']")).click();
        WebElement Destination = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='select2-drop']//input[@type='text']")));
        Destination.sendKeys("Agra" + "\n");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='select2-drop']//li[1]//div[1]")).click();
        Thread.sleep(3000);
//
//    ////////Selecting the departure date from calendar//////////
        WebElement dateField = driver.findElement(By.xpath("//input[@id='FlightsDateStart']"));
        dateField.click();
        Thread.sleep(2000);
        dateField.findElement(By.xpath("//body/div[@id='datepickers-container']/div[9]/div[1]/div[1]/div[2]/div[9]")).click();
        Thread.sleep(3000);
        // dateField.click();
        Thread.sleep(3000);
        dateField.clear();
        dateField.sendKeys("2021-08-03");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(2000);
//        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//div[contains(@class,'col-lg-1 col-sm-12 col-xs-12')]")).click();
        driver.manage().deleteAllCookies();
        String newUrl = driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println(newUrl);
        String Expected = "https://www.phptravels.net/tpflight/search/AGR/DEL/oneway/economy/2021-08-09/1/0/";
        Thread.sleep(2000);
        Assert.assertEquals(Expected, newUrl);
        Thread.sleep(2000);
        driver.findElement(By.xpath("button[@class='btn btn-secondary btn-wide btn-toggle collapsed btn-sm btn-change-search']"));
        Thread.sleep(2000);
        Assert.assertTrue(Setup.isDisplayedElement("button[@class='btn btn-secondary btn-wide btn-toggle collapsed btn-sm btn-change-search']"));
//
//        System.out.println(url);
//        String ExpectedURL="https://www.phptravels.net/tpflight/search/AGR/DEL/oneway/economy/2021-08-09/1/0/";
//        Assert.assertEquals(ExpectedURL,url);
//         Thread.sleep(2000);

        // Assert.assertTrue(Setup.isDisplayedElement());
        //Thread.sleep(3000);

//    List<WebElement> datePickerDays = driver.findElements(By.tagName("td"));
//        datePickerDays.stream().filter(e->e.getText().equals("2021-08-03")).findFirst().get().click();
//        Thread.sleep(2000);
    }

    //    @Test(priority = 9)
//     void VerifyingTheMenuIsVisibleOrNot()
//    {
//      Assert.assertTrue(Setup.isDisplayedElement("//div[@class='navbar navbar-expand-lg']//a[@title='home']"));
//      Assert.assertTrue(Setup.isDisplayedElement("//nav[@class='main-nav-menu main-menu-nav navbar-arrow']//a[contains(text(),'company')]"));
//      Assert.assertTrue(Setup.isDisplayedElement("//div[@class='navbar-phone d-none d-lg-block o1']"));
//    }
//    @Test(priority = 19)
//    void VerifyingUserIsAbleToChangeLanguage() throws InterruptedException {
//        driver.findElement(By.xpath("//div[@class='dropdown dropdown-language']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[@id='tr']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@class='dropdown dropdown-language']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[@id='en']")).click();
//        Thread.sleep(2000);
//        Assert.assertFalse(Setup.isDisplayedElement("//a[@id='en']"));
//
//
//    }
    @Test(priority = 11)
    ///// verifying the Latest Blog is vsible or not
    public void LatestOnBlog() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Latest on blogs')]")).getText());
        String actual = driver.findElement(By.xpath("//h2[contains(text(),'Latest on blogs')]")).getText();
        String expected = "Latest On Blogs";
        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 15)

    public void language() {

        driver.findElement(By.id("dropdownLangauge")).click();
        Setup.holdExecutionForSeconds(2);
        driver.findElement(By.id("ru")).click();

    }

    @Test(priority = 6)
    public void verifylanguagefunctionality() {

        driver.findElement((By.xpath("//a[@id='dropdownLangauge']"))).click();
        Setup.holdExecutionForSeconds(2);
        Assert.assertTrue(Setup.isDisplayedElement("//div[@class='dropdown-menu dropdown-menu-right show']"));
        Setup.holdExecutionForSeconds(2);

    }


    @Test(priority = 2)
    public void verifyLogoDisplayedonLeftmostsideoftheWebsite() {
        driver.findElement(By.xpath("//div[@class='animated flash d-none d-md-block']"));
        Assert.assertTrue(Setup.isDisplayedElement("//div[@class='animated flash d-none d-md-block']"));
        Setup.holdExecutionForSeconds(1);
    }

    @Test(priority = 7)
    public void verifyMultipleFilterOptionsareDisplayed() {
        driver.get("https://www.phptravels.net/home//");
        driver.findElement(By.xpath("//a[normalize-space()='Hotels']")).click();
        Assert.assertTrue(Setup.isDisplayedElement("//a[normalize-space()='Hotels']"));
        Setup.holdExecutionForSeconds(1);
        driver.findElement(By.xpath("//a[normalize-space()='Flights']")).click();
        Assert.assertTrue(Setup.isDisplayedElement("//a[normalize-space()='Flights']"));
        Setup.holdExecutionForSeconds(1);
        driver.findElement(By.xpath("//a[normalize-space()='Boats']")).click();
        Assert.assertTrue(Setup.isDisplayedElement("//a[normalize-space()='Boats']"));
        Setup.holdExecutionForSeconds(1);
        driver.findElement(By.xpath("//a[normalize-space()='Rentals']")).click();
        Assert.assertTrue(Setup.isDisplayedElement("//a[normalize-space()='Rentals']"));
        Setup.holdExecutionForSeconds(1);
        driver.findElement(By.xpath("//a[normalize-space()='Tours']")).click();
        Assert.assertTrue(Setup.isDisplayedElement("//a[normalize-space()='Tours']"));
        Setup.holdExecutionForSeconds(1);
        driver.findElement(By.xpath("//a[normalize-space()='Cars']")).click();
        Assert.assertTrue(Setup.isDisplayedElement("//a[normalize-space()='Cars']"));
        Setup.holdExecutionForSeconds(1);
        driver.findElement(By.xpath("//a[normalize-space()='Visa']")).click();
        Assert.assertTrue(Setup.isDisplayedElement("//a[normalize-space()='Visa']"));
        Setup.holdExecutionForSeconds(1);
    }


    @Test(priority = 12)
    public void verifythatFeaturedTourSectionIsDisplayed() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        driver.findElement(By.xpath("//body/div[@class='body-inner']/div[@class='main-wrapper scrollspy-action']/div[4]/div[1]/div[1]"));
        driver.findElement(By.xpath("//*[text() = 'Featured Tours']"));
        Assert.assertTrue(Setup.isDisplayedElement("//h2[normalize-space()='Featured Tours']"));
        Setup.holdExecutionForSeconds(1);
    }

    @Test(priority = 13)
    void mousehoverFeatureTour() throws InterruptedException {
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1100)");
        Thread.sleep(2000);
        WebElement target = driver.findElement(By.xpath("//div[@class=\"col\"]//child::h5[contains(.,'Spectaculars Of The Nile 3 Nights')]"));
        actions.moveToElement(target).perform();
        Assert.assertTrue(true, String.valueOf(driver.findElement(By.xpath("//h5[normalize-space()='Spectaculars Of The Nile 3 Nights']/following-sibling::span[contains(.,'Book Now')]")).isDisplayed()));

    }

    @Test(priority = 1)
    public void BuyNow() {

        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[3]/a[1]")).click();
        Set<String> windows = driver.getWindowHandles(); //[suppose those are store time parent,child]
        Iterator<String> it = windows.iterator();
        String ParentWindow = it.next();
        String ChildWindow = it.next();

        driver.switchTo().window(ChildWindow);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.findElement(By.linkText("Demo")).getText());
        Assert.assertEquals(driver.getCurrentUrl(), "https://phptravels.com/order");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().window(ParentWindow);
        System.out.println(driver.getCurrentUrl());
    }

    @Test(priority = 8)
    public void color() {
        Setup.holdExecutionForSeconds(2);
        driver.findElement(By.xpath("//a[normalize-space()='Flights']")).click();
        Setup.holdExecutionForSeconds(2);
        WebElement flight = driver.findElement(By.xpath("//a[normalize-space()='Flights']/child::span[@class=\"ink animate\"]"));
        if (flight.isDisplayed()) {
            String i = "true";
            Assert.assertTrue(true, i);
            Assert.assertEquals("//a[@class=\"text-center flights active\"", flight.isDisplayed());
        }
    }

    //    @Test
//     void Destination() throws InterruptedException {
//        WebDriverWait wait2 = new WebDriverWait(driver, 10);
//        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[id='select2-drop'] input[type='text']")));
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("div[id='select2-drop'] input[type='text']")).click();
//        Thread.sleep(2000);
//       // WebElement Location=  driver.findElement(By.xpath("//div[@id='s2id_location_from']//div[@class='select2-drop select2-display-none select2-with-searchbox']//input[@type='text']"));
//
//
//
//
//    }
    @Test
    void LocationChecking() {

        WebElement element = driver.findElement(By.xpath("//div[@class='imagelogo']"));

        // System.out.println(element);
        Setup.holdExecutionForSeconds(2);
        Point location = element.getLocation();
        int x = location.getX();
        int y = location.getY();
        System.out.println("x axes = " + x + "y axes" + y);
        if (x == 10 && y == 10) {
            Assert.assertTrue(Setup.isDisplayedElement("//div[@class='imagelogo']"));
        }
    }

        @Test
        void colorChecking ()
        {
//            driver.findElement(By.xpath("//a[normalize-space()='Flights']")).click();
//            Setup.holdExecutionForSeconds(2);
//            Assert.assertTrue(Setup.isDisplayedElement("//div[@class='col-lg-1 col-sm-12 col-xs-12']//button[@type='submit']"));
             driver.findElement(By.xpath("//a[normalize-space()='Boats']")).click();
             Setup.holdExecutionForSeconds(2);
             Assert.assertTrue(Setup.isDisplayedElement(""));
        }


    }

//
















