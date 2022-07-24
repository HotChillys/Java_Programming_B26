package day65_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Recap {
    public static void main(String[] args) {
                /*
         1.1 Create a function that can check if two array are equal and contains the same elements
                ex: arr1 = {3,2,1}
                    arr2 = {2,1,3}
                output: true
         */

        BiPredicate<int [], int []> arrayIsEqual = (one, two) -> {
            Arrays.sort(one);
            Arrays.sort(two);
            return Arrays.equals(one, two);
        };
        int[] arr1 = {3,2,1};
        int [] arr2 = {2,1,3};
        System.out.println(arrayIsEqual.test(arr1, arr2));

                /*
         1.2 Create a function that can check if the first array contains all the elements of the second array:
                ex: arr1 = {1,2,3,4,5,6}
                    arr2 = {7,8}
                output: false
         */
        BiPredicate<int[], int[]> firstContains = (one, two) -> {
//           List<Integer> list = new ArrayList<>();
//           List<Integer> list1 = new ArrayList<>();

            for (int outer : two) {
                boolean check = false;

                for (int inner : one) {
                    if (outer == inner) {
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    return false; // because the number was not in the first array
                }
            }
        return true;
        };
        int[] arr3 = {1,2,3,4,5,6};
        int[] arr4 = {2,2};
        System.out.println(firstContains.test(arr3, arr4));

        // merge two arrays into a List
        BiFunction<int[], int[], List<Integer>> mergeToList = (one, two) -> {
            List<Integer> list = new ArrayList<>();
            for (int each : one) {
                list.add(each);
            }
            for (int each : two) {
                list.add(each);
            }
            return list;
        };
        int [] arr5 = {1, 2, 3, 6};
        int [] arr6 = {5, 6, 7};
        System.out.println(mergeToList.apply(arr5, arr6));



    }
}
