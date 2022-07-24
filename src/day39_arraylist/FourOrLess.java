package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
        /*
        Given an ArrayList of Strings, go through and find Strings that are 4
        characters or less. Take those Strings and put them into a different
        ArrayList. Print that ArrayList of words
        Ex:
        Input:
        “apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
        Output:
        [ tree, loop, cat ]
         */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "tree", "loop", "cat", "animal", "shortcut"));

        String [] newList = list.toArray(new String [list.size()]);

        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < newList.length; i++) {
            if (newList[i].length() < 5) {
                words.add(newList[i]);
            }
        }
        System.out.println(words);



    }
}
