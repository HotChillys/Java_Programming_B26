package day61_maps;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("saim", "java");
        map.put("hello", "world");
        map.put("james", "bond");
        map.put("aysun", "selenium");
        map.put("nadir", "soft skills");
        map.put("username", "password");
        map.put(null, "nothing");
        System.out.println(map);

        Map<String, String> linked = new LinkedHashMap<>();
        linked.put("saim", "java");
        linked.put("hello", "world");
        linked.put("james", "bond");
        linked.put("aysun", "selenium");
        linked.put("nadir", "soft skills");
        linked.put("username", "password");
        linked.put(null, "nothing"); // null key allowed
        System.out.println(linked); // maintain insertion order

        Map<String, String> treeMap = new TreeMap<>(); // implements SortedMap
        treeMap.put("saim", "java");
        treeMap.put("hello", "world");
        treeMap.put("james", "bond");
        treeMap.put("aysun", "selenium");
        treeMap.put("nadir", "soft skills");
        treeMap.put("username", "password");
       // treeMap.put(null, "nothing"); // TreeMap objects cannot have null Key
        System.out.println(treeMap); // maintain natural order

        Map<String, String> hashTable = new Hashtable<>();  // same as HashMap, but doesn't accept null key
        hashTable.put("saim", "java");
        hashTable.put("hello", "world");
        hashTable.put("james", "bond");
        hashTable.put("aysun", "selenium");
        hashTable.put("nadir", "soft skills");
        hashTable.put("username", "password");
        // hashTable.put(null, "nothing");
        System.out.println(hashTable);




    }
}
