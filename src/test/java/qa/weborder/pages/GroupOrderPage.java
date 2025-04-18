package qa.weborder.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserUtils;




public class GroupOrderPage {
    WebDriver driver;
    public GroupOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//label[@for='GroupOrder']")
    WebElement groupOrderBox;

    @FindBy(css = "#getAddressNextButton")
    WebElement nextButton;
    @FindBy(id = "InviteNote")
    WebElement inviteNote;
    @FindBy(xpath = "//textarea[@name='InviteList']")
    WebElement inviteList;
    @FindBy(id = "ConfirmAddressID")
    WebElement myHouse;
    @FindBy(id = "addressPreview")
    WebElement address;
    @FindBy(id = "createGroupOrder")
    WebElement groupOrderButton;
    @FindBy(tagName = "h1")
    WebElement header;

    @FindBy(xpath = "//div[@id='mainColumn']//div[@class='col']")
    WebElement description;


    public void groupOrder() {

            groupOrderBox.click();
            nextButton.click();
    }

    public void inviteNote(String txt) {
        inviteNote.sendKeys(txt);
    }

    public void inviteList(String em1, String em2) {
        inviteList.sendKeys(em1, em2);
    }

    public void selectMyHouse(String addr) {
        Select select = new Select(myHouse);
        select.getFirstSelectedOption();
        Assert.assertTrue(address.getText().contains(addr));
    }
    public void groupOrd() {
        groupOrderButton.click();
    }

    public void validateHeader(String expectedHeader) {
        Assert.assertEquals( expectedHeader,BrowserUtils.getText(header));
    }

    public void validateDescription(String expectedDescription) {
        Assert.assertEquals( expectedDescription,BrowserUtils.getText(description));
    }
}
