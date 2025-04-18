package qa.cashwise.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa.cashwise.pages.SignUpPage;
import utils.DriverHelper;

import static org.junit.Assert.assertEquals;

public class SignUpStepDef {
    WebDriver driver = DriverHelper.getDriver();
    SignUpPage signUpPage = new SignUpPage();
    @Given("the user is on the Sign Up page")
    public void the_user_is_on_the_sign_up_page() {
        driver.get("https://cashwise.us/main");
    }

    @When("the user signs up with email {string}, password {string}, and confirm password {string}")
    public void the_user_signs_up_with_email_password_and_confirm_password(String email, String password, String confirmPassword) {
        signUpPage.signUp(email, password, confirmPassword);
    }

    @Then("the user should be successfully signed up")
    public void the_user_should_be_successfully_signed_up() {
        // Add assertion for successful sign-up, adjust the success check as necessary
        String successMessage = driver.findElement(By.xpath("//span[@step='2']")).getText();
        assertEquals("02", successMessage);
    }

    @Then("the user should see email error message {string}")
    public void the_user_should_see_email_error_message(String expectedMessage) {
        String actualMessage = signUpPage.getEmailErrorMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    @Then("the user should see password error message {string}")
    public void the_user_should_see_password_error_message(String expectedMessage) {
        String actualMessage = signUpPage.getPasswordErrorMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    @Then("the user should see confirm password error message {string}")
    public void the_user_should_see_confirm_password_error_message(String expectedMessage) {
        String actualMessage = signUpPage.confirmPasswordErrorMessage();
        assertEquals(expectedMessage, actualMessage);
    }

}
