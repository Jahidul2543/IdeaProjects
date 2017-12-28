package Test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Homepg;

public class Test {
	
	static WebDriver driver;
	@Before
	public void before() {
		System.out.println("this is before class");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\INSTRUCTOR\\eclipse-workspace\\PageObjectModel\\chromedriver.exe");

		// Webdriver is interface
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.geico.com/#");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void after() {
		driver.manage().deleteAllCookies();
		//driver.close();
	}
	
	
	@org.junit.Test
	public void testing() throws InterruptedException {
		Homepg hm=new Homepg();
		hm.gettitle(driver);
		hm.clickquote(driver, "22180");
	}

}
