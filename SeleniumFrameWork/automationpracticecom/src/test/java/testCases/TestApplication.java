package testCases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_objects.HomePage;

import java.util.concurrent.TimeUnit;

public class TestApplication extends CommonAPI {

    @Test
    public void testLogInButton(){
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        hm.loginButton();

    }
}
