package page_objects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static page_objects.Locators.login;


public class HomePage extends CommonAPI {
   @FindBy ( xpath = login)
    public static WebElement logIn;

   @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
   public static WebElement call;

   public static void loginButton(){
       logIn.click();
       System.out.println("Log in Page Title: "+ driver.getTitle());
       System.out.println(logIn.getSize());
       System.out.println(" Call: " + call.getSize());
       System.out.println("location :" + logIn.getLocation());
       System.out.println("");



   }


}

