package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LatestBlog extends CommonPage{
    public LatestBlog(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//h2[contains(text(),'Latest on blogs')]")
    WebElement LatestBlogButton;

    public void LatestOnBlog()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String Word=LatestBlogButton.getText();
        String expected = "Latest On Blogs";
        Assert.assertEquals(Word, expected);
    }
}
