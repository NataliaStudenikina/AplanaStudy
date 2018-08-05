import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Задание № 5
 * Метод для калькулятора в тиле ООП
 */
public class TestAnyClass {
    public static void  main(String[] args){
        Scanner cs = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        float value1 = cs.nextFloat();
        float value2 = cs.nextFloat();
        System.out.println("Выберете один из операторов: \"+\" - 1;  \"-\" -2;  \"*\" - 3;  \"/\" - 4" );
        int operator;
        try{
            operator = cs.nextInt();
        } catch (InputMismatchException e){
            operator = -1;

        }

        CalculatorOOP calculator = new CalculatorOOP(value1, value2);
        switch (operator) {
            case 1:
                calculator.addUp();
                System.out.println(calculator.addUp());
                break;
            case 2:
                calculator.subtract();
                System.out.println(calculator.subtract());
                break;
            case 3:
                calculator.multiplication();
                System.out.println(calculator.multiplication());
                break;
            case 4:
                calculator.division();
                System.out.println(calculator.division());
                break;
            default:
                System.out.println("Неизвестное значение");
        }

    }

}
