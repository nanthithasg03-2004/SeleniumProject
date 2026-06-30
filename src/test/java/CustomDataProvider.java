import org.testng.annotations.DataProvider;
import tests.BaseTest;

public class CustomDataProvider extends BaseTest {
    @DataProvider(name = "LoginData")
    public Object[][] getData() {
        Object[][] data = {{"abc@gmail.com", "abc"}, {"xyz@gmail.com", "xyz"}, {"sns@gmail.com", "sns"}};
        return data;


    }
    }

