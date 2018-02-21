package trelloTests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RenameBoardTest extends TestBase{
    @BeforeClass
    public void precondition(){
    login("elena.telran@yahoo.com","12345.com");


    }

    @Test
    public void renameBordTest(){

    clickOnExactBoardOnBodyByName();
    clickOnCurrentNameBoard();
    typeNewNameForCurrentNameBoard("1 karik");
    clickTheButton_RenameBoard();
    returnToHomePage();
    }

    private void clickTheButton_RenameBoard() {
        wd.findElement(By.xpath("//div[@id='classic']/div[5]/div/div[2]/div/div/div/form/input[2]")).click();
    }

    private void typeNewNameForCurrentNameBoard(String newNameBoard) {
        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).click();
        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).clear();
        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).sendKeys(newNameBoard);
    }

    private void clickOnCurrentNameBoard() {
        wd.findElement(By.cssSelector("span.board-header-btn-text")).click();
    }

    private void clickOnExactBoardOnBodyByName() {
        wd.findElement(By.xpath("//div[@class='js-react-root']//span[.='1 karik 1']")).click();
    }
}
