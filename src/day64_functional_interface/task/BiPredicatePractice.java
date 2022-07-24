package day64_functional_interface.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicatePractice {
    public static void main(String[] args) {
        /*
         1.1 Create a function that can check if two array are equal and contains the same elements
                ex: arr1 = {3,2,1}
                    arr2 = {2,1,3}
                output: true
         */
        BiPredicate<String[], String[]> compareArrays = (arr1, arr2) -> {
            return Arrays.equals(arr1, arr2);
        };
        String [] arr1 = {"me", "you", "she", "he"};
        String [] arr2 = {"me", "you", "she", "he"};
        System.out.println(compareArrays.test(arr1, arr2));

        /*
         1.2 Create a function that can check if the first array contains all the elements of the second array:
                ex: arr1 = {1,2,3,4,5,6}
                    arr2 = {7,8}
                output: false
         */
        BiPredicate<String[], String[]> containsArrays = (one, two) -> {
            List<String> list1 = new ArrayList<>(Arrays.asList(one));
            List<String> list2 = new ArrayList<>(Arrays.asList(two));
            return list1.contains(list2);
        };













    }
}
