import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Задание № 5
 * Необходимо: Реализовать калькулятор в стиле ООП. Архитектуру приложения продумать самостоятельно
 */
public class CalculatorOOP {
    public float value1;
    public float value2;

    public CalculatorOOP(float value1, float value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    private static void printFValueRounded(Float value) {
        System.out.printf("%.4f", value);
    }

    public void calculate(Scanner scanner) {
        System.out.println("Выберете один из операторов: \"+\" - 1;  \"-\" -2;  \"*\" - 3;  \"/\" - 4");
        int operator;
        try {
            operator = scanner.nextInt();
            {
                switch (operator) {
                    case 1:
                        printFValueRounded(addUp());
                        break;
                    case 2:
                        printFValueRounded(subtract());
                        break;
                    case 3:
                        printFValueRounded(multiplication());
                        break;
                    case 4:
                        CalculatorOOP.printFValueRounded(division());
                        break;
                    default:
                        System.out.println("Выберете значение из доступных");
                        calculate(scanner);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Введено неизвестное значение, введите одно из доступных: ");
            scanner.nextLine();
            calculate(scanner);
        }
    }

    public static float getFloatValueOnConsole(Scanner scanner) {
        float value;

        try {
            value = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Введено строковое значение, введите числовое: ");
            scanner.nextLine();
            value = getFloatValueOnConsole(scanner);
        }
        return value;
    }

    public float addUp() {
        return this.value1 + this.value2;
    } //метод сложения

    public float subtract() {
        return this.value1 - this.value2;

    } //метода вычитания

    public float multiplication() {
        return this.value1 * this.value2;

    } //метод умножения

    public float division() {
        if (value2 == 0){
            System.out.print("Деление на ноль запрещено!");
            return 0;
        } //метод деления
        return  this.value1 / this.value2;
    }
}



