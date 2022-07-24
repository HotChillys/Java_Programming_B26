package Foo_IQ.mentor_java_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SameLetters {
    /*
        Write a return method that check if a string is build out of the same letters as another string.
        Ex:  same("abc",  "cab"); -> true
        same("abc",  "abb"); -> false:

     */
    public static void main(String[] args) {
        String a = "abc";
        String b = "bca";
        System.out.println(sameLetters(a, b));
        System.out.println(same(a, b));

    }

    public static boolean sameLetters(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(a.split("")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(b.split("")));

        Collections.sort(list1);
        Collections.sort(list2);

        if (list1.equals(list2)) {
            return true;
        }
     return false;
    }

public static boolean same(String a, String b) {

    if (a.length() != b.length()) {
        return false;
    }

        String [] one = new String[a.length()];
        one = a.split("");

        String [] two = new String[b.length()];
        two = b.split("");

        Arrays.sort(one);
        Arrays.sort(two);

        if (Arrays.equals(one, two)) {
            return true;
        }
        return false;
}
}
