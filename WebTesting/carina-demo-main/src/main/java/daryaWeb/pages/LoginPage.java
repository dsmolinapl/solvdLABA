package daryaWeb.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    private ExtendedWebElement singUpLoginName;  //aryasmolhfdl@gmail.com - 12345zxc - W

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private ExtendedWebElement singUpLoginEmail;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private ExtendedWebElement signUpButton;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    private ExtendedWebElement inputYourAccountEmail;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    private ExtendedWebElement inputYourAccountPassword;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "//i[@class='fa fa-user']")
    private ExtendedWebElement loggedInAs;

    @FindBy(xpath = "//div[@class='login-form']/h2['Login to your account']")
    private ExtendedWebElement visibleLoginToYourAccount;

    @FindBy(xpath = "//a[contains(text(),' Delete Account')]")
    private ExtendedWebElement visibleDeleteAccountButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage enterSingUpLoginName(String name) {
        singUpLoginName.type(name);
        return this;
    }

    public void enterLoginEmail(String loginEmail) {
        singUpLoginEmail.type(loginEmail);
    }

    public SignUpLoginPage clickSignUpButton() {
        signUpButton.click();
        return new SignUpLoginPage(getDriver());
    }
    public void inputYourAccountEmailAddress(String accountEmail){
        inputYourAccountEmail.type(accountEmail);
    }
    public void inputYourAccountPassword(String accountPassword){
        inputYourAccountPassword.type(accountPassword);
    }
    public MainPage clickLoginButton(){
        loginButton.click();
        return new MainPage(getDriver());
    }

    public boolean isVisibleLoginToYourAccount(){
        return visibleLoginToYourAccount.isElementPresent();
    }
public void isVisibleDeleteAccountButton(){
    visibleDeleteAccountButton.click();
}


}
