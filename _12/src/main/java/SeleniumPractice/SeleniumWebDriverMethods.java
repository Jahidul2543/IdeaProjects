package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.Credentials;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumWebDriverMethods {
    WebDriver driver;

    @BeforeMethod
    public void connectDriver() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testCase1() {
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println("Actual Page Title: " + title);
        Assert.assertEquals(title, "Google");
        //System.out.println(driver.getPageSource());
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.google.com/");

    }

    @Test
    public void testCase2() throws Exception {

        System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("today's news");
        driver.findElement(By.name("q")).submit();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"tsf\"]//center/input[1]")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"tsf\"]//center/input[1]")).isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div//h3/a")).click();

      Thread.sleep(1000);
    }

    @Test
    public void testCase3() {
        driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html?overview-summary.html");
        driver.manage().window().maximize();
        driver.switchTo().frame(2);
        System.out.println(driver.findElement(By.xpath("/html/body//th[2]")).getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.findElement(By.linkText("com.thoughtworks.selenium")).isEnabled();
        driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
        driver.switchTo().defaultContent();
        String verificationText = driver.switchTo().frame(1).findElement(By.xpath("/html/body/h1/a")).getText();
        Assert.assertEquals(verificationText, "com.thoughtworks.selenium");

    }

    @Test
    public void method4() throws Exception {
        driver.navigate().to("https://www.amazon.com/");
        //check point
        boolean displayed = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[3]/span[1]/div/a")).isDisplayed();
        System.out.println("Display status " + displayed);
        //search
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("flowers");
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form//input")).click();
        //click search button
        driver.findElement(By.name("s-ref-checkbox-1249146011")).click();

        // check free shipping check box
        boolean selected = driver.findElement(By.name("s-ref-checkbox-1249146011")).isSelected();
        Thread.sleep(10000);
        System.out.println("Free Shipping button status " + selected);
        driver.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[3]/div/li/span/span/div/label/input")).click();
        Thread.sleep(10000);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[3]/div/li/span/span/div/label/input")).isSelected());

        //driver.findElement(By.xpath("//*[@id=\"addToCart-B002SVZH0W\"]/div/span/span/input")).click();




    }

    @Test
    public void testCase5()throws Exception {
        driver.get("https://www.bestbuy.com/");
      //Alert popupSignUp = driver.switchTo().alert();
        driver.findElement(By.xpath("//*[@id=\"emailId\"]")).sendKeys("jahid@gmail.com");

      driver.findElement(By.xpath("//*[@class=\"modal fade email-submission-modal in\"]/div/div/div[1]/button")).click();
      driver.findElement(By.id("profileMenuWrap1")).click();
      driver.findElement(By.xpath("//*[@id=\"profileMenu1\"]/div/div[3]/div/a")).click();
      /*  popupSignUp.getText();
        popupSignUp.dismiss();
*/
        //popupSignUp.accept();
        //System.out.println(popupSignUp.getText());

        // driver.findElement(By.cssSelector("/* "));
       // Thread.sleep(100000);
        //

    }

   /* @AfterMethod
    public void closeBrowser() {
        driver.close();
    }*/


}

