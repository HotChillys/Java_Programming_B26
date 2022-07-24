package day64_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Recap {
    public static void main(String[] args) {
        /*
        create a function that can verify if a number contains duplicate digits
         */

        Predicate<Integer> verifyDuplicates = n -> {
          String str = n + "";
          String uniques = "";

            for (int i = 0; i < str.length(); i++) {
                if (!uniques.contains("" + str.charAt(i))){
                    uniques  += str.charAt(i);
                } else {
                    return true;
                }
            }
            return false;
        };
        System.out.println(verifyDuplicates.test(1233));
        System.out.println();

        // create a function that can return the longest String from a List of String

        // List<String> --> parameter
        // String -> return type
        Function<List<String>, String>  longestStringFromList = (list) -> {
            String longest = "";
            for (String each : list) {
                if (each.length() > longest.length()) {
                    longest = each;
                }
            }

            return longest;
        };

        System.out.println(longestStringFromList.apply(new ArrayList<>(Arrays.asList("hello", "apple", "java", "really long word", "small world"))));









    }
}
