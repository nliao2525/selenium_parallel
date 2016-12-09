import com.google.code.tempusfugit.concurrency.ConcurrentTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by nliao on 12/7/16.
 */

//Solution 1
@RunWith(ConcurrentTestRunner.class)
public class functional {
    WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://twitter.com/");
        landingPage lp = new landingPage(driver);
        lp.clickLoginBtn();

        loginPage lgp = new loginPage(driver);
        lgp.setUserName("xxx");
        lgp.setPassword("xxx");
        lgp.unCheckRemeberMe();
        lgp.clickSignIn();
    }

    @After
    public void teardown() {
        driver.quit();
    }

    @Test
    public void accessMoments() {
        homePage hp = new homePage(driver);
        hp.clickMoments();
    }

    @Test
    public void accessNotofications() {
        homePage hp = new homePage(driver);
        hp.clickNotifications();
    }
}

//---------------------
//Solution2
//    @Test
//    public void test(){
//        Class[] cls={ParallelTest1.class, ParallelTest2.class};
//        //Parallel among classes
//        JUnitCore.runClasses(ParallelComputer.classes(), cls);
//
//        //Parallel among methods in a class
//        JUnitCore.runClasses(ParallelComputer.methods(), cls);
//
//        //Parallel all methods in all classes
//        JUnitCore.runClasses(new ParallelComputer(true, true), cls);
//    }

//    public static class ParallelTest1 {
//        WebDriver driver;
//
//        @Test public void accessMoments(){
//            driver = new ChromeDriver();
//            driver.get("https://twitter.com/");
//
//            landingPage lp = new landingPage(driver);
//            lp.clickLoginBtn();
//
//            loginPage lgp = new loginPage(driver);
//            lgp.setUserName("xxx");
//            lgp.setPassword("xxx");
//            lgp.unCheckRemeberMe();
//            lgp.clickSignIn();
//
//            homePage hp = new homePage(driver);
//            hp.clickMoments();
//
//            driver.quit();
//        }
//    }
//
//    public static class ParallelTest2 {
//        WebDriver driver;
//        @Test public void accessNotifications(){
//
//            driver = new ChromeDriver();
//            driver.get("https://twitter.com/");
//
//            landingPage lp = new landingPage(driver);
//            lp.clickLoginBtn();
//
//            loginPage lgp = new loginPage(driver);
//            lgp.setUserName("xxx");
//            lgp.setPassword("xxx");
//            lgp.unCheckRemeberMe();
//            lgp.clickSignIn();
//
//            homePage hp = new homePage(driver);
//            hp.clickNotifications();
//
//            driver.quit();
//        }
//    }

