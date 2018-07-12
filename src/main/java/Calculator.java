
import java.util.Scanner;
import java.io.*;
/**
 * Консольный калькулятор, выполняющий функции сложения, вычитания, деления и умножения
 */
public class Calculator {
     public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Введите число1: ");
         float char1 = sc.nextFloat();
         System.out.println("Введите число2: ");
         float char2 = sc.nextFloat();
         System.out.println("Выберете тип операции: + , -, /, * ");
         String operator = sc.next();
         float result = calculate(operator, char1, char2);
         System.out.println("Результат: " + String.format("%.4g%f",result));
     }

     private static float calculate (String operation, float number1, float number2) {
         float summ = 0;
         if (operation.equals("-")) {
             summ = number1 - number2;
         } else if (operation.equals("+")){
             summ = number1 + number2;
         } else if (operation.equals("/")){
             summ = number1 / number2;
         } else if (operation.equals("*")){
             summ = number1 * number2;
         }

         return summ;
     }

}
