package daryaWeb.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ProductsPage extends AbstractPage {

    private static final Logger LOGGER = LogManager.getLogger();

    @FindBy(xpath = "//a[@href='/products']") //Locator
    private ExtendedWebElement searchProductButton;
    @FindBy(xpath = "//a[@href='/product_details/1']")
    private ExtendedWebElement firstViewProductButton;

    @FindBy(xpath = "//div[@class='productinfo text-center']/p")
    private List<ExtendedWebElement> productNames;

    @FindBy(xpath = "//a[@data-product-id='1']")
    private ExtendedWebElement addProductToCartButton;
    @FindBy(xpath = "//a[@href='/view_cart']/u")
    private ExtendedWebElement viewCartButton;

    @FindBy(xpath = "(//div[contains(@class, 'productinfo')]/p)[1]")
    private ExtendedWebElement product1Name;

    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    private ExtendedWebElement continueShoppingButton;

    @FindBy(xpath = "(//div[@class='productinfo text-center']/h2)[1]")
    private ExtendedWebElement FirstProductPrice;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSearchProductPageOpened() {
        return searchProductButton.isElementPresent();
    }

    public void clickFirstViewProductButton() {
        firstViewProductButton.click();
    }

    public boolean isAllNamesNotEmpty() {
        for (ExtendedWebElement productName : productNames) {
            String currentProductName = productName.getText();
            LOGGER.info(currentProductName);
            if (currentProductName.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public void clickAddProductToCartButton() {
        addProductToCartButton.click();
    }

    public CartPage clickViewCartButtonAfterAddingProduct() {
        viewCartButton.click();
        return new CartPage(getDriver());
    }

    public String getFirstProductName() {
        String productName = product1Name.getText();
        LOGGER.info("Product name: " + productName);
        return productName;
    }

    public Integer getFirstProductPrice() {
        String strProductPrice = FirstProductPrice.getText().substring(4);
        Integer productPrice = Integer.parseInt(strProductPrice.trim());
        LOGGER.info(productPrice);
        return productPrice;
    }

    public void clickContinueShoppingButton(){
        continueShoppingButton.click();
    }


}
