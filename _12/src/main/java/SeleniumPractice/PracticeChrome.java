package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeChrome {
    WebDriver driver;

    @BeforeMethod
    public void conncetion() {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void wikiLInk() {

        driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
        driver.manage().window().maximize();
        String url = driver.getCurrentUrl();
        boolean wikiVerification1 = url.contains("wikipedia.org");
        System.out.println(wikiVerification1);
        if (wikiVerification1 == true) {
            System.out.println("https://en.wikipedia.org/wiki/Selenium_(software) is internal Link ");
        } else {
            System.out.println("https://en.wikipedia.org/wiki/Selenium_(software) is an external link");
        }
        driver.findElement(By.partialLinkText("Selenium IDE")).click();
        String url2_1 = driver.getCurrentUrl();
        boolean wikiVerification2 = url2_1.contains("wikipedia.org");
        if (wikiVerification1 == true) {
            System.out.println(url2_1 + " is internal Link ");
        } else {
            System.out.println(url2_1 + " is an external link");

        }
        driver.findElement(By.partialLinkText("References")).click();
        String url4 = driver.getCurrentUrl();
        boolean wikiVerification3 = url4.contains("wikipedia.org");
        if (wikiVerification3 == true) {
            System.out.println(url4 + " is internal Link ");
        } else {
            System.out.println(url4 + " is an external link");

        }
        driver.findElement(By.partialLinkText("External")).click();
        String url5 = driver.getCurrentUrl();
        boolean wikiVerification4 = url5.contains("wikipedia.org");
        if (wikiVerification4 == true) {
            System.out.println(url4 + " is internal Link ");
        } else {
            System.out.println(url4 + " is an external link");

        }



    }
}