package day60_collections;

import java.util.*;

public class SetVsList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(10);
        list.add(4);
        System.out.println(list);
        System.out.println("first: " + list.get(0));
        System.out.println("last: " + list.get(list.size() -1));


        Set<Integer> list2 = new HashSet<>();
        list2.add(4);
        list2.add(10);
        list2.add(1);
        list2.add(2);
        list2.add(-5);
        list2.add(10);
        list2.add(4);
        System.out.println(list2);
       // System.out.println("first: " + list2.get(0));
        //System.out.println("last: " + list2.get(list.size() -1));
        // Set does not have indexes

        for (int each : list2) {
            System.out.println(each);
        }

        // sort my HashSet
        System.out.println(new TreeSet<>(list2));

        // converting list to list2
        System.out.println(new LinkedHashSet<>(list));
    }
}
