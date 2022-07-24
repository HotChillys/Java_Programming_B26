package day40_Arraylist;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {
    public static void main(String[] args) {
        /*
        Create a method that will take an ArrayList of Strings and
        reverse each element and return an ArrayList of
        all reversed words
        @param words - Given ArrayList of Strings
        @return - ArrayList of Strings
        Ex:
        Input: {"ted", "talk", "learn"}
        Output: {"det", "klat", "nrael"}
         */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(reverseAll(list));

        System.out.println(reverseAll2(list));

        System.out.println(reverseAll2(ArraylistWithMethod.getDaysOfWeek()));

    }

    public static ArrayList<String> reverseAll(ArrayList<String> list){

       String [] words = list.toArray(new String[list.size()]);
        for (int i = 0; i < words.length; i++) {
            words[i] = StringUtil.reverse(words[i]); // from StringUtil class
        }
        ArrayList<String> newList = new ArrayList<>(Arrays.asList(words));
        return newList;
    }

    // approach 2 (with Saim)
    public static ArrayList<String> reverseAll2(ArrayList<String> list){

        ArrayList<String> reverseWord = new ArrayList<>();

        for (String each : list) {
            each = StringUtil.reverse(each); // from StringUtil class
            reverseWord.add(each);
        }

        return reverseWord;
    }
}

