package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	static WebDriver driver;
	@Before
	public void before() {
		System.out.println("this is before class");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\INSTRUCTOR\\eclipse-workspace\\mavenlearn\\chromedriver.exe");

		// Webdriver is interface
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void after() {
		driver.manage().deleteAllCookies();
		driver.close();
	}

	@org.junit.Test
	public void testing() throws InterruptedException {

		driver.findElement(By.id("email")).sendKeys("fred0999@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);

		System.out.println(driver.getTitle());
	}

	@org.junit.Test
	public void testing1() throws InterruptedException {

		driver.findElement(By.name("firstname")).sendKeys("frrr");
		driver.findElement(By.name("lastname")).sendKeys("asdasd");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}

}
