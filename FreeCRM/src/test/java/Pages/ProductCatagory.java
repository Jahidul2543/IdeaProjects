package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ProductCatagory {
    public static void productCat(WebDriver driver) {

        System.out.println("This is Product Catagory Page");
        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"default_products_page_container\"]//form//span/input"));
        addToCart.click();
        System.out.println("Click Add to cart: " + addToCart.getText());
        //click checkout
        driver.findElement(By.xpath("//*[@id=\"header_cart\"]/a/span[1]")).click();
        // click continue
        System.out.println("Click 'continue' to chekout");
        driver.findElement(By.xpath("//*[@id=\"checkout_page_container\"]/div[1]/a/span")).click();

    }

    public static void clickAllProduct(WebDriver driver) {
        driver.findElement(By.xpath("//*[@id=\"menu-item-72\"]/a"));
        System.out.println("Page title of Product Catagory Page: " + driver.getTitle());

    }

    public static void clickIpad(WebDriver driver) throws InterruptedException {
        //hover mouse over ProductCatagory
        Actions ac = new Actions(driver);
        ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/a"))).build().perform();
        Thread.sleep(2000);

        //click on iPads
        driver.findElement(By.xpath("//*[@id=\"menu-item-36\"]/a")).click(); // //a[text()='iPads']"
    }
}
