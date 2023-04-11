import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Sortnames {
    private TreeMap<Integer, List<String>> matchList;

    private List<String> splitNames(String names) {
        return List.of(names.split(", "));
    }

    private List<String> getNames(List<String> namesAndSurnames) {
        List<String> list = new ArrayList<>();

        for (String nameAndSurname : namesAndSurnames) {
            list.add(nameAndSurname.split(" ")[0]);
        }

        return list;
    }

    public TreeMap<Integer, List<String>> getMatchList(String str) {
        matchList = new TreeMap<>((o1, o2) -> Integer.compare(o2,o1));

        for (String name : getNames(splitNames(str))) {
            int count = 0;

            for (int i = 0; i < getNames(splitNames(str)).size(); i++) {
                if (getNames(splitNames(str)).get(i).equals(name)) {
                    count++;
                }
            }

            if (!matchList.containsKey(count)) {
                matchList.put(count, new ArrayList<>());
            }

            if (!matchList.get(count).contains(name)) {
                matchList.get(count).add(name);
            }
        }

        return matchList;
    }
}
