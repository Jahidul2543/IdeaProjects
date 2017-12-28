package Pages;

import Util.Lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accessories extends Lib{
  public static void search(WebDriver driver)throws InterruptedException{
     // driver.findElement(By.xpath("//*[@id="main-nav"]/form/fieldset/input[1]")).sendKeys("Apple watch" + "\n");
      WebElement search = findeElement(driver, "//*[@id=\"main-nav\"]/form/fieldset/input[1]" );
      search.sendKeys("Apple Watch" + "\n");
      //Thread.sleep(2000);
      sleep(driver, 2);
  }
  public static void errorMessage(WebDriver driver){
      WebElement error = findeElement(driver, "//*[@id=\"content\"]/p");
      String errorMessage = error.getText();
      //System.out.println("Error Message: " + errorMessage);
      printTitle(driver);
  }
}
