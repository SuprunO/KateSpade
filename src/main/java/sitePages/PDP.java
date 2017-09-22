package sitePages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by alex on 22.09.2017.
 */
public class PDP extends BasePage{

    //Locators
    private String ADDTOCARTBUTTON ="#add-to-cart";


    public PDP (WebDriver driver){super(driver);}

    public void clickOnAddToBagButton() {
        waiter(ADDTOCARTBUTTON);
        clickOn(ADDTOCARTBUTTON);
    }


}
