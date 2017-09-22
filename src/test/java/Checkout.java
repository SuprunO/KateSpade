import Base.UserData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import siteElements.MiniBag;
import sitePages.Cart;
import sitePages.LoginPage;
import sitePages.PDP;
import sitePages.Shipping;

import static Base.BasePage.SiteURL;

/**
 * Created by alex on 22.09.2017.
 */
public class Checkout {
    WebDriver driver;
    PDP purchaseProduct;
    MiniBag miniBag;
    Cart cart;
    LoginPage loginPage;
    UserData userData;
    Shipping shipping;


    @BeforeTest
    public void StartUp() {
        System.setProperty("webdriver.gecko.driver", "C://gecko/geckodriver.exe");
        driver = new FirefoxDriver();

        driver.get(SiteURL + "/products/crawford-street-leopard-print-shellie/PXRU7990.html");
        driver.navigate().refresh();
        purchaseProduct = new PDP(driver);
        driver.manage().window().maximize();
        miniBag = new MiniBag(driver);
        cart = new Cart(driver);
        loginPage = new LoginPage(driver);
        shipping = new Shipping(driver);
        userData = new UserData();

    }

    @Test
    public void passCheckoutTest() {
        purchaseProduct.clickOnAddToBagButton();
        miniBag.clickOnViewBagCheckoutButton();
        cart.clickOnProceedToCheckoutButton();
        loginPage.clickOnGuestCheckoutButton();
        shipping.inputUserCredentials(userData);



    }
}
