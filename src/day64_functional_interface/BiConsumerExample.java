package day64_functional_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        BiConsumer<String, Integer> printNTimes = (str, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.print(str + " ");
            }
            System.out.println();
        };
        printNTimes.accept("java", 4);
        printNTimes.accept("selenium", 5);
        System.out.println();

        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.forEach( (key, value) -> {
            System.out.println(key + " " + value);
        } );

        map.forEach( (key, value) -> {
            System.out.println(value + key.length());
        } );









    }
}
