package day59_collections;

import java.util.*;

public class ListObject {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // reference of the interface List

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(null); // it allows us to add null
        list.add("a"); // it allows us to add duplicate
        System.out.println(list);
        System.out.println(list.get(3));

        List<String> list2 = new LinkedList<>(); // reference of the interface List, but the object is LinkedList object
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add(null);
        list2.add("a");
        System.out.println(list2);
        System.out.println(list2.get(3));

        List<String> list3 = new Vector<>();
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        list3.add(null);
        list3.add("a");
        System.out.println(list3);
        System.out.println(list3.get(3));

        System.out.println(new HashSet<>(Arrays.asList(1, 5, 2, 1, 4, 2, 5, 1)));
        // does not allow duplicate

        String s = "aaaaaabbbbbbbbcccccccccdddddddeeeee";
        System.out.println( new HashSet<>(Arrays.asList(s.split("")))
                .toString()
                .replace(", ", "")
                .replace("[", "")
                .replace("]", "")
        );
        // above we convert the String s to an Array
        // that Array is the argument of the Arrays.asList method()
        // that Array os converted to as Lost type which is allowed int the HashSet constructor because List is a Collection and Collection is the parameter type convert the HashSet - which removed the duplicates, to a String and did String manipulation







    }
}
