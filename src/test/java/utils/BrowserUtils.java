package utils;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class BrowserUtils {
    public static String getText(WebElement element) {
        return element.getText().trim();
    }

    public static void selectBy(WebElement location, String value, String methodName) {
        Select select = new Select(location);
        switch (methodName.toLowerCase()) {
            case "text":
                select.selectByVisibleText(value);
                break;
            case "value":
                select.selectByValue(value);
                break;
            case "index":
                select.selectByIndex(Integer.parseInt(value));
                break;
            default:
                Assert.fail("Please provide text,value or index for the method name");
        }
    }

    public static void clickWithJS(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);
    }

    public static void scrollWithJS(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
    }

    public static void switchWindow(WebDriver driver, String title) {

        Set<String> allPages = driver.getWindowHandles();
        for (String pages : allPages) {
            driver.switchTo().window(pages);
            if (driver.getTitle().contains(title)) {
                break;

            }
        }
    }

    public static void getScreenShot(WebDriver driver, String packageName) {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String location = System.getProperty("src/test/java/" + packageName + "/");

        try {
            FileUtils.copyFile(file, new File(location + System.currentTimeMillis()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

