package page_objects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
   @FindBy (xpath = "//a[@class='login']")
    public static WebElement logIn;

   public static void loginButton(){
       logIn.click();
       System.out.println("Log in Page Title: "+ driver.getTitle());
   }


}

