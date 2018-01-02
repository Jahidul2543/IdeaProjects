package TestCases;

import Pages.About;
import Pages.IndivisualsFamilies;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Test {
    public static WebDriver driver;

    @BeforeMethod
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://info.nystateofhealth.ny.gov/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public  static void after(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }

    @org.testng.annotations.Test
    public static void testCase()throws InterruptedException{

        System.out.println("****Test Starts From Here *****");

        About abt = new About();
        abt.aboutNSH(driver);

        // Get Update
        abt.getUpdates(driver);
        abt.clickIndivisualsFamilies(driver);




        IndivisualsFamilies ind = new IndivisualsFamilies();
        ind.getPageTitle(driver);
        ind.socialMediaLink(driver);


    }
}
