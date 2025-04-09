import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.Calculator; //

public class TestCalculator {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(2, 4);
        Assert.assertEquals(result, 6, "Sum is correct");
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int result = calculator.sub(3, 2);
        Assert.assertEquals(result, 1, "Subtraction is correct");
    }
}
