package qa.cashwise.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigReader;
import utils.DriverHelper;

public class SignUpHook {public WebDriver driver = DriverHelper.getDriver();
    @Before
    public void setup(){
        driver.get(ConfigReader.readProperty("cashwiseURL"));
        WebElement signUpButton = driver.findElement(By.xpath("(//button[@type='button'])[2]"));  // Replace with your actual locator
        signUpButton.click();
    }
    @After
    public void tearDown(){
        //  driver.quit();
    }

}
