package sitePages;

import Base.BasePage;
import Base.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by alex on 22.09.2017.
 */
public class Shipping extends BasePage {

    public Shipping (WebDriver driver){super(driver);}

    private String FIRSTNAME = "#dwfrm_singleshipping_shippingAddress_addressFields_firstName";
    private String LASTNAME = "#dwfrm_singleshipping_shippingAddress_addressFields_lastName";
    private String ADDRESS = "#dwfrm_singleshipping_shippingAddress_addressFields_address1";
    private String ZIPCODE = "#input-payment-postcode";
    private String PHONENUMBER ="#input-payment-telephone";
    private String EMAIL = "#input-payment-email";
 //   private String COUNTRY = "#input-payment-country";
 //   private String STATE = "#input-payment-zone";
//    private String PASSWORD = "#input-payment-password";
 //   private String PASSCONFIRM = "#input-payment-confirm";
//    private String RADIOBUTTON = ".agree+input";


    public void inputUserCredentials(UserData user) {

        waiter(FIRSTNAME);
        driver.findElement(By.cssSelector(FIRSTNAME)).sendKeys(user.FirstName);
        driver.findElement(By.cssSelector(LASTNAME)).sendKeys(user.Lastname);
        driver.findElement(By.cssSelector(EMAIL)).sendKeys(user.EMail);
        driver.findElement(By.cssSelector(PHONENUMBER)).sendKeys(user.Phonenumber);
        driver.findElement(By.cssSelector(ADDRESS)).sendKeys(user.Address);
  //     driver.findElement(By.cssSelector(CITY)).sendKeys(user.City);
        driver.findElement(By.cssSelector(ZIPCODE)).sendKeys(user.PostCode);
   //     driver.findElement(By.cssSelector(PASSWORD)).sendKeys(user.Password);
    //    driver.findElement(By.cssSelector(PASSCONFIRM)).sendKeys(user.Password);

    }



}
