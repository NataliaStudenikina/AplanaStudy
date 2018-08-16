import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class CalculatorTest {

    private float value1 = 6;
    private float value2 = 5;
    public CalculatorOOP calc = new CalculatorOOP(value1,value2);
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test //Проверка деления
    public void testDivision() {
        float actual = calc.division();
        Assert.assertEquals(1.2, actual, 1);
    }

    @Test //Проверка сложения
    public void testAddUp(){
        float addUp = calc.addUp();
        Assert.assertEquals(11, addUp,0);
    }

    @Test //Проверка вычитания
    public void testSubtract() {
        float subtract = calc.subtract();
        Assert.assertEquals(1,subtract, 0);
    }
    @Test //Проверка умножения
    public void testMultiplication() {
        float multiplication = calc.multiplication();
        Assert.assertEquals(30, multiplication, 0);
    }

    @Test //Проверка деления на 0
    public void testDivisionZero(){
        CalculatorOOP calculator = new CalculatorOOP(4,0);
        Float devisionZero = calculator.division();
        Assert.assertEquals("Деление на ноль запрещено!",outContent.toString());
    }
}
