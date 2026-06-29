package pages;

import locators.dashboardlocator;
import org.openqa.selenium.WebDriver;

public class dashboardPage {

    WebDriver driver;

    public dashboardPage(WebDriver driver)
    {
        this.driver=driver;
    }


    public void verifydashboard() {
        boolean dashboard = driver.findElement(dashboardlocator.dashboardheading).isDisplayed();

        if (dashboard) {
            System.out.println("Dashboard Displayed");
        } else {
            System.out.println("Dashboard not Displayed");

        }
    }

    public void clickPIM()
    {
        driver.findElement(dashboardlocator.PIMmenu).click();
    }

}

