// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

import java.util.LinkedList;

public class dz1 {
    public static void main(String[] args) {
        createSpisok();
    }

    public static void createSpisok() {
        LinkedList<Integer> elems = new LinkedList<Integer>();
        elems.add(6);
        elems.add(9);
        elems.add(7);
        elems.add(4);
        elems.add(3);
        System.out.println("Изначальный список: " + elems);
        LinkedList<Integer> reverseElems = new LinkedList<Integer>();
        for (int j = elems.size() - 1; j >= 0; j--)
        reverseElems.add(elems.get(j));
        System.out.println("Перевёрнутый список: " + reverseElems);
    }
}
