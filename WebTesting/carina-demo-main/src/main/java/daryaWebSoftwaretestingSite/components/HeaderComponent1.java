package daryaWebSoftwaretestingSite.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderComponent1 extends AbstractUIObject {

@FindBy(xpath = "//a[@class='level-top ui-corner-all']")
private ExtendedWebElement whatsNewButton;

@FindBy(xpath = "//a[contains(text(),' Sign In    ')]")
private ExtendedWebElement signInPage;

@FindBy(xpath = "//a[contains(text(),'Create an Account')]")
private ExtendedWebElement createAnAccount;

    public HeaderComponent1(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickWhatsNewButton(){
        whatsNewButton.click();
    }
    public void clickSignInButton(){
        signInPage.click();
    }
    public void clickCreateAnAccount(){
        createAnAccount.click();
    }


}
