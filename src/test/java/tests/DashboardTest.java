package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.PageManager;
import TestData.testdata;

import java.time.Duration;

public class DashboardTest {

    @Test
    public void dashboardTest() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        PageManager pm = new PageManager(driver);

        // LOGIN
        pm.getLoginPage().login(testdata.username, testdata.password);

        // DASHBOARD
        pm.getDashboardPage().verifydashboard();
        pm.getDashboardPage().clickPIM();

        driver.quit();
    }
}