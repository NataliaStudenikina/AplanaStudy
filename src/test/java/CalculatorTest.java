
import javafx.scene.control.Alert;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private float value1 = 6;
    private float value2 = 5;
    public CalculatorOOP calc = new CalculatorOOP(value1,value2);

    @Test
    public void testDivision() {
        float actual = calc.division();
        Assert.assertEquals(1.2, actual, 1);
    }

    @Test
    public void testAddUp(){
        float addUp = calc.addUp();
        Assert.assertEquals(11, addUp,0);
    }

    @Test
    public void testSubtract() {
        float subtract = calc.subtract();
        Assert.assertEquals(1,subtract, 0);
    }
    @Test
    public void testMultiplication() {
        float multiplication = calc.multiplication();
        Assert.assertEquals(30, multiplication, 0);
    }

    @Test
    public void testDivisionZero(){
        CalculatorOOP calculator = new CalculatorOOP(4,0);
        Float devisionZero = calculator.division();
        Assert.assertEquals(1, devisionZero, 2);
    }
}
