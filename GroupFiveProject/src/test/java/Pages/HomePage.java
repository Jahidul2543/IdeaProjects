package Pages;

import Util.Lib;
import org.openqa.selenium.WebDriver;

public class HomePage extends Lib {

    public static void getTitle(WebDriver driver){
        String pageTitle = driver.getTitle();
        System.out.println("You are at " + "'" + pageTitle + "' Web Page" );
    }
}
