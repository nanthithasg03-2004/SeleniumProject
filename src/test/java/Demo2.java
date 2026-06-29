import org.testng.annotations.Test;
import org.testng.annotations.*;
public class Demo2
{



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
        System.out.println("t3");
    }
    @Test
    public void test2()
    {
        System.out.println("t4");
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






}