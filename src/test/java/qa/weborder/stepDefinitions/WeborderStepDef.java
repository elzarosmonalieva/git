package qa.weborder.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import qa.weborder.pages.WeboderLogInPage;
import utils.DriverHelper;

public class WeborderStepDef {

    WebDriver driver = DriverHelper.getDriver();
    WeboderLogInPage weboderLogInPage = new WeboderLogInPage(driver);
//    @When("User enters the username {string} and password {string}")
//    public void user_enters_the_username_and_password(String usernm, String pass) {
//        weboderLogInPage.signingIn(usernm, pass);
//    }
    @Then("User clicks the remember me checkbox and signs in")
    public void user_clicks_the_remember_me_checkbox_and_signs_in() {
        weboderLogInPage.rememberMeCheckbox();
    }
    @Then("validates the title {string}")
    public void validates_the_title(String tit) {
        Assert.assertEquals(tit, driver.getTitle());
    }
    @When("user enters the correct username {string} and wrong password {string}")
    public void user_enters_the_correct_username_and_wrong_password(String correctUsernm, String wrngPass) {
weboderLogInPage.signingIn(correctUsernm, wrngPass);
    }
    @Then("validates the message {string}")
    public void validates_the_message(String errorMess) {
        weboderLogInPage.errorMssg(errorMess);
    }
    @When("user enters the wrong username {string} and correct password {string}")
    public void user_enters_the_wrong_username_and_correct_password(String wrngUsrnm, String crrctPass) {
weboderLogInPage.signingIn(wrngUsrnm, crrctPass);
    }
    @When("user enters the empty username {string} and empty password {string}")
    public void user_enters_the_empty_username_and_empty_password(String emptyUsrnm, String emptyPass) {
weboderLogInPage.signingIn(emptyUsrnm, emptyPass);
    }


}
