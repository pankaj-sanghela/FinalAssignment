package Pages;

import Common.Predefined;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Tour extends  CommonPage{
    public Tour(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void TourSearch()
    {
        driver.findElement(By.xpath("//a[normalize-space()='Tours']")).click();
        WebElement element = driver.findElement(By.xpath("//span[@id='select2-tours_city-container']"));
        element.click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@role='searchbox']")));
        element1.sendKeys("Delhi"+"\n");
        Predefined.holdExecutionForSeconds(2);
        element1.findElement(By.xpath("//li[normalize-space()='New Delhi,India']")).click();
        Predefined.holdExecutionForSeconds(2);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Predefined.holdExecutionForSeconds(2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space()='Search Tours in new-delhi']")));
        Assert.assertTrue(Predefined.isDisplayedElement("//h2[normalize-space()='Search Tours in new-delhi']"));

    }
}
