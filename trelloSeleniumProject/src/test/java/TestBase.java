import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {


    FirefoxDriver wd;

   @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        openSite("https://trello.com/");
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

    protected void confirmLogInButton() {
        wd.findElement(By.id("login")).click();
    }

    protected void enterPassword(String pwd) {
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys(pwd);
    }

    protected void enterUserName(String userName) {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys(userName);
    }

    protected void clickLogInButton() {
        wd.findElement(By.linkText("Log In")).click();
    }

    protected void returnToHomePage() {
        wd.findElement(By.xpath("//div[@class='header-back-button']/a/span")).click();
    }

    protected void clickCreateBoardButton() {
        wd.findElement(By.cssSelector("button.primary")).click();
    }

    protected void openDropDownMenuVisibility() {
        wd.findElement(By.xpath("//form[@class='create-board-form']//button[.='Private']")).click();
    }

    protected void initBoardCreationInFromTheBody() {
        wd.findElement(By.xpath("//div[@class='js-react-root']//span[.='Create new board…']")).click();
    }

    protected void fillBoardTitle() {
        wd.findElement(By.cssSelector("input.subtle-input")).click();
        wd.findElement(By.cssSelector("input.subtle-input")).clear();
        wd.findElement(By.cssSelector("input.subtle-input")).sendKeys("2 Karik board");
    }

    protected void login() {
        wd.findElement(By.id("login")).click();
    }

    protected void fillLoginForm() {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys("elena.telran@yahoo.com");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("12345.com");
    }

    protected void clickLoginButton() {
        wd.findElement(By.linkText("Log In")).click();
    }

    protected void logout() {
        wd.findElement(By.cssSelector("span.member-initials")).click();
        wd.findElement(By.cssSelector("a.js-logout")).click();
    }

    protected void openSite(String url) {
        wd.get(url);
    }


    protected void clickOnThePlusButton() {
        wd.findElement(By.cssSelector("span.header-btn-icon.icon-lg.icon-add")).click();
    }

    protected void clickSaveList() {
        wd.findElement(By.xpath("//div[@id='board']/div/form/div/input")).click();
    }

    protected void createNameForList() {
        wd.findElement(By.name("name")).click();
        wd.findElement(By.name("name")).clear();
        wd.findElement(By.name("name")).sendKeys("Name");
    }

    protected void clickAddListInTheBoard() {
        wd.findElement(By.cssSelector("span.placeholder.js-open-add-list")).click();
    }

    protected void clickBoard() {
        wd.findElement(By.cssSelector("span.board-tile-details.is-badged")).click();
    }
}
