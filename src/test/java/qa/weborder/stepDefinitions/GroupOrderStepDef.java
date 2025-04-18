package qa.weborder.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import qa.weborder.pages.GroupOrderPage;
import qa.weborder.pages.WeboderLogInPage;
import utils.ConfigReader;
import utils.DriverHelper;

import java.io.ObjectInputFilter;

public class GroupOrderStepDef {
    WebDriver driver = DriverHelper.getDriver();
    WeboderLogInPage weboderLogInPage = new WeboderLogInPage(driver);
    GroupOrderPage groupOrderPage = new GroupOrderPage(driver);
    @When("User enters the username {string} and password {string}")
    public void user_enters_the_username_and_password(String usernm, String pass) {
        weboderLogInPage.signingIn(ConfigReader.readProperty("weborderUsername"),
        ConfigReader.readProperty("weborderPassword"));
    }
    @Then("User clicks group order box and next button")
    public void user_clicks_group_order_box_and_next_button() {
        groupOrderPage.groupOrder();
    }

    @Then("sends the word {string} on the Invitees section")
    public void sends_the_word_on_the_invitees_section(String text1) {
        groupOrderPage.inviteNote(text1);
    }

    @Then("sends the email address {string} and {string} to invite List")
    public void sends_the_email_address_and_to_invite_list(String email1, String email2) {
        groupOrderPage.inviteList(email1, email2);
    }

    @Then("User chooses delivery address My House and validate the address contains {string}")
    public void user_chooses_delivery_address_my_house_and_validate_the_address_contains(String string) {
        groupOrderPage.selectMyHouse(string);
    }

    @Then("User clicks create Group Order Button")
    public void user_clicks_create_group_order_button() {
        groupOrderPage.groupOrd();
    }

    @Then("User validate the header is {string}")
    public void user_validate_the_header_is(String header1) {
        groupOrderPage.validateHeader(header1);
    }

    @Then("validates the word contains {string} from description")
    public void validates_the_word_contains_from_description(String pending1) {
        groupOrderPage.validateDescription(pending1);
    }
}
