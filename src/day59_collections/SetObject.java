package day59_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObject {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add(null);
        set.add("Hello");
        set.add("$4.5");
        set.add("400");
        set.add("Hello"); // HashSet does not allow duplicate value
        set.add("%");
        System.out.println(set); // random order, no index

        Set<String> set2 = new LinkedHashSet<>();
        set2.add(null);
        set2.add("Hello");
        set2.add("$4.5");
        set2.add("400");
        set2.add("Hello"); // LinkedHashSet does not allow duplicate value
        set2.add("%");
        System.out.println(set2); // maintains insertion order, no index

        Set<String> set3 = new TreeSet<>();
        //set3.add(null);  // null not allowed in TreeSet
        set3.add("Hello");
        set3.add("$4.5");
        set3.add("400");
        set3.add("Hello"); // TreeSet does not allow duplicate value
        set3.add("%");
        set3.add("400");
        set3.add("world");
        System.out.println(set3); // sorted order, no index




    }
}
