package sbca.pageobjects.contacts;

import sbca.pageobjects.framework.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewContactDialogBase extends BasePage {

    @FindBy(id = "carbon-dialog-title")
    private WebElement dialogTitle;

    @FindBy(css = "input[name='contact[company]']")
    private WebElement businessNameTextBox;

    @FindBy(css = "input[name='contact[company]'][class='carbon-textbox__input common-input__input--error common-input__input']")
    private WebElement businessNameTextBoxError;

    @FindBy(css = "input[name='contact[addresses_attributes][0][contacts_attributes][0][name]']")
    private WebElement contactNameTextBox;

    @FindBy(css = "input[name='contact[reference]']")
    private WebElement referenceTextBox;

    @FindBy(css = "input[name='contact[addresses_attributes][0][contacts_attributes][0][email]']")
    private WebElement emailTextBox;

    @FindBy(css = "input[name='contact[addresses_attributes][0][contacts_attributes][0][mobile]']")
    private WebElement mobileTextBox;

    @FindBy(css = "input[name='contact[addresses_attributes][0][contacts_attributes][0][telephone]']")
    private WebElement telephoneTextBox;

    @FindBy(css = "button[data-element='save']")
    private WebElement saveButton;

    @FindBy(css = "span[class='validation-summary__errors']")
    private WebElement validationSummaryErrors;

    @FindBy(css = "span[data-element='close']")
    private WebElement closeIcon;

    public CreateNewContactDialogBase(WebDriver driver) {
        super(driver);
    }

    public void setBusinessNameTextBox(String text) {
        enterTextInElement(businessNameTextBox, text);
    }

    public void setContactNameTextBox(String text) {
        enterTextInElement(contactNameTextBox, text);
    }

    public void setReferenceTextBox(String text) {
        enterTextInElement(referenceTextBox, text);
    }

    public void setEmailTextBox(String text) {
        enterTextInElement(emailTextBox, text);
    }

    public void setTelephoneTextBox(String text) {
        enterTextInElement(telephoneTextBox, text);
    }

    public void clickSaveButton() {
        clickElementWithJS(saveButton);
    }

    public void clickCloseIcon() {
        clickElementWithJS(closeIcon);
    }

    public void waitForSaveButtonToBeInvisible() {
        waitForElementToBeInvisible(saveButton);
    }

    public void waitForValidationSummaryErrorsToBeVisible() {
        waitForElementToBeVisible(validationSummaryErrors);
    }

}
