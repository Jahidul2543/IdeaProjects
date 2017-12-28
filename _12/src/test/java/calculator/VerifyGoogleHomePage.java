package calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyGoogleHomePage {
    WebDriver driver;
    /*BaseClass objBaseClass = new BaseClass();
       objBaseClass.baseClass();
        objBaseClass.stop();*/

         @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void googleVerification() {
        VerifyGoogleHomePage obj1 = new VerifyGoogleHomePage();
        driver.get("https://www.google.com/");
        Boolean GmailLinkStatus = driver.findElement(By.linkText("Gmail")).isEnabled();
        if (GmailLinkStatus == true) {
            System.out.println("Gmail Link is existed in Google Home Page");
        } else {
            System.out.println("Gmail Link not existed in Google Home Page ");
        }

    }

    @AfterClass
    public void stop() {
        driver.close();
    }

}
