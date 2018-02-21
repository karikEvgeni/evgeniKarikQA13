import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;


public class LoginValidUserTest extends TestBase{



    @Test (priority = 1)
    public void validUserLoginTrelloTest() {
        clickLogInButton();
        enterUserName("elena.telran@yahoo.com");
        enterPassword("12345.com");
        confirmLogInButton();
        logout();
    }

    @Test (priority = 2)
    public void loginTrelloTestNotValid() {
        clickLogInButton();
        enterUserName("11111");
        enterPassword("12345.com");
        confirmLogInButton();
    }

    @Test (priority = 3)
    public void loginTrelloTestEmptyFields() {
        clickLogInButton();
        enterUserName("");
        enterPassword("");
        confirmLogInButton();
    }
}
