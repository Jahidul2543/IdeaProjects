package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib {

	
	public static void titleprint(WebDriver driver) {
		
		
		String titl=driver.getTitle();
		
		System.out.println("here is your page title ::::"+titl);
	}
	
	public static WebElement findEle(WebDriver driver, String xpath) {
	
		WebElement Ele=driver.findElement(By.xpath(xpath));
		
		return Ele;
	}
}
