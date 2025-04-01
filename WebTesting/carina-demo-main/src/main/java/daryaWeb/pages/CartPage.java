package daryaWeb.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CartPage extends AbstractPage {
    private static final Logger LOGGER = LogManager.getLogger();

    @FindBy(xpath = "//b[contains(text(),'Cart is empty!')]")
    private ExtendedWebElement emptyCartPageNotification;

    @FindBy(xpath = "//td[@class='image']")
    private ExtendedWebElement fullyCartPageNotification;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    private ExtendedWebElement cartProductDescription;

    @FindBy(xpath = "//td[@class='cart_price']/p")
    private ExtendedWebElement cartProductPrice;

    @FindBy(xpath = "//button[@class='disabled']")
    private ExtendedWebElement cartProductQuantity;

    @FindBy(xpath = "//p[@class='cart_total_price']")
    private ExtendedWebElement totalPrice;

    @FindBy(xpath = "//a[contains(text(),'Proceed To Checkout')]")
    private ExtendedWebElement proceedToCheckoutButton;

    @FindBy(xpath = "//a[@href = '/login']/u[contains(text(),'Register / Login')]")
    private ExtendedWebElement registerLoginButton;


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean fullyCartPageNotification() {
        return fullyCartPageNotification.isElementPresent();
    }

    public boolean isEmptyCartPageOpened() {
        return emptyCartPageNotification.isElementPresent(10);
    }

    public String getCartProductDescription() {
        String productDescriptionInCart = cartProductDescription.getText();
        LOGGER.info("Product name in the Cart: " + productDescriptionInCart);
        return productDescriptionInCart;
    }

    public Integer getCartProductPrice() {
        String strCartProductPrice = cartProductPrice.getText().substring(4);
        Integer productPriceInCart = Integer.parseInt(strCartProductPrice.trim());
        LOGGER.info("Product price in the Cart: " + productPriceInCart);
        return productPriceInCart;
    }

    public Integer getCartProductQuantity() {
        String quantityProducts = cartProductQuantity.getText();
        Integer quantityProductsInCart = Integer.parseInt(quantityProducts);
        return quantityProductsInCart;
    }

    public Integer getCartTotalPrice() {
        String strTotalPrice = totalPrice.getText().substring(4);
        Integer totalPriceInCart = Integer.parseInt(strTotalPrice);
        return totalPriceInCart;
    }

    public void clickProceedToCheckoutButtonWithoutLogging() {
        proceedToCheckoutButton.click();
    }

    public CheckoutPage clickProceedToCheckoutButtonWithLogging() {
        proceedToCheckoutButton.click();
        return new CheckoutPage(getDriver());
    }

    public LoginPage clickRegisterLoginButton() {
        registerLoginButton.click();
        return new LoginPage(getDriver());
    }
}
