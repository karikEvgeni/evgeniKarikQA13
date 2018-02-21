package trelloTests;

import org.testng.annotations.*;


public class LoginValidUserTest extends TestBase{

@BeforeMethod
    public void createPreconditions(){
        openSite("https://trello.com/");
}
    @Test (priority = 1)
    public void loginTrelloValidTest() {
        clickLoginButton();
        enterUserName("elena.telran@yahoo.com");
        enterPassword("12345.com");
        confirmLogin();
        logout();

    }

    @Test (priority = 3)
    public void loginTrelloNotValidTast() {
        clickLoginButton();
        enterUserName("1");
        enterPassword("12345.com");
        confirmLogin();
    }

    @Test (priority = 2)
    public void loginTrelloEmptyFieldsTest() {
        clickLoginButton();
        enterUserName("");
        enterPassword("");
        confirmLogin();
    }
}
