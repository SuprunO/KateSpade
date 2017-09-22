package sitePages;

import Base.BasePage;
import Base.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by alex on 22.09.2017.
 */
public class Shipping extends BasePage {

    public Shipping(WebDriver driver) {
        super(driver);
    }

    private String FIRSTNAME = "#dwfrm_singleshipping_shippingAddress_addressFields_firstName";
    private String LASTNAME = "#dwfrm_singleshipping_shippingAddress_addressFields_lastName";
    private String ADDRESS = "#dwfrm_singleshipping_shippingAddress_addressFields_address1";
    private String ZIPCODE = "#dwfrm_singleshipping_shippingAddress_addressFields_zip";
    private String PHONENUMBER = "#dwfrm_singleshipping_shippingAddress_addressFields_phone";
    private String EMAIL = "#dwfrm_singleshipping_shippingAddress_addressFields_email";
    private String COUNTRY = "#dwfrm_singleshipping_shippingAddress_addressFields_country";
    private String STATE = "#dwfrm_singleshipping_shippingAddress_addressFields_states_state";
    private String CITY = "dwfrm_singleshipping_shippingAddress_addressFields_city";
//    private String PASSWORD = "#input-payment-password";
    //   private String PASSCONFIRM = "#input-payment-confirm";
//    private String RADIOBUTTON = ".agree+input";

    private String CONTINUETOPAYMENT = "#single_shipping_form";


    public void inputUserCredentials(UserData user) {


        waiter(FIRSTNAME);
        driver.findElement(By.cssSelector(FIRSTNAME)).sendKeys(user.FirstName);
        driver.findElement(By.cssSelector(LASTNAME)).sendKeys(user.Lastname);
        driver.findElement(By.cssSelector(EMAIL)).sendKeys(user.EMail);
        driver.findElement(By.cssSelector(PHONENUMBER)).sendKeys(user.Phonenumber);
        driver.findElement(By.cssSelector(ADDRESS)).sendKeys(user.Address);
        driver.findElement(By.cssSelector(COUNTRY)).sendKeys(user.Country);
        driver.findElement(By.cssSelector(ZIPCODE)).sendKeys(user.PostCode);
        driver.findElement(By.cssSelector(STATE)).sendKeys(user.State);
    }
        //    driver.findElement(By.cssSelector(CITY)).sendKeys(user.City);

    public void clickOnContinueToPaymentButton() {
        waiter(CONTINUETOPAYMENT);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOn(CONTINUETOPAYMENT);
    }

}



