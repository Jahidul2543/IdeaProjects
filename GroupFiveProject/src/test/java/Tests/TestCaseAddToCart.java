package Tests;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestCaseAddToCart {
    public static WebDriver driver;

    @BeforeMethod
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.thegreatcourses.com/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public static void after() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }

    @org.testng.annotations.Test
    public  void testCase() throws InterruptedException  {
        System.out.println("****Test Starts From Here *****");

        HomePage hm = new HomePage();
        hm.getTitle(driver);
    }
}
