package Pages;

import Util.Lib;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CheckOut extends Lib {

    public static void proceedCheckOut(WebDriver driver){
        System.out.println("You are in Checkout page Proceed To Checkout");
        //click on proceed checkout button
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       /* findElementByXPath(driver, "//*[@id=\"raleigh-body\"]/a");
        findElementByXPath(driver, "//button[2]").click();*/

       findElementByXPath(driver, "//button[@type='button' and @title='Proceed To Checkout']").click();
    }
}

