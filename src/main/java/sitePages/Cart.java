package sitePages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by alex on 22.09.2017.
 */
public class Cart extends BasePage {
    public Cart(WebDriver driver) {
        super(driver);
    }

    private String PROCEEDTOCHECKOUT = ".//*[@id='cart-items-form']/fieldset/div[2]/div[2]/div[1]/div/fieldset/button";

    public void clickOnProceedToCheckoutButton() {
        waiter(PROCEEDTOCHECKOUT);
        clickOnXpath(PROCEEDTOCHECKOUT);
    }

}
