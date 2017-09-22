package siteElements;

import Base.BasePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by alex on 22.09.2017.
 */
public class MiniBag extends BasePage {
    //Locators

    private String VIEWBAGCHECKOUT =".button.mini-cart-link-cart";

    public MiniBag(WebDriver driver){super(driver);}

    public void clickOnViewBagCheckoutButton() {
        waiter(VIEWBAGCHECKOUT);
        clickOn(VIEWBAGCHECKOUT);
    }



}
