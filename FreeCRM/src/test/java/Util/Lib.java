package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
* Use Lib Class methods in sub classes
* */
public class Lib {

    public static WebElement findeElement(WebDriver driver, String xpath){

        WebElement a = driver.findElement(By.xpath(xpath));

        return  a;
           }

           public static void sleep(WebDriver driver,int sec)throws InterruptedException{
        Thread.sleep(sec * 1000);
           }

           public static String printTitle(WebDriver driver){
               String title = driver.getTitle();
               return title;
           }
}
