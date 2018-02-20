import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewBoardTest extends TestBase{

    @Test (enabled = false)
    public void createNewBoardFromTheHeader(){
        Assert.assertEquals(wd.getCurrentUrl(), "https://trello.com/");
        clickLoginButton();
        fillLoginForm();
        login();
        clickOnThePlusButton();

    }

    @Test
    public void createNewBoardTest() {

        clickLoginButton();
        fillLoginForm();
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

    /*private void selectPublicBoardFromDropDownVisibility() {

        wd.findElement(By.linkText("PublicThe board is public. It's visible to anyone with the link and will show up in search engines like Google.  Only people added to the board can edit it.")).click();
    }*/


}
