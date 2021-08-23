package Pages;

import CommonMethods.Predefined;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchButton extends CommonPage{
    public SearchButton(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@id='s2id_location_to']")
    WebElement LocationTo;
  //  @FindBy(xpath = "//div[@id='select2-drop']//li[1]//div[1]")
    @FindBy(xpath = "//div[@id='select2-drop']//li[1]//div[1]")
    WebElement SelectingDelhi;
    @FindBy(xpath = "//div[@id='s2id_location_from']")
    WebElement LocationFrom;
    @FindBy(xpath = "//div[@id='select2-drop']//li[1]//div[1]")
    WebElement SelectingAgra;

    @FindBy(xpath = "//input[@id='FlightsDateStart']")
    WebElement DateField;
    @FindBy(xpath = "//body/div[@id='datepickers-container']/div[9]/div[1]/div[1]/div[2]/div[11]")
    WebElement SelectingDate;
    @FindBy(xpath = "//div[contains(@class,'col-lg-1 col-sm-12 col-xs-12')]")
    WebElement SearchButton;
    public void CheckingSearchFunctionality() {

        FlightButton.click();
        LocationTo.click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='s2id_location_to']//a[contains(@class,'select2-choice')]")));
        element.sendKeys("Delhi"+"\n");
        Predefined.holdExecutionForSeconds(2);
       // driver.findElement(By.xpath("//div[@id='select2-drop']//ul[contains(@class,'select2-results')]"));
        SelectingDelhi.click();

        //Location From data
        LocationFrom.click();
        WebElement Destination = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='select2-drop']//input[@type='text']")));
        Destination.sendKeys("Agra"+"\n");
       Predefined.holdExecutionForSeconds(2);
        SelectingAgra.click();
        Predefined.holdExecutionForSeconds(2);

        //Date field data
        DateField.click();
        SelectingDate.click();
      // driver.findElement(By.xpath("//body/div[@id='datepickers-container']/div[9]/div[1]/div[1]/div[2]/div[11]")).click();
       Predefined.holdExecutionForSeconds(2);

       SearchButton.click();
        String CurrentURl= driver.getCurrentUrl();
       Predefined.holdExecutionForSeconds(2);
       String ExpectedURl="https://www.phptravels.net/tpflight/search/AGR/DEL/oneway/economy/2021-08-11/1/0/";
       Assert.assertEquals(ExpectedURl,CurrentURl);
       Predefined.holdExecutionForSeconds(2);





    }

    }

