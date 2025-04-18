package qa.weborder;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Screenshot {
    public static void getScreenShotForCucumber(WebDriver driver, Scenario scenario){
        Date currentDate=new Date();
        String screenShotFileName=currentDate.toString().replace(" ","-").replace(":","-");
        if(scenario.isFailed()){
            File screeShotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screeShotFile,new File("src/test/java/screenshot/"+screenShotFileName+".png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
