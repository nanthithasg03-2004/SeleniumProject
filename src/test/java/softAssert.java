import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import tests.BaseTest;

public class softAssert extends BaseTest
{
    @Test
    public void softassert()
    {
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.google.com");
       String title=driver.getTitle();

       SoftAssert soft=new SoftAssert();

       soft.assertEquals(title,"Google");
       System.out.println("Equals done");
       soft.assertNotEquals(10,20);
        System.out.println("Not Equals done");
       soft.assertTrue(10>5);
        System.out.println("True done");
       soft.assertFalse(10<5);
        System.out.println("False done");
       //soft.fail("HAI");

       soft.assertAll();
    }

}
