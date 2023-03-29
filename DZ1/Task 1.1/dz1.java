
//1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 

import java.util.Scanner;

public class dz1 {

    public static void main(String[] args) {
        Scanner nScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = nScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", getNum(i));
        nScanner.close();
    }

    public static int getNum(int a) {
        return (a * (a + 1)) / 2;
    }
}