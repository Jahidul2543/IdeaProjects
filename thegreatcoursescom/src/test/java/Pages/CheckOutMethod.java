package Pages;

import Util.Lib;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public  class CheckOutMethod extends Lib{
    public  static void checkOutMethod(WebDriver driver){

       findElementByXPath(driver,"//*[@id=\"login-email\"]" ).sendKeys("testdata.islam@gmail.com");
       findElementByXPath(driver, "//*[@id=\"onepage-login-form\"]//li[3]/div/div[1]/label").click();
    }
    public static void continueToBilling(WebDriver driver){
        //click to continue
        findElementByXPath(driver, "//*[@id=\"checkout-sigin\"]/span/span").click();
    }
}
