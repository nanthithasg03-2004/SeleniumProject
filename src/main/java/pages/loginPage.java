package pages;
import locators.loginlocator;
import org.openqa.selenium.WebDriver;

public class loginPage {
    WebDriver driver;

    public loginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void login(String username,String password)
    {
        driver.findElement(loginlocator.username).sendKeys(username);
        driver.findElement(loginlocator.password).sendKeys(password);
        driver.findElement(loginlocator.loginbtn).click();
    }
}
