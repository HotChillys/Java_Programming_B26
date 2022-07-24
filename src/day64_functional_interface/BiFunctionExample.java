package day64_functional_interface;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        //compare two numbers, find the biggest one

        // first two types are parameter type
        // last type is return type
        BiFunction<Integer, Integer, Integer> maxNumber = (one, two) -> {
            return one > two ? one : two;
        };
        System.out.println(maxNumber.apply(5, 2));

        // List<Integer> --> keys -> first parameter
        // List<String> --> values -> second parameter
        // Map<Integer, String> --> final map that will be return type
        BiFunction<List<Integer>, List<String>, Map<Integer, String>> createMap = (keys, values) -> {
            Map<Integer, String> map = new HashMap<>();
            for (int i = 0; i < keys.size(); i++) {
                map.put(keys.get(i), values.get(i));
            }
            return map;
        };
        List<Integer> keys = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<String> values = new ArrayList<>(Arrays.asList("James", "ana", "Emre", "Saim"));

        System.out.println(createMap.apply(keys, values));










    }
}
