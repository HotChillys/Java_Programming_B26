package Foo_IQ.mentor_java_tasks;

import java.util.*;

public class MapTasks {

    /*
    Map -- Sort the map by values
Write a method that can sort the Map by values
     */
    public static Map<Integer, Integer> sortByValue(Map<Integer, Integer> map) {



        return map;
    }

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 5);
        map.put(3, 8);
        Set<Integer> set = new HashSet<>(map.values());

        for (int i = 0; i < map.size(); i++) {

        }

        System.out.println(sortByValue(map));






    }
}
