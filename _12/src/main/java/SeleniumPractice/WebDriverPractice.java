package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\Rabeka\\eclipse-workspace-November2017\\SeleniumFirstProject\\lib\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        //driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[4]/div[8]/div[2]/a/span"));
        driver.findElement(By.xpath(".//*[@class = \"nav-a\"]/a")).click();
       // driver.findElement(By.linkText("Today's Deals")).click();

    }
}
