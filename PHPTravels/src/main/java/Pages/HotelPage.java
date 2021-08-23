package Pages;

import Common.Predefined;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HotelPage extends CommonPage{
    public HotelPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public  void Hotel()
    {
    HotelButton.click();
        Assert.assertTrue(Predefined.isDisplayedElement("//h2[normalize-space()='SEARCH FOR BEST HOTELS']"));
    }
    public void HotelSearchFunctionality()
    {
        HotelButton.click();
       // driver.findElement(By.xpath("//a[normalize-space()='Hotels']")).click();
        WebElement element = driver.findElement(By.xpath("//span[@id='select2-hotels_city-container']"));
        element.click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@role='searchbox']")));
        element1.sendKeys("Delhi"+"\n");
        Predefined.holdExecutionForSeconds(2);
        element1.findElement(By.xpath("//li[normalize-space()='New Delhi,India']")).click();
        Predefined.holdExecutionForSeconds(2);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Predefined.holdExecutionForSeconds(2);
        Assert.assertTrue(Predefined.isDisplayedElement("//h2[normalize-space()='Search Hotels in new-delhi']"));

    }
}
