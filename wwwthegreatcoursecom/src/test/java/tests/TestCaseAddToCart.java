package tests;

import pages.*;
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
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public static void after() {
        driver.manage().deleteAllCookies();
       /* driver.close();
        driver.quit();*/
    }

    @org.testng.annotations.Test
    public  void testCase() throws InterruptedException  {
        System.out.println("****Test Starts From Here *****");

        /*Courses hm = new Courses();
        hm.getTitle(driver);
        hm.search(driver);
        hm.clickZeroTOInfinity(driver);
        hm.addItemToCart(driver);

        CheckOut chk = new CheckOut();
        chk.proceedCheckOut(driver);

        CheckOutMethod chkMethod = new CheckOutMethod();
        chkMethod.checkOutMethod(driver);
        chkMethod.continueToBilling(driver);

        BillingInformation bill = new BillingInformation();
        bill.billingInfo(driver);
        bill.clickContinue(driver);

        ShippingMethod shippingMeth = new ShippingMethod();
        shippingMeth.shippingMethod(driver);
        shippingMeth.clickCOntinueToPayment(driver);*/

    }
}
