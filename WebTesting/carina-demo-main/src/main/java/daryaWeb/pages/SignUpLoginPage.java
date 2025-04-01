package daryaWeb.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignUpLoginPage extends AbstractPage {

    @FindBy(xpath = "//b[contains(text(),'Enter Account Information')]")
    private ExtendedWebElement enterAccountInformationNotification;

    @FindBy(xpath = "//input[@type='password']")
    private ExtendedWebElement enterLogOutPassword;
    @FindBy(xpath = "//input[@id='first_name']")
    private ExtendedWebElement enterLogOutFirstName;
    @FindBy(xpath = "//input[@id='last_name']")
    private ExtendedWebElement enterLogOutLastName;
    @FindBy(xpath = "//input[@id='address1']")
    private ExtendedWebElement enterLogOutAddress1;
    @FindBy(xpath = "//input[@id='state']")
    private ExtendedWebElement enterLogOutState;
    @FindBy(xpath = "//input[@id='city']")
    private ExtendedWebElement enterLogOutCity;
    @FindBy(xpath = "//input[@id='zipcode']")
    private ExtendedWebElement enterLogOutZipcode;
    @FindBy(xpath = "//input[@id='mobile_number']")
    private ExtendedWebElement enterLogOutMobileNumber;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    private ExtendedWebElement createAccountButton;

    @FindBy(xpath = "//div[@class = 'col-sm-9 col-sm-offset-1']")
    private ExtendedWebElement accountCreatedNotification;
    @FindBy(xpath = "//a[@data-qa = 'continue-button']")
    private ExtendedWebElement continueButton;

    public SignUpLoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean setEnterAccountInformationNotification() {
        return enterAccountInformationNotification.isPresent();
    }

    public void setEnterLogOutPassword(String password) {
        enterLogOutPassword.type(password);
    }

    public void setEnterLogOutFirstName(String firstName) {
        enterLogOutFirstName.type(firstName);
    }

    public void setEnterLogOutLastName(String lastname) {
        enterLogOutLastName.type(lastname);
    }

    public void setEnterLogOutAddress1(String address1) {
        enterLogOutAddress1.type(address1);
    }

    public void setEnterLogOutState(String state) {
        enterLogOutState.type(state);
    }

    public void setEnterLogOutCity(String city) {
        enterLogOutCity.type(city);
    }

    public void setEnterLogOutZipcode(String zipcode) {
        enterLogOutZipcode.type(zipcode);
    }

    public void setEnterLogOutMobileNumber(String mobileNumber) {
        enterLogOutMobileNumber.type(mobileNumber);
    }

    public void clickCreateAccountButton() {
        createAccountButton.click();
    }

    public boolean isAccountCreatedNotificationVisible() {
        return accountCreatedNotification.isElementPresent();
    }
    public MainPage clickContinueButton(){
        continueButton.click();
        return  new MainPage(getDriver());
    }

}
