import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class CreateNewBoardTest {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
    @Test
    public void CreateNewBoard() {

        openSite("https://trello.com/");
        clickLogInButton();
        fillLogInForm("elena.telran@yahoo.com", "12345.com");
        logIn();
        //clickOnThePlusButton();
        initBoardCreationFromTheBody();
        fillBoardTitle("karik 11.02.18");
        clickCreateBoardButton();
        returnToHomePage();
    }

    private void returnToHomePage() {
        wd.findElement(By.xpath("//div[@class='header-back-button']/a/span")).click();
    }

    private void clickCreateBoardButton() {
        wd.findElement(By.cssSelector("button.primary")).click();
    }

    private void fillBoardTitle(String boardName) {
        wd.findElement(By.cssSelector("input.subtle-input")).click();
        wd.findElement(By.cssSelector("input.subtle-input")).clear();
        wd.findElement(By.cssSelector("input.subtle-input")).sendKeys(boardName);
    }

    private void initBoardCreationFromTheBody() {
        wd.findElement(By.xpath("//*[@href='#']")).click();
    }

    private void clickOnThePlusButton() {
        wd.findElement(By.xpath("//div[@class='header-user']/a[1]/span")).click();
    }

    private void logIn() {
        wd.findElement(By.id("login")).click();
    }

    private void fillLogInForm(String userName, String userPassword) {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys(userName);
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys(userPassword);
    }

    private void clickLogInButton() {
        wd.findElement(By.linkText("Log In")).click();
    }

    private void openSite(String url) {
        wd.get(url);
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
