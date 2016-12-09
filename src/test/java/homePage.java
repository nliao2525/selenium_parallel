import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by nliao on 12/7/16.
 */
public class homePage {
    WebDriver driver;
    By btnUsrMenu = By.id("user-dropdown-toggle");
    By lnkSignOut = By.id("signout-button");
    By lnkMoments = By.cssSelector("a[data-component-context='moments_nav']");
    By lnkNotifications = By.cssSelector("a[data-component-context='connect_nav']");

    public homePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickUsrMenu(){
        driver.findElement(btnUsrMenu).click();
    }

    public void clickSignOut(){
        driver.findElement(lnkSignOut).click();
    }

    public void clickMoments(){
        driver.findElement(lnkMoments).click();
    }

    public void clickNotifications(){
        driver.findElement(lnkNotifications).click();
    }
}
