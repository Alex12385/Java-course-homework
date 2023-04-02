//Пусть дан произвольный список целых чисел, удалить из него четные числа


import java.util.ArrayList;
import java.util.List;

public class dz1 {
    public static void main(String[] args) {
        createSpisok();
    }

    public static void createSpisok() {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(4);
        list1.add(6);
        for (int i = 0; i < list1.size(); i++) {
            int even = list1.get(i) % 2;
            if (even == 0) {
                list1.remove(i);
                i--;
            }
        }
        System.out.println("Нечётные числа: "+ list1);
    }
}

