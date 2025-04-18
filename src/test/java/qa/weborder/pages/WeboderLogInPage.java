package qa.weborder.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WeboderLogInPage {
    public WeboderLogInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    WebElement email;
    @FindBy(name = "Password")
    WebElement password;
    @FindBy(id = "RememberMe")
    WebElement checkbox;
    @FindBy(css = "button[type='submit']")
    WebElement signInButton;
    @FindBy(tagName = "title")
    WebElement header;
    @FindBy(xpath = "//div[@class='mt-2 alert alert-danger']")
    WebElement errorMessage;



    public void signingIn(String usrnm, String psswrd) {
        email.clear();
        email.sendKeys(usrnm);
        password.clear();
        password.sendKeys(psswrd);

    }

    public void rememberMeCheckbox() {
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
        if (checkbox.isSelected()) {
            System.out.println("it is already selected");
        }
        signInButton.click();
    }
    public void errorMssg(String mess) {
        Assert.assertEquals(mess, errorMessage.getText().trim());
    }



}

