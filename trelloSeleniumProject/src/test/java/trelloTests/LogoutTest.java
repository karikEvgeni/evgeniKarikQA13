package trelloTests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase{

    @BeforeClass
    public void preconditionFor_LogoutTest(){
     login("elena.telran@yahoo.com","12345.com");
    }

    @Test
    public void logoutTest(){
        clickOnAvatar();
        click_Log_Out_InTheMenuAccount();
        Assert.assertEquals(wd.getCurrentUrl(), "https://trello.com/logged-out");
    }

}
