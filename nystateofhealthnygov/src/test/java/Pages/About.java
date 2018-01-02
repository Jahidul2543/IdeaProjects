package Pages;

import Util.Lib;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class About extends Lib {

    public static void aboutNSH(WebDriver driver) {

        WebElement a = driver.findElement(By.id("hsajha"));
                //go to about
        WebElement about = findElementByXPath(driver, "//*[@id=\"secondary-navigation\"]/li[1]/a");
        //click on about
        about.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("This is NYSH webpage title: "+driver.getTitle());
        //click what is NYSOH
        findElementByXPath(driver, "//*[@id=\"secondary-navigation\"]/li[1]/ul//a").click();
    }

    public static void youtubeButton(WebDriver driver)throws InterruptedException {
        // click you tube button
        /*driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 20);


        WebElement iframe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[1]")));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//*[@id='player']/div/div[4]/button")).click();
        Thread.sleep(10000);*/


        /*String url = iframe.getAttribute("src");
        System.out.println(url);
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(1000);*/

        //Play
        //JavascriptExecutor jse = (JavascriptExecutor) driver;
        //Click on play button
       // jse.executeScript("jwplayer().play();");
       // Thread.sleep(2000);


        //Boolean youTubeButton = findElementByXPath(driver,"//div[@id='player']/div/div[4]/button").isEnabled();
        //System.out.println("Is the you tube button enable: " + youTubeButton);
        //play video
        //findElementByXPath(driver, "//div[@id='player']/div/div[4]/button").click();
       // Thread.sleep(10000);
        ////*[@id="player_uid_600756674_1"]/div[4]/button
       // driver.findElement(By.className("ytp-large-play-button ytp-button")).click();
    }

    //register for updated information
    public static void getUpdates(WebDriver driver) {
    findElementByXPath(driver,"//input[@name='data[fname]']").sendKeys("J Islam");
    findElementByXPath(driver, "//input[@name='data[email]']");
    findElementByXPath(driver,"//input[@name='data[business]']").sendKeys("self");
    findElementByXPath(driver,"//input[@type='submit']");
    }
    public static void clickIndivisualsFamilies(WebDriver driver){
        //Go to Individuals & families page
        WebElement ind = findElementByXPath(driver, "//*[@id=\"block-system-main-menu\"]/div/div/ul/li[1]/a");
        ind.click();
    }
}
