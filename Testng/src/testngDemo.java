import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngDemo {

@BeforeTest

 System.Setproperty

 void fun()
{
     System.out.println("i m in fun");
}
@AfterTest
 void fun1()
 {
     System.out.println("i m in fun2");

 }
 @BeforeMethod
  void fun3()
  {
      System.out.println("i m in fun3");
  }
}
