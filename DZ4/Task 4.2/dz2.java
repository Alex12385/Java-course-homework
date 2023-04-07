// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.

public class dz2 {
    public static void main(String[] args) {
        MyClass<Integer> elems = new MyClass<Integer>();
        elems.enqueue(3);
        elems.enqueue(5);
        elems.enqueue(7);
        elems.enqueue(9);
        elems.enqueue(12);
        System.out.println("Добавленные элементы: " + elems.getEn());
        System.out.println("Выводим первый элемент и удаляем его из очереди: " + elems.dequeue());
        System.out.println("Оставшиеся элементы: " + elems.getEn());
        System.out.println("Выводим первый элемент, не удаляя его из очереди: " + elems.first());
        System.out.println("Оставшиеся элементы: " + elems.getEn());
    }
}