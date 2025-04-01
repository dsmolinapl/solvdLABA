package daryaWebSoftwaretestingSite.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import daryaWeb.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccountPage extends AbstractPage {

    @FindBy(xpath = "//input[@id='firstname']")
    private ExtendedWebElement createFirstName;

    @FindBy(xpath = "//input[@id='lastname']")
    private ExtendedWebElement createLastName;

    @FindBy(xpath = "//input[@id='email_address']")
    private ExtendedWebElement createEmailAddress;

    @FindBy(xpath = "//input[@id='password']")
    private ExtendedWebElement createPassword;

    @FindBy(xpath = "//input[@id='password-confirmation']")
    private ExtendedWebElement createConfirmPassword;

    @FindBy(xpath = "//button[@class='action submit primary']")
    private ExtendedWebElement createAnAccountButton;

    public CreateAnAccountPage(WebDriver driver) {
        super(driver);
    }
    public void inputCreateFirstName(String clientFirstName){
        createFirstName.type(clientFirstName);
    }
    public void inputCreateLastName(String clientLastName){
        createLastName.type(clientLastName);
    }
    public void inputCreateEmailAddress(String clientEmailAddress){
        createEmailAddress.type(clientEmailAddress);
    }
    public void inputCreatePassword(String clientPassword){
        createPassword.type(clientPassword);
    }
    public void inputCreateConfirmPassword(String clientPassword){
        createConfirmPassword.type(clientPassword);
    }
    public MyAccountPage clickCreateAnAccountButton(){
        createAnAccountButton.click();
        return new MyAccountPage(getDriver());
    }

}
