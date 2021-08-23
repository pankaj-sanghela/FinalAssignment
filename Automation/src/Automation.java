import org.openqa.selenium.*;
import org.testng.annotations.*;


public class Automation extends Exception {

    @Test
    void Setup() {
        System.out.println("I m in Setup Method");
//             System.setProperty("webdriver.chrome.driver", "C:\\Users\\pankaj sanghela\\Downloads\\chromedriver_win32\\chromedriver.exe");
//             WebDriver obj = new ChromeDriver();
//
//             obj.get("http://www.demoblaze.com");
//             //obj.manage().window().fullscreen();
    }

    @Test
    void Testing() {
        System.out.println("I m in Testing Method");
    }

    @BeforeMethod
    void testing_one() {
        System.out.println("I M in testing_one Method");
    }

    @BeforeTest
    void BeforeTest() {
        System.out.println("I  M before test excution statement");
    }

    @AfterTest
    void AfterTest() {
        System.out.println("I M after test exceution statement");

    }
}

