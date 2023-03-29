
//Вычислить n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int num = in.nextInt();
            int f = 1;
            for (int i = 1; i <= num; i++) {
                f *= i;
            }
            System.out.println("Факториал числа: " + f);
        }
    }
}
