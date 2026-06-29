package pages;

import locators.pimlocator;
import org.openqa.selenium.WebDriver;

public class PIMPage {

    WebDriver driver;

    public PIMPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void clickaddemployee()
    {
        driver.findElement(pimlocator.addemployee).click();
    }

    public void addemployee(String firstname,String lastname)
    {
        driver.findElement(pimlocator.firstname).sendKeys(firstname);
        driver.findElement(pimlocator.lastname).sendKeys(lastname);
        driver.findElement(pimlocator.firstname).sendKeys(firstname);
        driver.findElement(pimlocator.savebtn).click();
    }





}
