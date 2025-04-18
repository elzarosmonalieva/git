package qa.weborder.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class WeborderHook {
   public WebDriver driver = DriverHelper.getDriver();
//    @Before
//    public void setup(){
//        driver.get(ConfigReader.readProperty("Weborder_url"));
//    }
//    @After
//    public void tearDown(){
//      //  driver.quit();
//    }
}
