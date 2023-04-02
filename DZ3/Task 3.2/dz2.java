//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;
import java.text.DecimalFormat;

public class dz2 {
    public static void main(String[] args) {
        createSpisok();
    }

    public static void createSpisok() {

        List<Integer> list2 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            list2.add(random.nextInt(100));
        }
        System.out.println("Произвольный список " + list2);
        int min = Collections.min(list2);
        int max = Collections.max(list2);
        int summ = 0;
        for (int i : list2) {
            summ += i;
        }
        double average = (double) summ / list2.size();
        DecimalFormat dF = new DecimalFormat("#.##");
        double value = average;
        
        System.out.println("Максимальное число: " + max +
                "\nМинимальное число: " + min +
                "\nсреднее арифметическое: " + dF.format(value));

    }
}
