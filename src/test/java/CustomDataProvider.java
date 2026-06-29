import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name = "LoginData")
    public Object[][] getData() {
        Object[][] data = {{"abc@gmail.com", "abc"}, {"xyz@gmail.com", "xyz"}, {"sns@gmail.com", "sns"}};
        return data;


    }
    }

