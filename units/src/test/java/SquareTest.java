import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {
    @Test
    public void testSquare(){
        Square s = new Square(9);
        Assert.assertEquals(s.area(),81);

    }
}
