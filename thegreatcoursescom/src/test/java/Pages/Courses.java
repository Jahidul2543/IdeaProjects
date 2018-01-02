package Pages;

import Util.Lib;
import org.openqa.selenium.WebDriver;

public class Courses extends Lib {

    public static void getTitle(WebDriver driver){
        String pageTitle = driver.getTitle();
        System.out.println("You are at " + "'" + pageTitle + "' Web Page" );
    }
    public static void search(WebDriver driver){
        findElementById(driver, "search").sendKeys("math");
        findElementByXPath(driver,"//*[@id=\"search_mini_form\"]//span/span").click();
    }
    // click the product move on Course page
    public static void clickZeroTOInfinity(WebDriver driver){
        findElementByXPath(driver,"//li[3]/div/a/h2").click();
    }
    public static void addItemToCart(WebDriver driver){
        //select DVD
        findElementByXPath(driver, "//*[@id=\"media-format-radio\"]/div/label").click();
        //clcik on add to cart
        findElementByXPath(driver, "//*[@id=\"add-to-cart-btn\"]/span//span").click();

    }

}
