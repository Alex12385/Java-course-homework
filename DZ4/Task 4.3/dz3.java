//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор


import java.util.LinkedList;
import java.util.Random;

public class dz3 {
    public static void main(String[] args) {
        createSpisok();
    }

    public static void createSpisok() {
       
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(100));
        }
        int sum = 0;
        for (Integer integer : linkedList) {
            sum += integer;
        }
        System.out.println("Список элементов: " + linkedList);
        System.out.println("Сумма всех элементов списка: " + sum );
    }
}
