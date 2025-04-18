package qa.blazedemo.stepDefinitions;

import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class BlazeHook {
    public WebDriver driver = DriverHelper.getDriver();
//    @Before
//    public void setup(){
//        driver.get(ConfigReader.readProperty("url"));
//    }
//    @After
//    public void tearDown(){
//        driver.quit();
//    }
}
