package calculator;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
    @BeforeClass
    public void  verifyTitle(){

        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\Rabeka\\eclipse-workspace-November2017\\SeleniumFirstProject\\lib\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.gmail.com");
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle,"Gmail");

    }
    WebDriver driver = new FirefoxDriver();
    @Test (priority = 3)
    public void testA(){

        Assert.assertEquals("Gmail", "Gmail");
    }
    @Test(priority = 2)
    public void testC(){
        Assert.assertEquals("Gmail", "Google");
    }
    @Test (priority = 4)
    public void testB(){
        driver.get("https://www.yahoo.com");
        Assert.assertEquals("Yahoo", "Yahoo");
    }
   /* @AfterClass
    public void closeDriver(){
        driver.close();
    }*/

}