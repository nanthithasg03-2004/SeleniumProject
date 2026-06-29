package pages;

import org.openqa.selenium.WebDriver;

public class PageManager {

    WebDriver driver;

    private loginPage loginpage;
    private dashboardPage dashboardpage;
    private PIMPage PIMpage;

    public PageManager(WebDriver driver) {
        this.driver = driver;
    }

    public loginPage getLoginPage() {
        if (loginpage == null) {
            loginpage = new loginPage(driver);
        }
        return loginpage;
    }

    public dashboardPage getDashboardPage() {
        if (dashboardpage == null) {
            dashboardpage = new dashboardPage(driver);
        }
        return dashboardpage;
    }

    public PIMPage getPIMPage() {
        if (PIMpage == null) {
            PIMpage = new PIMPage(driver);
        }
        return PIMpage;
    }
}