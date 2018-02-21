import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewBoardTest extends TestBase{

    @Test (enabled = false)
    public void createNewBoardFromTheHeader(){
        Assert.assertEquals(wd.getCurrentUrl(), "https://trello.com/");
        clickLoginButton();
        fillValidLoginForm();
        confirmLogInButton();
        clickOnThePlusButton();

    }

    @Test
    public void createNewBoardTest() {

        clickLoginButton();
        fillValidLoginForm();
        confirmLogInButton();
        initBoardCreationInFromTheBody();
        fillBoardTitle();
        openDropDownMenuVisibility();
        selectPublicBoardFromDropDownVisibility();
        clickCreateBoardButton();
        returnToHomePage();

    }


}
