import java.util.InputMismatchException;
import java.util.Scanner;
import calculator.Calculator;

/**
 * Создание проекта в рамках обучения курсу "Java для тестировщиков 2.0" 11.07.2018
 *Задание 2
 *Задание 3.3
 */
public class Base {
    public static void main(String[] args) {
        //Простой консольный вывод текста "Hello, world!"
        //System.out.print("Hello, world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1, если хотите воспользоваться калькулятором и 2, если хотите найти максимальный элемент массива:");
        int variable;
        try {
            variable = sc.nextInt();
        } catch (InputMismatchException e) {
            variable = -1;
        }
        switch (variable) {
            case 1:
                new Calculator().start();
                break;
            case 2:
                new ArrayMax().arrayExample();
                break;
            default:
                System.out.println("Неизвестное значение");
        }
    }

}
