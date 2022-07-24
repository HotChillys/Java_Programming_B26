package day61_maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {

        // keys are Integer, and values are String
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(3, "three");
        map.put(10, "ten");
        map.put(5, "five");
        System.out.println(map);//HashMap element order is random, not insertion order, not sorted

        //read the Key/value from map

        System.out.println(map.get(10)); // argument is the Key, not index

        String value = map.get(5); // we can assign String value to String, because it returns the value

        map.remove(1);
        System.out.println(map);

        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(3));

        System.out.println(map.containsValue("five"));
        System.out.println(map.containsValue("10"));

        map.put(null, null);
        System.out.println(map);

        map.put(null, "hello"); // null key exists, so the value gets updated to hello
        System.out.println(map);

        map.put(3, "march"); // 3 Key exists, the value gets updated to march
        System.out.println(map);

        map.put(7, "march");
        System.out.println(map);

    }
}
