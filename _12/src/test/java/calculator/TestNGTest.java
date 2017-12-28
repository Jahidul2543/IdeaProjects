package calculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGTest {

        WebDriver driver;
        @BeforeMethod
        public void launchBrowser() {
            driver = new FirefoxDriver();
                System.setProperty("webdriver.gecko.driver",
                        "C:\\Users\\Rabeka\\eclipse-workspace-November2017\\SeleniumFirstProject\\lib\\geckodriver-v0.19.1-win64\\geckodriver.exe");

        }

        @Test
        public void verifyPageTitle1() {
            driver.get("https://www.gmail.com");
            Assert.assertEquals("Gmail", driver.getTitle());
        }

        @Test
        public void verifyPageTitle2() {
            driver.get("https://in.yahoo.com/");
            Assert.assertEquals("Yahoo", driver.getTitle());
        }

        @AfterMethod
        public void closeBrowser() {
            driver.close();
        }
    }





