
import java.util.LinkedList;

public class MyClass<L> {
    private LinkedList<L> links;

    public MyClass(LinkedList<L> links) {
        this.links = links;
    }

    public MyClass() {
        this(new LinkedList<L>());
    }

    public void enqueue(L str) {
        links.add(str);
    }

    public L dequeue() {
        L first_elem = links.get(0);
        links.remove(0);
        return first_elem;
    }

    public L first() {
        return links.get(0);
    }

    public LinkedList<L> getEn() {
        LinkedList<L> list = new LinkedList<L>();
        for (int i = 0; i < links.size(); i++) {
            list.add(links.get(i));
        }
        return list;
    }

    public Integer size() {
        return links.size();
    }

}