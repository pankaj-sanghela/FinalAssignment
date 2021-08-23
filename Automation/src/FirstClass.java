import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstClass {
    @Test
    void Setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pankaj sanghela\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();

        obj.get("http://www.demoblaze.com");
        //obj.manage().window().fullscreen();
    }
    @Test
    void Testing()
    {
        System.out.println("I m in Testing Method");
    }
    @Test
    void testing_one()
    {
        System.out.println("I M in testing_one Method");
    }

}
