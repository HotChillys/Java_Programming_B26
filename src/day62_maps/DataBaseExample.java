package day62_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {
    public static void main(String[] args) {
        /*
            People
                FIRST_NAME: James
                LAST_NAME: Bond
                BATCH: 7
         */
        Map<String, String> map = new HashMap<>();
        map.put("FIRST_NAME", "James");
        map.put("LAST_NAME", "Bond");
        map.put("BATCH", "7");

        System.out.println(map);

        //List<String> --> this is String elements
        List<Map<String, String>> list = new ArrayList<>();
        list.add(map);
        list.add(makeMap("Shina", "Rocks", "26"));//index 1
        list.add(makeMap("Tyler", "Potter", "20"));//index 2
        list.add(makeMap("Megan", "vera", "28"));//index 3
        list.add(makeMap("Amy", "Good", "6"));//index 4
        list.add(makeMap("Tom", "Hardy", "5"));//index 5
        list.add(makeMap("Ted", "Talks", "25"));//index 6

        System.out.println();

        //go through the ArrayList of Map elements - the map elements are the information for each person
        for (Map<String, String> each : list) {
            System.out.println(each);
        }
        System.out.println();

        //Go through all the people and print all the first name
        for (Map<String, String> each : list) {
            System.out.println(each.get("FIRST_NAME"));
        }
        System.out.println();

        //find all the batch number over 20
        for (Map<String, String> each : list) {
            if (Integer.parseInt(each.get("BATCH")) >= 20 ){
                System.out.println(each.get("FIRST_NAME"));
            }
        }
        System.out.println();

        //print the information of last person on the list
            System.out.println("First name: " + list.get(list.size() - 1).get("FIRST_NAME"));
            System.out.println("First name: " + list.get(list.size() - 1).get("LAST_NAME"));
            System.out.println("First name: " + list.get(list.size() - 1).get("BATCH"));
        System.out.println();

        // how can i check the last name of the map I just added
        System.out.println(list.get(1).get("FIRST_NAME"));
        // first get is from the list by index, then we have the get method from map to give the value by the key
        System.out.println(list.get(1).get("LAST_NAME"));



    }
    public static Map<String, String> makeMap (String ... values){
        Map<String, String> map = new HashMap<>();
        map.put("FIRST_NAME", values[0]);
        map.put("LAST_NAME", values[1]);
        map.put("BATCH", values[2]);
        return map;
    }
}
