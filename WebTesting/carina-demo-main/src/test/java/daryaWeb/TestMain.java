package daryaWeb;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.webdriver.core.capability.impl.desktop.ChromeCapabilities;
import daryaWeb.constants.IUser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import daryaWeb.pages.*;

public class TestMain implements IAbstractTest, IUser {

    @Test()
    @MethodOwner(owner = "dsmolina")
    public void DownloadInvoiceAfterPurchaseOrder() {
        WebDriver webDriver = getWebDriver();
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickMainButtonNotification();
        Assert.assertTrue(mainPage.isPageOpened(), "Check 1. Main Page isn't opened!");



        ProductsPage productsPage = mainPage.getHeaderComponent().clickProductsButton();
        //   Assert.assertTrue(productsPage.isSearchProductPageOpened());
        productsPage.clickAddProductToCartButton();
        String productName = productsPage.getFirstProductName();
        CartPage cartPage = productsPage.clickViewCartButtonAfterAddingProduct();
        String productNameInCart = cartPage.getCartProductDescription();
        Assert.assertEquals(productName, productNameInCart, "Cart page isn't download correctly");
        cartPage.clickProceedToCheckoutButtonWithoutLogging();
        LoginPage loginPage = cartPage.clickRegisterLoginButton();


        loginPage.enterSingUpLoginName(LOG_OUT_FIRST_NAME).enterLoginEmail(LOG_OUT_EMAIL);
        SignUpLoginPage signUpLoginPage = loginPage.clickSignUpButton();
        Assert.assertTrue(signUpLoginPage.setEnterAccountInformationNotification(), "LogOut Page wasn't open");


        signUpLoginPage.setEnterLogOutPassword(LOG_OUT_PASSWORD);
        signUpLoginPage.setEnterLogOutFirstName(LOG_OUT_FIRST_NAME);
        signUpLoginPage.setEnterLogOutLastName(LOG_OUT_LAST_NAME);
        signUpLoginPage.setEnterLogOutAddress1(LOG_OUT_ADDRESS1);
        signUpLoginPage.setEnterLogOutState(LOG_OUT_STATE);
        signUpLoginPage.setEnterLogOutCity(LOG_OUT_CITY);
        signUpLoginPage.setEnterLogOutZipcode(LOG_OUT_ZIPCODE);
        signUpLoginPage.setEnterLogOutMobileNumber(LOG_OUT_MOBILE_NUMBER);
        signUpLoginPage.clickCreateAccountButton();
        Assert.assertTrue(signUpLoginPage.isAccountCreatedNotificationVisible());
        MainPage mainPage1 = signUpLoginPage.clickContinueButton();
        Assert.assertTrue(mainPage1.isPageOpened(), "MainPage is not open after LogOut");
    }


    @Test
    @MethodOwner(owner = "dsmolina")
    public void verifyProductInfoInCartIsCorrect() {
        WebDriver webDriver = getWebDriver();
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickMainButtonNotification();
        Assert.assertTrue(mainPage.isPageOpened(), "Check 1. Main Page isn't opened!");

        ProductsPage productsPage = mainPage.getHeaderComponent().clickProductsButton();
        Assert.assertTrue(productsPage.isSearchProductPageOpened());

        String productName = productsPage.getFirstProductName();
        Integer productPrice = productsPage.getFirstProductPrice();
        productsPage.clickAddProductToCartButton();

        CartPage cartPage = productsPage.clickViewCartButtonAfterAddingProduct();
        String productNameInCart = cartPage.getCartProductDescription();
        Integer productPriceInCart = cartPage.getCartProductPrice();
        Assert.assertEquals(productName, productNameInCart, "Names actual and in Cart are not equals");
        Assert.assertEquals(productPrice, productPriceInCart, "prices actual and in cart are not equals");
        Assert.assertEquals(cartPage.getCartProductQuantity(), 1, "Quantity is not correct");
        Integer multiplication = productPriceInCart * cartPage.getCartProductQuantity();
        Assert.assertEquals(cartPage.getCartTotalPrice(), multiplication, "Total price is not correct");
    }

