package day64_functional_interface.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionPractice {
    public static void main(String[] args) {
        /*
        Use BiFunction functional interface to:
        1.1 Create a function that can returns the common characters of two strings
                ex: str1 = "Python"
                    str2 = "Wooden Spoon"
                output: on
         */
        BiFunction<String, String, String> commonCharacter = (str1, str2) -> {
            String s = "";

            if (str1.length() > str2.length()) {
                for (int i = 0; i < str1.length(); i++) {
                    if (str1.contains(str1.charAt(i) + "") && str2.contains(str1.charAt(i) + "")) {
                        if (!s.contains(str1.charAt(i) + "")) {
                            s += str1.charAt(i);
                        }
                    }
                }
            }
            if (str2.length() > str1.length()) {
                for (int i = 0; i < str2.length(); i++) {
                    if (str2.contains(str2.charAt(i) + "") && str1.contains(str2.charAt(i) + "")) {
                        if (!s.contains(str2.charAt(i) + "")) {
                            s += str2.charAt(i);
                        }
                    }
                }
            }
            return s;
        };
        String a = "Wooden Spoon";
        String b = "Python";
        System.out.println(commonCharacter.apply(a, b));

        /*
        Create a function that can return the common elements of two Lists of Integers
         */
        BiFunction<List<Integer>, List<Integer>, List<Integer>> commonElements = (list1, list2) -> {
            List<Integer> newList = new ArrayList<>();
            for (int i = 0; i < list1.size(); i++) {
                if (list1.contains(list2.get(i))) {
                    newList.add(list2.get(i));
                }
            }
            return newList;
        };
        List<Integer> newList1 = new ArrayList<>(Arrays.asList(3, 6, 9, 7, 4, 3, 6));
        List<Integer> newList2 = new ArrayList<>(Arrays.asList(2, 3, 9, 1, 4, 3, 5));
        System.out.println(commonElements.apply(newList1, newList2));

    }
}
