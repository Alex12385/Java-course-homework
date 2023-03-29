
// Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)

import java.util.Scanner;

public class dz4 {
    // метод получения числа
    static double scanNumber() {
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        return number;
        // scan.close(); Почему не получается закрыть Scanner???
    }

    // метод получения числа операции
    static String scanOperations() {
        Scanner scan = new Scanner(System.in);
        String operations = scan.nextLine();
        return operations;

    }

    // метод получения результата
    static double getResult(String opr, double num1, double num2) {
        double result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;

            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        double num1 = scanNumber();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Введите второе число: ");
        double num2 = scanNumber();
        double result = getResult(operations, num1, num2);
        System.out.printf("%.0f %s %.0f = %.1f", num1, operations, num2, result);

    }

}
