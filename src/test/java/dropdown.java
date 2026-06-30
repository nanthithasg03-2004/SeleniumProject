import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import tests.BaseTest;

public class dropdown extends BaseTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // 2. Open website (sample dropdown site)
        driver.get("https://the-internet.herokuapp.com/dropdown");

        // 3. Locate dropdown element
        WebElement dropdownElement = driver.findElement(By.id("dropdown"));

        // 4. Create Select class object
        Select sobj = new Select(dropdownElement);

        boolean check=sobj.isMultiple();
        System.out.println(check);

        sobj.selectByVisibleText("Option 2");


        WebElement firstSelected = sobj.getFirstSelectedOption();
        System.out.println("First Selected: " + firstSelected.getText());

        WebElement wrappedElement = sobj.getWrappedElement();
        System.out.println("Wrapped element tag: " + wrappedElement.getTagName());









    }
}