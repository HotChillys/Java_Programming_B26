package day64_functional_interface;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        /*
        check the array if it contains the given number
         */

        BiPredicate<Integer [], Integer> contains = (arr, num) -> {

            for (int each : arr) {
                if (each == num) { // if it is true, arr contains num
                    return true;
                }
            }
            return false;
        };
        Integer [] arr = {4, 5, 12, 10, 24};

        System.out.println(contains.test(arr, 6));
        System.out.println(contains.test(arr, 4));
        System.out.println(contains.test(arr, 13));

        BiPredicate<String, String> anagram = (one, two) -> {
            char [] oneArr = one.toCharArray();
            char [] twoArr = two.toCharArray();
            Arrays.sort(oneArr);
            Arrays.sort(twoArr);
            return Arrays.equals(oneArr, twoArr);
        };
        System.out.println(anagram.test("listen", "silent"));
        System.out.println(anagram.test("you", "one"));





    }
}
