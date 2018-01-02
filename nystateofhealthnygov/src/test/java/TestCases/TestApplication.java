package TestCases;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import org.testng.annotations.Test;
import sun.util.locale.provider.TimeZoneNameUtility;

import java.util.concurrent.TimeUnit;

public class TestApplication  {
     WebDriver driver;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);// why u used 1000 secoends?
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

    }
    @AfterMethod

    public void closeApplication(){

        driver.close();
        driver.quit();
    }
    @Test
     public void testVarify()throws NullPointerException {
        //driver.get("http://automationpractice.com/index.php");
         HomePage callSign = PageFactory.initElements(driver,HomePage.class);
         callSign.goToSignInPage(driver);

     }

}
