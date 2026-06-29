import org.testng.annotations.Test;
import org.testng.annotations.*;
public class Demo1
{
   @BeforeSuite
   public void beforesuit()
   {
       System.out.println("Before Suit");
   }
  @BeforeTest
  public void beforetest()
  {
      System.out.println("Before Test");
  }


   @BeforeClass
   public void beforeclass() {
       System.out.println("Before Class");
   }
   @BeforeMethod
   public void beforemethod()
   {
       System.out.println("Before Method");
   }

    @Test
    public void test1()
    {
        System.out.println("TestCAse1");
    }
    @Test
    public void test2()
    {
        System.out.println("TestCase2");
    }

    @AfterMethod
    public void aftermethod()
    {
        System.out.println("After Method");
    }
    @AfterClass
    public void afterclass()
    {
        System.out.println("AfterClass");
    }
    @AfterTest
    public void aftertest() {
        System.out.println("After TEst");
    }
    @AfterSuite
    public void aftersuit()
    {
        System.out.println("After Suit");
    }





}