package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class Homepg extends Lib{
	
	
	public static void gettitle(WebDriver driver) {
		
		titleprint(driver);
	}
	
	public static void clickquote(WebDriver driver, String zipcode) throws InterruptedException {
		
		WebElement quote=findEle(driver, ".//*[@id='zip']");
		quote.sendKeys(zipcode);
		
		WebElement strquote=findEle(driver, ".//*[@id='submitButton']");
		strquote.click();
		Thread.sleep(4000);
		
	}

}
