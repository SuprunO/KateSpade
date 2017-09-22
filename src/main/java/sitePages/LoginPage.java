package sitePages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by alex on 22.09.2017.
 */
public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    private String GUESTCHECKOUT = ".form-row.form-row-button>button";

    public void clickOnGuestCheckoutButton() {
        waiter(GUESTCHECKOUT);
        clickOn(GUESTCHECKOUT);
    }


}
