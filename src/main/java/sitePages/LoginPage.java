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
    private String GUESTCHECKOUT = ".//*[@id='primary']/div[1]/div[2]/div/div/form/fieldset/div/button";

    public void clickOnGuestCheckoutButton() {
        clickOnXpath(GUESTCHECKOUT);
    }


}
