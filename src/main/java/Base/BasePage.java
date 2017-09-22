package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by alex on 22.09.2017.
 */
public class BasePage {

    public static String SiteURL = "http://"+"katespade.com/";

    public WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void waiter(String SomeLocatorByCSSSelector) {
        WebDriverWait waitForOne = new WebDriverWait(driver, 30);
        waitForOne.until(ExpectedConditions.elementToBeClickable(By.cssSelector(SomeLocatorByCSSSelector)));
    }

    public void clickOn(String CSSSelector) {
        driver.findElement(By.cssSelector(CSSSelector)).click();
    }

    public void clickOnXpath(String XPathSelector) {
        driver.findElement(By.xpath(XPathSelector)).click();
    }
}
