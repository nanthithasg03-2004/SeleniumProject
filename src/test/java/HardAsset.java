import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class HardAsset extends BaseTest
{
    @Test
        public void hardasset ()
        {
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.google.com");
            String title=driver.getTitle();
            String name="Selenium";
            String language="Java";
            String nullvalue=null;

            //1.assertEquals()
            Assert.assertEquals(title,"Google");
            System.out.println("Title Matched");

            //2.assertNotEquals
            Assert.assertNotEquals(title,"Chrome");
            System.out.println("Not Equal");

            //3.asserTrue
            Assert.assertTrue(10>5);
            System.out.println("asserttrue passed");

            //4.assertFail
            Assert.assertFalse(10<5);
            System.out.println("asserttrue failes");

            //5.assernull
            Assert.assertNull(nullvalue);
            System.out.println("Null passed");

            //6.assertNotnull
            Assert.assertNotNull(language);
            System.out.println("Null failed");

            //Assert.fail("Forced Fail");

            System.out.println("All Assertions Executed Successfully");



        }

    }


