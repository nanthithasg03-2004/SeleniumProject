import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class priorityanddependsOnMethod extends BaseTest {

    WebDriver driver;

    // 1. OPEN BROWSER (FIRST)
    @Test(priority = 1)
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Browser opened");
    }

    // 2. LOGIN (depends on openBrowser)
    @Test(priority = 2, dependsOnMethods = "openBrowser")
    public void login() {

        driver.get("https://www.google.com");

        String title = driver.getTitle();
        System.out.println("Login step - page opened");

        Assert.assertEquals(title, "Google");  // validation
        System.out.println("Login successful");
    }

    // 3. SEARCH PRODUCT (depends on login)
    @Test(priority = 3, dependsOnMethods = "login")
    public void searchProduct() {

        System.out.println("Product searched");
        Assert.assertTrue(true);
    }

    // 4. ADD TO CART (depends on searchProduct)
    @Test(priority = 4, dependsOnMethods = "searchProduct")
    public void addToCart() {

        System.out.println("Product added to cart");
        Assert.assertTrue(true);
    }

    // 5. LOGOUT (depends on addToCart)
    @Test(priority = 5, dependsOnMethods = "addToCart")
    public void logout() {

        System.out.println("Logout successful");

        driver.quit();
    }
}