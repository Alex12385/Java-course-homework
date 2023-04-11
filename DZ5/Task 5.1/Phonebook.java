
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    Map<String, String> map = new HashMap<>();

    void add(String phone, String name) {
        map.put(phone, name);

    }

    void getByName(String name) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(name)) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

    void printBook() {
        System.out.println("Справочник: \n" + map.entrySet());
    }

}
