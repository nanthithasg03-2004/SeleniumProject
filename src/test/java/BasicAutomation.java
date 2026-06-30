import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

public class BasicAutomation extends BaseTest {

    @DataProvider(name = "empData")
    public Object[][] getData() {
        return new Object[][] {
                {"Admin", "admin123", "John", "David"},
                {"Admin", "admin123", "Peter", "Smith"}
        };
    }

    @Test(dataProvider = "empData")
    public void test(String user, String pass, String firstName, String lastName) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        Thread.sleep(3000);

        driver.findElement(By.name("username")).sendKeys(user);
        driver.findElement(By.name("password")).sendKeys(pass);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstName")).sendKeys(firstName);
        driver.findElement(By.name("lastName")).sendKeys(lastName);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        System.out.println("Employee Added: " + firstName + " " + lastName);

        driver.quit();
    }
}