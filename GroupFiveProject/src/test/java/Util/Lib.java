package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib {
    // method to find element by id
    public static WebElement findElementById(WebDriver driver, String id) {
        WebElement findId = driver.findElement(By.id(id));
        return findId;
    }

    // method to find element by name
    public static WebElement findElmentByName(WebDriver driver, String name) {
        WebElement findName = driver.findElement(By.name("name"));
        return findName;
    }

    public static WebElement findEleentByClassName(WebDriver driver, String className) {
        WebElement cl = driver.findElement(By.className(className));
        return cl;
    }

    // method to find element by xpath
    public static WebElement findElementByXPath(WebDriver driver, String xpath) {
        WebElement findxpath = driver.findElement(By.xpath(xpath));
        return findxpath;
    }


}
