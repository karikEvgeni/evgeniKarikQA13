import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewBoardTest extends TestBase{

    @Test (enabled = false)
    public void createNewBoardFromTheHeader(){
        Assert.assertEquals(wd.getCurrentUrl(), "https://trello.com/");
        clickLoginButton();
        fillValidLoginForm();
        login();
        clickOnThePlusButton();

    }

    @Test
    public void createNewBoardTest() {

        clickLoginButton();
        fillValidLoginForm();
        login();
        initBoardCreationInFromTheBody();
        fillBoardTitle();
        openDropDownMenuVisibility();
       // selectPublicBoardFromDropDownVisibility();
        clickCreateBoardButton();
        returnToHomePage();
        //(user icon click) wd.findElement(By.cssSelector("span.member-initials")).click();
       // wd.findElement(By.linkText("Log Out")).click();
    }


}
