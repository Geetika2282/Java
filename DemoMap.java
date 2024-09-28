import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // Adding in map
        map.put("one", 100);
        map.put("two", 200);
        map.put("three", 300);

        // prints
        System.out.println(map.get("two"));

        Set<String> keyset = map.keySet();
        for (String key: keyset){
            System.out.println(key + "-> " + map.get(key));
        }

        System.out.println("----------");
        map.remove("three");
        keyset = map.keySet();
        keyset = map.keySet();
        for (String key: keyset){
            System.out.println(key + "->" + map.get(key));

        }
    }
}
