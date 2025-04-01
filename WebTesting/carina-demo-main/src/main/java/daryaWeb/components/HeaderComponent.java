package daryaWeb.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import daryaWeb.pages.ProductsPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderComponent extends AbstractUIObject {

    @FindBy(xpath = ".//a[@href='/view_cart' and contains(text(),'Cart')]")
    private ExtendedWebElement cartButton;

    @FindBy(xpath = ".//a[@href='/products']")
    private ExtendedWebElement productsButton;

    @FindBy(xpath = ".//a[@href='/login']")
    private ExtendedWebElement clickSingUpLoginButton;

    // @FindBy(xpath="//i[@class='fa fa-user']")
    @FindBy(xpath = "//a[text() = ' Logged in as ']/b[text() = '%s']")
    private ExtendedWebElement loggedInAsButton;

    @FindBy(xpath = "//a[@href='/delete_account']")
    private ExtendedWebElement clickDeleteAccountButton;

    @FindBy(xpath = "//b[contains(text(),'Account Deleted!')]")
    private ExtendedWebElement visibleAccountDeletedNotification;

    public HeaderComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public ProductsPage clickProductsButton() {
        productsButton.click();
        return new ProductsPage(getDriver());
    }

    public void ClickSingUpLoginButton() {
        clickSingUpLoginButton.click();
    }

    public boolean isLoggedInAsButton(String name) {
        return loggedInAsButton.format(name).isElementPresent(5);
    }

    public void isDeleteAccountButton() {
        clickDeleteAccountButton.click();
    }

    public boolean isVisibleAccountDeletedNotification() {
        return visibleAccountDeletedNotification.isElementPresent();
    }
}
