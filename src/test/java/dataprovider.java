import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider
{
    @Test(dataProvider="LoginData", dataProviderClass=CustomDataProvider.class)
    public void detdata(String email,String pwd)
    {
        System.out.println(email+" "+pwd);
    }

}
