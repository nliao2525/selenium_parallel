import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by nliao on 12/7/16.
 */
public class loginPage {
    WebDriver driver;
    By fldUserName = By.cssSelector("input[class='text-input email-input js-signin-email']");
    By fldPassword = By.cssSelector("input[name='session[password]']");
    By chkRememberMe = By.cssSelector("input[name='remember_me']");
    By btnSignIn = By.cssSelector("input[class='submit btn primary-btn js-submit']");

    public loginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName(String un){
        driver.findElement(fldUserName).sendKeys(un);
    }

    public void setPassword(String pw){
        driver.findElement(fldPassword).sendKeys(pw);
    }

    public void unCheckRemeberMe(){
        driver.findElement(chkRememberMe).click();
    }

    public void clickSignIn(){
        driver.findElement(btnSignIn).click();
    }
}
