package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.concurrent.TimeUnit;

public class HomePage {
    //WebDriver driver;
   /* public HomePage(WebDriver driver){
        this.driver=driver;
    }
*/
    @FindBy(xpath = "//a[@class='login']")
    public static WebElement signIn;


    public static void goToSignInPage(WebDriver driver) throws NullPointerException
    {
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        signIn.click();
    }



}
