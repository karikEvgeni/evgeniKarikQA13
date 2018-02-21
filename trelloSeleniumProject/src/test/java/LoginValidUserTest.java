import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;


public class LoginValidUserTest extends TestBase{

@BeforeMethod
    public void createPreconditions(){
        openSite("https://trello.com/");
}
    @Test (priority = 1)
    public void loginTrelloValidTest() {
        clickLogInButton();
        enterUserName("elena.telran@yahoo.com");
        enterPassword("12345.com");
        confirmLogInButton();
        logout();
    }

    @Test (priority = 3)
    public void loginTrelloNotValidTast() {
        clickLogInButton();
        enterUserName("1");
        enterPassword("12345.com");
        confirmLogInButton();
    }

    @Test (priority = 2)
    public void loginTrelloEmptyFieldsTest() {
        clickLogInButton();
        enterUserName("");
        enterPassword("");
        confirmLogInButton();
    }
}
