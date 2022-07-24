package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {
        /*
        Given an ArrayList of Strings and a target word (String) print how many
        times the target word is in the ArrayList
        Ex:
        Input:
        ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
        Target: java
        Output:
        2
         */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));

        int count = 0;
        for (String each : list) {
            if (each.equals("java")) {
                count++;
            }
        }
        System.out.println(count);






    }
}
