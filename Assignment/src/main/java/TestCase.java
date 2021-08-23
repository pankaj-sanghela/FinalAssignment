
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase {

    WebDriver driver;

    @BeforeClass
    public void tearUp(){
        driver = Setup.LaunchBrowser("chrome");
    }

    @BeforeMethod
    public void launchWebsite(){
        driver.get("https://the-internet.herokuapp.com//");
        Assert.assertTrue(Setup.isDisplayedElement("//h1[normalize-space()='Welcome to the-internet']"));
    }
//
//    @Test(priority = 2)
//    public void verifyClickOnAddButtonIsAddingNewButton(){
//        driver.findElement(By.xpath("//a[text()='Add/Remove Elements']")).click();
//        Assert.assertTrue(Setup.isDisplayedElement("//button[normalize-space()='Add Element']"));
//        Setup.holdExecutionForSeconds(1);
//        driver.findElement(By.xpath("//button[normalize-space()='Add Element']")).click();
//        Setup.holdExecutionForSeconds(1);
        Assert.assertTrue(Setup.isDisplayedElement("//button[normalize-space()='Delete']"));
//    }
//
//    @Test(priority = 3)
//    public void verifyClickOnDeleteButtonIsRemovingButton(){
//        driver.findElement(By.xpath("//a[text()='Add/Remove Elements']")).click();
//        Assert.assertTrue(Setup.isDisplayedElement("//button[normalize-space()='Add Element']"));
//        Setup.holdExecutionForSeconds(1);
//        driver.findElement(By.xpath("//button[normalize-space()='Add Element']")).click();
//        Setup.holdExecutionForSeconds(1);
//        driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
//        Setup.holdExecutionForSeconds(1);
//        Assert.assertFalse(Setup.isDisplayedElement("//button[normalize-space()='Delete']"));
//    }
//
//    @Test(priority = 4)
//    public void dragAndDropElement(){
//        driver.findElement(By.xpath("//a[normalize-space()='Drag and Drop']")).click();
//        Setup.holdExecutionForSeconds(1);
//        WebElement source = driver.findElement(By.xpath("//div[@id='column-a']"));
//        WebElement target = driver.findElement(By.id("column-b"));
//        Actions builder = new Actions(driver);
////        Action dragAndDrop = builder.clickAndHold(target).moveToElement(source).release(target).build();
////        dragAndDrop.perform();
//        builder.dragAndDrop(source, target).build().perform();
//        Setup.holdExecutionForSeconds(3);
//    }
   @Test (priority = 1)
    public void CheckboxClicking() throws InterruptedException {
       driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
       driver.findElement(By.xpath("//form[@id ='checkboxes']/child::input[2]")).click();
       Thread.sleep(2000);
       WebElement element = driver.findElement(By.xpath("//form[@id='checkboxes']/child::input[1]"));
       element.click();
       System.out.println("Checkbox is selected");
   }

//    @Test(priority = 2)
//   void DropdownFunction() throws InterruptedException {
//       driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
//        Select obj=new Select(driver.findElement(By.id("dropdown")));
//        Thread.sleep(2000);
//        obj.selectByVisibleText("Option 1");
//
//        Thread.sleep(2000);
//        obj.selectByIndex(2);
//        Thread.sleep(2000);
//
//   }
//   @Test (priority = 1)
//    void FileUploadImplement() throws InterruptedException {
//         driver.findElement(By.xpath("//a[text()='File Upload']")).click();
//         WebElement ChooseFileToUpload;
//        ChooseFileToUpload =driver.findElement(By.id("file-upload"));
//        Thread.sleep(2000);
//        ChooseFileToUpload.sendKeys("C:\\Users\\pankaj sanghela\\Pictures\\Screenshots\\Screenshot (21).png");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id='file-submit']")).click();
//        Thread.sleep(1000);
//        System.out.println("File Uploaded successful");
//    }
     @Test
     void RedirectMethod() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Redirect Link']")).click();
         driver.findElement(By.xpath("//a[@id='redirect']")).click();
         Thread.sleep(2000);
     }



//       if (element.isSelected())
//       {
//           System.out.println("Checkbox is selected");
//       }

    @AfterClass
    public void tear(){
        driver.quit();
    }

}