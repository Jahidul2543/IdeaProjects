package Pages;

import Util.Lib;
import org.openqa.selenium.WebDriver;

public class ShippingMethod extends Lib {
    public static void shippingMethod(WebDriver driver) {
        findElementByXPath(driver, "//*[@id=\"checkout-shipping-method-load\"]//li[1]/label").click();
        System.out.println("COnfirm Shipping Methods");
    }
    // clcik continue to go Payment information
    public static void clickCOntinueToPayment(WebDriver driver){

        findElementByXPath(driver, "//*[@id=\"shipping-method-buttons-container\"]/button/span/span").click();
    }

}
