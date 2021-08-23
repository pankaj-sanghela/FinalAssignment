package Automation;

//import org.hamcrest.core.Is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

//import static org.hamcrest.MatcherAssert.assertThat;
import static org.openqa.selenium.By.*;

public class First {


    @BeforeTest
    void MethodOne() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//pankaj sanghela//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://the-internet.herokuapp.com/");
        driver.get("https://demoblaze.com/");


        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),'Add/Remove Elements')]"));
         driver.findElement(By.id("signin2")).click();
         WebElement txt=driver.findElement(By.xpath("//input[@id='sign-username']"));
        txt.sendKeys("pankaj123@");
        WebElement txt_2= driver.findElement(By.xpath("//input[@id='sign-password']"));
        txt_2.sendKeys("Pankaj123@");
        // System.out.println("Test could be failed");
        driver.findElement(linkText("Laptops")).click();
        Thread.sleep(1000);
        driver.findElement(xpath("//a[contains(text(),\"Sony vaio i7\")]")).click(); ////h2[normalize-space()='Samsung galaxy s6']
        System.out.println("Pass till laptop view");
        Thread.sleep(1000);
        driver.findElement(xpath("//a[@onclick=\"addToCart(9)\" ]")).click(); // used attributes and its value
        Thread.sleep(1000);
        driver.switchTo().alert().getText();
        Thread.sleep(3000);

        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.findElement(By.id("cartur")).click();


        driver.navigate().to(" https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();

        //  driver.findElement(By.linkText("Place order")).click();
        }
}
//         driver.findElement(By.linkText("Sony vaio i5")).click();
//         Thread.sleep(1000);
//         driver.findElement(By.linkText("Add to cart")).click();
//         Thread.sleep(1000);



