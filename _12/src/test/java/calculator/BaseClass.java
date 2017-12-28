package calculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public  static WebDriver driver;

    @BeforeClass
    public static void baseClass(){
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void stop(){
        driver.quit();
    }
}
