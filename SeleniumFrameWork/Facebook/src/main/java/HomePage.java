import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = ".//span[text()='Log into Facebook']")
    WebElement loginText;

}
