package Pages;

import Util.Lib;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.openqa.selenium.*;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class IndivisualsFamilies extends Lib {

    public static void getPageTitle(WebDriver driver) {
        System.out.println("You are in " + driver.getTitle() + "page");
        //Enter Zip now
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        findElementById(driver, "zip").sendKeys("11432" + "\n");
        //click on captcha
        //findEleentByClassName(driver, "recaptcha-checkbox-checkmark").click();

    }

    public static void socialMediaLink(WebDriver driver) {
        System.out.println("Check Social Media Link");
        //clcik on facebook link

        findElementByXPath(driver, "//a[@title='Like us on Facebook']").click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //WebElement str = findElementByXPath(driver,"//a[text()='//h1/a[text()='NY State of Health']']");
        //String text = driver.findElement(By.partialLinkText("NY State of Health")).getText();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        boolean verifyFaceBookPageOpened = url.equalsIgnoreCase("");

        if (verifyFaceBookPageOpened = true) {
            System.out.println("You are in Ny State of Health facebook page");
        } else {
            System.out.println(" You are unable to connect NY State Health facebook page");
        }


    }

}
