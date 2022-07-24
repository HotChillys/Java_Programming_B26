package day63_functional_interface.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class UseListFunction {
    public static void main(String[] args) {
        /*
        1 Create a function that can return the maximum number from a list of Integer
         */

        Function<List<Integer >, Integer> findMax = list -> {

            Integer max = 0;
            for (Integer each : list) {
                if (each > max) {
                    max = each;
                }
            }
            return max;
        };

        System.out.println(findMax.apply(Arrays.asList(2, 3, 1, 4)));

        /*
        2 Create a function that can return the minimum number from a list of Integer
         */
        Function<List<Integer >, Integer> findMin = list -> {

            Integer min = Integer.MAX_VALUE;
            for (Integer each : list) {
                if (each < min) {
                    min = each;
                }
            }
            return min;
        };
        System.out.println(findMin.apply(Arrays.asList(1, 4, 7, 3, 6)));


        /*
        Create a function that can return the longest String from a List of String
         */
        Function<List<String>, String> longestString = list -> {
            int count = 0;
            String longest = "";
            for (int i = 0; i < list.size(); i++) {
                ;
                if (list.get(i).length() > count){
                    count = list.get(i).length();
                    longest = list.get(i);
                }
            }
            return longest;
        };
        System.out.println(longestString.apply(new ArrayList<>(Arrays.asList("Canada", "japan", "America"))));

        /*
        Create a function that can return the shortest String from a List of String
         */
        Function<List<String>, String> shortestString = list -> {
            int count = Integer.MAX_VALUE;
            String shortest = "";
            for (int i = 0; i < list.size(); i++) {

                if (list.get(i).length() < count){
                    count = list.get(i).length();
                    shortest = list.get(i);
                }
            }
            return shortest;
        };
        System.out.println(shortestString.apply(new ArrayList<>(Arrays.asList("Canada", "japan", "America"))));

        /*
        Create a function that can convert List of integer to int array
         */
        Function<List<Integer>, int []> listToArray = list -> {
            int [] arr = new int[list.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = list.get(i);
            }
            return arr;
        };

        System.out.println(Arrays.toString(listToArray.apply(new ArrayList<>(Arrays.asList(1, 4, 6, 9, 0)))));

        /*
        Create a function that can convert List of double to double array
         */
        Function<List<Double>, double []> doubleListToArray = list -> {
            double [] arr = new double[list.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = list.get(i);
            }
            return arr;
        };
        System.out.println(Arrays.toString(doubleListToArray.apply(new ArrayList<>(Arrays.asList(0.6, 4.6, 5.7)))));









    }
}
