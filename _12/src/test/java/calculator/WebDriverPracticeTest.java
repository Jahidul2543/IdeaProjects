package calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebDriverPracticeTest {
    WebDriver driver;
   @BeforeMethod
    public void setUp() {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void tearDown(){
       driver.quit();
    }
    @Test
    public void verifyAmazonHomePage(){
       driver.get("https://www.amazon.com/");
       String actualTitle = driver.getTitle();
       String expectedTitle =  "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        Assert.assertEquals(actualTitle, expectedTitle);
        //driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
       driver.close();
   }
}
