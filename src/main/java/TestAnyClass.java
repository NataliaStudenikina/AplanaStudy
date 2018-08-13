import java.util.Scanner;

/**
 * Задание № 5
 * Метод для калькулятора в тиле ООП
 */
public class TestAnyClass {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        float value1;
        float value2;
        value1 = CalculatorOOP.getFloatValueOnConsole(sc);
        value2 = CalculatorOOP.getFloatValueOnConsole(sc);

        CalculatorOOP calculator = new CalculatorOOP(value1,value2);
        calculator.calculate(sc);
    }
}
