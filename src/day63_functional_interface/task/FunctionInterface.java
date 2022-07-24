package day63_functional_interface.task;

import java.util.*;
import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        /*
        Create a function that can return the sum of digits from a string that contains number digits
         */
        Function<String, Integer> sumOfDigits = str -> {

            int sum = 0;
            String s = "";
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    s += str.charAt(i);
                    sum += Integer.parseInt(s);
                    s = "";
                }
            }
            return sum;
        };
        System.out.println(sumOfDigits.apply("523gta45f7"));

        /*
        Create a function that can convert a Set of Integers to List of Integers
         */
        Function<int [] , List<Integer>> setToList = array1-> {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < array1.length; i++) {
                list.add(array1[i]);
            }
            return list;
        };
        int[] arr2 = {3, 7, 9, 5, 6};
        System.out.println(setToList.apply(arr2));

        /*
        Create a function that can return the reversed version of a String array
         */
        Function<String[], String[]> reverseStringArray = arr -> {
            List<String> list = new ArrayList<>();
            for (int i = arr.length -1; i >= 0 ; i--) {
               list.add(arr[i]);
            }
            arr = list.toArray(arr);
            return arr;
        };
        String [] arr = {"Anna", "you", "me", "jack"};
        System.out.println(Arrays.toString(reverseStringArray.apply(arr)));

    }
}
