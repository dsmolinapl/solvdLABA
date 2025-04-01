package daryaWeb.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends AbstractPage {

    @FindBy(xpath = "//button[@type='button']")
    private ExtendedWebElement firstProductDetails;
    @FindBy(xpath = "//button[contains(text(),'Continue Shopping')]")
    private ExtendedWebElement continueShoppingButton;
    @FindBy(xpath = "//li/a[@href='/view_cart']")
    private ExtendedWebElement clickCartWithItem;

    public void clickAddToCartButton(){
        firstProductDetails.click();
    }
    public void clickContinueShoppingButton(){
        continueShoppingButton.click();
    }

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }
    public void ClickCartWithItem() {
        clickCartWithItem.click();
    }
}
