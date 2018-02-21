package trelloTests;

import org.testng.annotations.Test;

public class CreateNewBoandPlusTest extends  TestBase{

    
    @Test
    public void CreateNewBoandPlusTest() {

        clickLoginButton();
        fillValidLoginForm();
        confirmLogin();
        clickOnThePlusButton();
        click_CreateBoard_InTheHeader();
        fillBoardTitle();
        openDropDownMenuVisibility();
        selectPublicBoardFromDropDownVisibility();
        click_createBoard();
        returnToHomePage();
    }
    


}
