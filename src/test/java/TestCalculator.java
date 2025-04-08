import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.Calculator; // <-- đúng chính tả

public class TestCalculator {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(2, 3);
        Assert.assertEquals(result, 5, "Sum is incorrect");
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int result = calculator.sub(3, 2);
        Assert.assertEquals(result, 1, "Subtraction is incorrect");
    }
}
