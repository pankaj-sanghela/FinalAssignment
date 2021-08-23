import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumOne {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://Users//pankaj sanghela//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver obj= new ChromeDriver();
        obj.get("https://www.demoblaze.com");
        //obj.quit();
         obj.findElement(By.xpath("//a[@id='signin2'])")).click();
         obj.findElement(By.id("Monitors")).click();

    }
}
