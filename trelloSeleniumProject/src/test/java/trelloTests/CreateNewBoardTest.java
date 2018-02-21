package trelloTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewBoardTest extends TestBase{

    @Test (enabled = false)
    public void createNewBoardFromTheHeader(){
        Assert.assertEquals(wd.getCurrentUrl(), "https://trello.com/");
        clickLoginButton();
        fillValidLoginForm();
        confirmLogin();
        clickOnThePlusButton();

    }

    @Test
    public void createNewBoardTest() {

        clickLoginButton();
        fillValidLoginForm();
        confirmLogin();
        initBoardCreationInFromTheBody();
        fillBoardTitle();
        openDropDownMenuVisibility();
        selectPublicBoardFromDropDownVisibility();
        clickCreateBoardButton();
        returnToHomePage();

    }


}
