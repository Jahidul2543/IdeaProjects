package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
    public static void pageTItle(WebDriver driver){
        String pageTitle = driver.getTitle();
        System.out.println("Page Title1: " + pageTitle);
    }
    public static void homeMyAccounts(WebDriver driver){
        WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"account\"]/a/span[1]"));
        System.out.println("Click My Account: " + myAccount.getText());
    }

    public static void clickProductCat(WebDriver driver){
        WebElement productCat = driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/a"));
        productCat.click();

        //Thread.sleep(2000)



    }



}
