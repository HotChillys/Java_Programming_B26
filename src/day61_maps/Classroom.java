package day61_maps;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    /*
    rank
    1       -student
    2       -student
    3       -student
    4       -student
    5       -student
     */
    public static void main(String[] args) {

        Map<Integer, Student> map = new HashMap<>();

        map.put(1, new Student("James", 4.0, 7));
        Student obj = new Student("Hanna", 3.9, 1);
        map.put(2, obj);
        map.put(3, new Student("Diana", 3.8, 4));
        map.put(4, new Student("Jehad", 3.7, 20));

        System.out.println(map);

        System.out.println(map.get(1));
        System.out.println(map.get(4).name);

        // looping through the map:
        System.out.println();

        System.out.println(map.keySet());
        for (int keys : map.keySet()) { // keySet is all the Keys in the map
            System.out.println("Rank: " + keys);
            System.out.println(map.get(keys));
            System.out.println();
        }
        System.out.println("===================");
        System.out.println(map.values());

        // another way to loop by value
        for (Student student : map.values()) {
            if (student.id <= 10) {
                System.out.println(student);
            }
        }

        // another way to loop through map
        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
            System.out.println("Rank:  " + entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
        }

    }
}
