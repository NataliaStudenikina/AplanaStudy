package calculator;

import java.util.Scanner;

/**
 * Консольный калькулятор, выполняющий функции сложения, вычитания, деления и умножения
 * Задание 2, 3.1
 */
public class Calculator {
    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число1: ");
        float char1 = sc.nextFloat();
        System.out.println("Введите число2: ");
        float char2 = sc.nextFloat();
        System.out.println("Выберете тип операции: + , -, /, * ");
        String operator = sc.next();
        float result = calculate(operator, char1, char2);
        System.out.println("Результат: " + String.format("%.4f",result));
    }

     private static float calculate (String operation, float number1, float number2) {
         float summ = 0;
             if (operation.equals("-")) {
                 summ = number1 - number2;
             } else if (operation.equals("+")) {
                 summ = number1 + number2;
             } else if (operation.equals("/")) {
                 summ = number1 / number2;
                 if (number2 == 0) {System.out.println("Делить на ноль запрещено");}

             } else if (operation.equals("*")) {
                 summ = number1 * number2;
             }

             return summ;
     }

}
