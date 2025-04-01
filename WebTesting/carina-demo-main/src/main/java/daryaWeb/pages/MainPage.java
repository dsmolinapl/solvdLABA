package daryaWeb.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import daryaWeb.components.HeaderComponent;

public class MainPage  extends AbstractPage {

    @FindBy(xpath = "//header" )
    private HeaderComponent headerComponent;

    @FindBy(xpath = "//div[@class='col-sm-6']/h2['Full']")
private ExtendedWebElement mainPageNotification;

    @FindBy(xpath = "//p[contains(text(),'Соглашаюсь')]")
    private ExtendedWebElement mainButtonNotification;

    public MainPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.automationexercise.com/");
    }

    public HeaderComponent getHeaderComponent() {
        return headerComponent;
    }
    public boolean isPageOpened(){
        return mainPageNotification.isElementPresent();
    }
    public void clickMainButtonNotification(){
        mainButtonNotification.click();
    }

}
