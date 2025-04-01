package daryaWebSoftwaretestingSite.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends AbstractPage {

    @FindBy(xpath = "//span[@class='base']")
    private ExtendedWebElement myAccountNotification;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean isMyAccountNotification(){
     return myAccountNotification.isElementPresent();
    }
}
