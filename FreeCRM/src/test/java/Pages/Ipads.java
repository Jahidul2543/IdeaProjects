package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.accessibility.AccessibleTable;

public class Ipads {

    public static void clickMacBook(WebDriver driver) {
        System.out.println("You are in Ipad Section: ");
        System.out.println("Click MacBook ");
        //Hover over product catagory
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/a"))).build().perform();
        //Click MackBook
        driver.findElement(By.xpath("//*[@id=\"menu-item-39\"]/a")).click();
    }
    }

