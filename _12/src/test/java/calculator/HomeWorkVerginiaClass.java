package calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWorkVerginiaClass {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();

    }
    @Test(priority = 1)
    public void bookHote()throws Exception{
        driver.get("http://www.phptravels.net/");////*[@id="select2-drop"]/div/input
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"citiesInput\"]")).sendKeys("New York, USA");
        driver.findElement(By.name("checkin")).clear();
        driver.findElement(By.name("checkin")).sendKeys("12/30/2017");
        driver.findElement(By.name("checkout")).clear();
        driver.findElement(By.name("checkout")).sendKeys("01/10/2018");
        Select dropDown = new Select(driver.findElement(By.name("child")));
        dropDown.selectByIndex(2);
        Select dropDownChild1 = new Select(driver.findElement(By.xpath("//*[@id=\"ages\"]//div[1]/select")));
        dropDownChild1.selectByIndex(3);
        Select dropDownChild2 = new Select(driver.findElement(By.xpath("//*[@id=\"ages\"]//div[2]/select")));
        dropDownChild2.selectByIndex(6);
        driver.findElement(By.xpath("//*[@id=\"ages\"]/div/div/div[1]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"EXPEDIA\"]/form/div[2]/div[4]/button")).click();
        Thread.sleep(1000);

    }
    @Test(priority = 2)
    public void bookFlight(){
        driver.navigate().to("http://www.phptravels.net/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"body-section\"]//li[2]/a")).click();
        driver.findElement(By.name("origin_name")).sendKeys("New York, United States");
        driver.findElement(By.name("destination_name")).sendKeys("Dhaka,Bangladesh");
        driver.findElement(By.xpath("//*[@data-label=\"Depart date\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"mewtwo-datepicker-2018-1-2\"]/div")).click();
        driver.findElement(By.xpath("//*[@data-label=\"Return date\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"mewtwo-datepicker-2018-1-5\"]/div")).click();
        //select passenger number
        driver.findElement(By.xpath("//*[@id=\"flights-form-e823caac1a24a0172d4ee792e5dad7d9\"]/div[5]/div")).click();
        driver.findElement(By.xpath("/html/body/div[13]//span[3]")).click();
        driver.findElement(By.xpath("//*[@class=\"mewtwo-passengers-flight_type__checkbox\"]")).click();
        driver.findElement(By.xpath("/html/body/div[13]/div/div/div[5]/div/div/span[1]")).click();
        //click search button
        driver.findElement(By.className("mewtwo-flights-submit_button")).click();
        //get page title of flightt page
        driver.manage().window().maximize();
        //String flightPageTitle = driver.getTitle();
        //Assert.assertEquals("Flights", flightPageTitle);
        //select flights & book flights
        /*driver.findElement(By.xpath("/html/body/div[1]//div[2]/div[1]/label")).click();
        driver.findElement(By.xpath("/html/body/div[1]//div[3]/div[2]/div[1]/label")).click();*/
        //book flights
        driver.findElement(By.xpath("/html/body//div[3]/div[1]/div[1]/a"));







       /* driver.findElement(By.className("mewtwo-passengers-ready__button mewtwo-popup_apply_button--desktop")).click();
        driver.findElement(By.xpath("//*[@id=\"flights-form-e823caac1a24a0172d4ee792e5dad7d9\"]/div[6]/button")).click();

*/




    }
}
