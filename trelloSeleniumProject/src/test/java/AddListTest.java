import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class AddListTest extends TestBase{

    @Test
    public void AddListTest() {
        clickLoginButton();
        enterUserName("elena.telran@yahoo.com");
        enterPassword("12345.com");
        login();
        clickBoard();
        clickAddListInTheBoard();
        createNameForList();
        clickSaveList();
        returnToHomePage();
    }
}