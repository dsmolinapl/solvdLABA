package daryaWebSoftwaretestingSite.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import daryaWeb.components.HeaderComponent;
import daryaWebSoftwaretestingSite.components.HeaderComponent1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage {

@FindBy(xpath = "//div[@class='panel wrapper']")
private HeaderComponent1 headerComponent1;

@FindBy(xpath = "//button[@id='accept-btn']")
private ExtendedWebElement agreeButton;

    public MainPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://magento.softwaretestingboard.com/");
    }

    public HeaderComponent1 getHeaderComponent1(){
        return headerComponent1;
    }

    public void clickAgreeButton(){
        agreeButton.click();
    }
}
