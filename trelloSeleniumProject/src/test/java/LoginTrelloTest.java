import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;


public class LoginTrelloTest extends TestBase{

    @Test
    public void LoginTrelloTest() {

        clickLogInButton();
        enterUserName("elena.telran@yahoo.com");
        enterPassword("12345.com");
        confirmLogInButton();
        logout();
    }

    @Test
    public void LoginTrelloTestNotValid() {

        clickLogInButton();
        enterUserName("11111");
        enterPassword("12345.com");
        confirmLogInButton();

    }

    @Test
    public void LoginTrelloTestEmptyFields() {

        clickLogInButton();
        enterUserName("");
        enterPassword("");
        confirmLogInButton();

    }


}
