package testCases;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
@Test
public void searchFor(){
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("flower", Keys.ENTER);
}

}
