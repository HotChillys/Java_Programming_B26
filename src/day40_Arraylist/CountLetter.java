package day40_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetter {
    /*
    Create a method that will accept an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements
    Ex:
    Input:
    ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
    letter: ‘a’
    Output:
    6
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        char letter = 'a';
        System.out.println(countLetter(list, letter));
    }

    public static int countLetter(ArrayList<String> list, char letter) {
        int count = 0;

        for (String each : list) {

            for (int i = 0; i < each.length(); i++) {
                if (each.charAt(i) == 'a') {
                    count++;
                }
            }

        }
        return count;
    }


}