    @Test
    @MethodOwner(owner = "dsmolina")
    public void verifyProductPriceInCartIsCorrect() {
        WebDriver webDriver = getWebDriver();
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickMainButtonNotification();
        Assert.assertTrue(mainPage.isPageOpened(), "Check 1. Main Page isn't opened!");

        ProductsPage productsPage = mainPage.getHeaderComponent().clickProductsButton();
        Assert.assertTrue(productsPage.isSearchProductPageOpened());

        String productName = productsPage.getFirstProductName();
        Integer productPrice = productsPage.getFirstProductPrice();
        productsPage.clickAddProductToCartButton();
        productsPage.clickContinueShoppingButton();
        productsPage.clickAddProductToCartButton();

        CartPage cartPage = productsPage.clickViewCartButtonAfterAddingProduct();
        String productNameInCart = cartPage.getCartProductDescription();
        Integer productPriceInCart = cartPage.getCartProductPrice();
        Assert.assertEquals(productName, productNameInCart, "Names actual and in Cart are not equals");
        Assert.assertEquals(productPrice, productPriceInCart, "prices actual and in cart are not equals");
        Assert.assertEquals(cartPage.getCartProductQuantity(), 2, "Quantity is not correct");
        Integer multiplication = productPriceInCart * cartPage.getCartProductQuantity();
        Assert.assertEquals(cartPage.getCartTotalPrice(), multiplication, "Total price is not correct");
    }


    @Test
    @MethodOwner(owner = "dsmolina")
    public void chekingIsProductNamesEmpty() {
        WebDriver webDriver = getWebDriver();
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickMainButtonNotification();
        Assert.assertTrue(mainPage.isPageOpened(), "Check 1. Main Page isn't opened!");

        ProductsPage productsPage = mainPage.getHeaderComponent().clickProductsButton();
        //ProductsPage productsPage = new ProductsPage(webDriver);
        Assert.assertTrue(productsPage.isSearchProductPageOpened());

        Assert.assertTrue(productsPage.isAllNamesNotEmpty());
    }

    @Test()
    @MethodOwner(owner = "dsmolina")
    public void loginUserWithCorrectEmailAndPassword() {
        WebDriver webDriver = getWebDriver();
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickMainButtonNotification();
        Assert.assertTrue(mainPage.isPageOpened(), "Check 1. Main Page isn't opened!");

        mainPage.getHeaderComponent().ClickSingUpLoginButton();
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.isVisibleLoginToYourAccount());//5

        loginPage.inputYourAccountEmailAddress(USER_EMAIL);
        loginPage.inputYourAccountPassword(USER_1_PASSWORD);
        loginPage.clickLoginButton();
        Assert.assertTrue(mainPage.getHeaderComponent().isLoggedInAsButton(USER_1_NAME));

        mainPage.getHeaderComponent().isDeleteAccountButton();
        Assert.assertTrue(mainPage.getHeaderComponent().isVisibleAccountDeletedNotification());
    }

    @Test()
    @MethodOwner(owner = "dsmolina")
    public void emptyCartCheck() {
        WebDriver webDriver = getWebDriver();
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.getHeaderComponent().clickCartButton();//Add Component
        CartPage cartPage = new CartPage(webDriver);
        //       pause(5);
        Assert.assertTrue(cartPage.isEmptyCartPageOpened());
    }

    @Test()
    @MethodOwner(owner = "dsmolina")
    public void openProductPage() {
        WebDriver webDriver = getWebDriver();
        MainPage mainPage = new MainPage(webDriver);
        mainPage.openURL("https://www.automationexercise.com/");
        mainPage.getHeaderComponent().clickProductsButton();
        ProductsPage productsPage = new ProductsPage(webDriver);
        Assert.assertTrue(productsPage.isSearchProductPageOpened());
    }

    @Test()
    @MethodOwner(owner = "dsmolina")
    public void addingFirstItemToCart() {
        WebDriver webDriver = getWebDriver();
        MainPage mainPage = new MainPage(webDriver);
        mainPage.openURL("https://www.automationexercise.com/");
        mainPage.getHeaderComponent().clickProductsButton();
        ProductsPage productsPage = new ProductsPage(webDriver);
        productsPage.clickFirstViewProductButton();
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.clickAddToCartButton();
        productDetailsPage.clickContinueShoppingButton();
        productDetailsPage.ClickCartWithItem();
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertTrue(cartPage.fullyCartPageNotification());
    }

    @Test()
    @MethodOwner(owner = "dsmolina")
    public void LoginInLoginPage() {
        WebDriver webDriver = getWebDriver();
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickMainButtonNotification();
        Assert.assertTrue(mainPage.isPageOpened(), "Check 1. Main Page isn't opened!");

        mainPage.getHeaderComponent().ClickSingUpLoginButton();
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.enterSingUpLoginName("Darya").enterLoginEmail("ara@gmail.com");
        SignUpLoginPage signUpLoginPage = loginPage.clickSignUpButton();
        Assert.assertTrue(signUpLoginPage.setEnterAccountInformationNotification());
    }

    public WebDriver getWebDriver() {
        ChromeOptions options = new ChromeCapabilities().getCapability("chrome");
        options.addArguments("--disable-search-engine-choice-screen");
        return getDriver("Chrome Browser", options);
    }
}
