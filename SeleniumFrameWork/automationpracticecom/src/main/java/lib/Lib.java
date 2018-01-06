package lib;

import org.openqa.selenium.WebDriver;

import java.awt.image.ImagingOpException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Lib {

    public static String readproperties(WebDriver driver, String key) throws IOException {

        InputStream fs = new FileInputStream("C:\\Users\\Rabeka\\IdeaProjects\\SeleniumFrameWork\\automationpracticecom\\src\\main\\java\\locator.properties");
        Properties pro = new Properties();
        pro.load(fs);
       String value = pro.getProperty(key);
       return value;

    }
}
