package trelloTests;

import org.testng.annotations.Test;

public class AddListTest extends TestBase{

    @Test
    public void AddListTest() {
        clickLoginButton();
        enterUserName("elena.telran@yahoo.com");
        enterPassword("12345.com");
        confirmLogin();
        clickOnTheBoardOnBody();
        clickAddListInTheBoard();
        createNameForList();
        clickSaveList();
        returnToHomePage();
    }
}