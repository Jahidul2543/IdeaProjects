package Test;

import Pages.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://store.demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void after() {
        driver.manage().deleteAllCookies();
        driver.close();

    }

    @org.junit.Test
    public void testing() throws InterruptedException {
        System.out.println("Test");

        Home hm = new Home();
        hm.pageTItle(driver);
        hm.homeMyAccounts(driver);
        hm.clickProductCat(driver);

        ProductCatagory product = new ProductCatagory();
        product.productCat(driver);
        product.clickAllProduct(driver);
        product.clickIpad(driver);


        Ipads ipd = new Ipads();
        ipd.clickMacBook(driver);

        MacBooks mac = new MacBooks();
        mac.macBooks(driver);

        Accessories acce = new Accessories();
        acce.search(driver);
        acce.errorMessage(driver);

    }
}
