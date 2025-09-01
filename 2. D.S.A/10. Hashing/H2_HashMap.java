// HashMap = HashSet + index Value

import java.util.Map;
import java.util.HashMap;

public class H2_HashMap {
    public static void main(String[] args) {
        // Country(key), Population(Value)
        HashMap<String,Integer> map = new HashMap<>();

        // 1. Insertion ...
        map.put("India",120);
        map.put("Us",30);
        map.put("Chaina",150);
        map.put("Russia",40);

        // Print all values
        System.out.println(map);

        map.put("Chaina",160);
        map.put("Uk",60);
        System.out.println(map);

        // 2. Search
        // Contains Key
        if(map.containsKey("Chaina")) {
            System.out.println("The key is present in the map.");
        } else {
            System.out.println("The key is present in the map.");
        }
        // Contains Value
        if(map.containsValue(120)) {
            System.out.println("The value is present in the map.");
        } else {
            System.out.println("The value is present in the map.");
        }

        // 3.get Function...
        System.out.println(map.get("Chaina"));      // key exixts
        System.out.println(map.get("Pakistan"));      // key does not exixts
        

        // 4. Travers  for(int val : arr)
        for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey()+ ": "+ e.getValue());
        }
        System.out.println();

        // Remove 
        map.remove("Chaina");
        System.out.println(map);
    }
}