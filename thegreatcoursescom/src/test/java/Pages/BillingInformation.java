package Pages;

import Util.Lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BillingInformation extends Lib {
    public static void billingInfo(WebDriver driver) {
        findElementById(driver, "billing:firstname").sendKeys("MJ");
        findElementById(driver, "billing:lastname").sendKeys("Islam");
        findElementById(driver, "billing:company").sendKeys("Blue Sky");
        findElementById(driver, "billing:street1").sendKeys("85 Street");
        findElementById(driver, "billing:street2").sendKeys("South A5");
        findElementById(driver, "billing:city").sendKeys("Jamaica");
        Select dropDown = new Select(driver.findElement(By.id("billing:region_id")));
        dropDown.selectByIndex(42);
        findElementById(driver, "billing:postcode").sendKeys("11432");
        findElementById(driver, "billing:customer_password").sendKeys("testdata");
        findElementById(driver, "billing:confirm_password").sendKeys("testdata");
        //confirming shipping address to same address
        findElementByXPath(driver, "//*[@id=\"co-billing-form\"]//li[2]/div[1]/label").click();
    }
        // click continue to go Shipping Method
        public static void clickContinue(WebDriver driver){

        findElementByXPath(driver, "//*[@id=\"billing-buttons-container\"]/button/span//span").click();



    }
}
