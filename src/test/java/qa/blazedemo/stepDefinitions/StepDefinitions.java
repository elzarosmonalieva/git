package qa.blazedemo.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import qa.blazedemo.pages.BlazedemoHomePage;
import utils.DriverHelper;

public class StepDefinitions {
    WebDriver driver = DriverHelper.getDriver();
    BlazedemoHomePage blazedemoHomePage = new BlazedemoHomePage(driver);
    @Given("user navigates to the {string}")
    public void user_navigates_to_the(String url) {
        driver.get(url);
    }
    @When("user choose {string} for departure")
    public void user_choose_for_departure(String departure) {
        blazedemoHomePage.chooseDepartureAndDestination(departure);
    }
    @When("user choose {string} for destination and click finding flight button")
    public void user_choose_for_destination_and_click_finding_flight_button(String destination) {
blazedemoHomePage.chooseDestination(destination);
    }
    @Then("user validate the header {string}")
    public void user_validate_the_header(String header) {
blazedemoHomePage.headerConfirm(header);
    }

    @When("User clicks the first Flight")
    public void user_clicks_the_first_flight() {
        blazedemoHomePage.clickFirstFlight();
    }
    @When("User provides personal information {string},{string},{string},{string},{string}")
    public void user_provides_personal_information(String name, String address, String city, String state, String zipcode) {
        blazedemoHomePage.providePersonalInformation(name, address, city, state, zipcode);
    }
    @When("User provides card information {string},{string},{string},{string},{string}")
    public void user_provides_card_information(String cardType, String cardNum, String month, String year, String nameOnCard) {
       blazedemoHomePage.provideCardInformation(cardType, cardNum, month, year, nameOnCard);
    }
    @When("User clicks remember me box and purchase flight button")
    public void user_clicks_remember_me_box_and_purchase_flight_button() {
        blazedemoHomePage.clickRememberMeAndPurchaseFlight();
    }
    @Then("User validates purchase message {string}")
    public void user_validates_purchase_message(String mess) {
        blazedemoHomePage.validatePurchaseMessage(mess);
    }

}
