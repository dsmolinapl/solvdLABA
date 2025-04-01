package daryaWebTestSite;

import com.zebrunner.carina.core.AbstractTest;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.webdriver.core.capability.impl.desktop.ChromeCapabilities;
import daryaWebSoftwaretestingSite.constants.UsersKey;
import daryaWebSoftwaretestingSite.pages.CreateAnAccountPage;
import daryaWebSoftwaretestingSite.pages.MainPage;
import daryaWebSoftwaretestingSite.pages.MyAccountPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 implements IAbstractTest, UsersKey {

    @Test
    @MethodOwner(owner = "dsmolina")
    public void creatingAccountWithCorrectValue(){
        WebDriver webDriver = getWebDriver();
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickAgreeButton();
        mainPage.getHeaderComponent1().clickCreateAnAccount();
        CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage(webDriver);
        createAnAccountPage.inputCreateFirstName(FIRST_NAME);
        createAnAccountPage.inputCreateLastName(LAST_NAME);
        createAnAccountPage.inputCreateEmailAddress(EMAIL_ADDRESS);
        createAnAccountPage.inputCreatePassword(PASSWORD);
        createAnAccountPage.inputCreateConfirmPassword(PASSWORD);
        createAnAccountPage.clickCreateAnAccountButton();
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        Assert.assertTrue(myAccountPage.isMyAccountNotification());
    }


    public WebDriver getWebDriver() {
        ChromeOptions options = new ChromeCapabilities().getCapability("chrome");
        options.addArguments("--disable-search-engine-choice-screen");
        return getDriver("Chrome Browser", options);
    }

}
