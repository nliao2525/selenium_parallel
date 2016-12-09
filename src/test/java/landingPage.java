import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by nliao on 12/7/16.
 */
public class landingPage {
    WebDriver driver;
    By btnLogin = By.cssSelector("a[class='Button StreamsLogin js-login']");

    public landingPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLoginBtn(){
        driver.findElement(btnLogin).click();
    }

}
