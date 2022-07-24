package day40_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {
    /*
    Create a method that will accept an ArrayList of Strings and an int. Remove any String elements that have less characters than the given number. Return the modified ArrayList of Strings
    @param list - Given ArrayList of Strings
    @param int - max number of characters
    @return - ArrayList of Strings
    Ex: {“one,”, “two”, “three, “four”, “five”, “six”}
    Max number: 4
    Output: {“three, “four”, “five”
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ont", "two", "three", "four", "five", "six"));
        int number = 4;
        System.out.println(keepLongString(list, number));
    }

    public static ArrayList<String> keepLongString(ArrayList<String> list, int num) {

        list.removeIf(each -> each.length() < num);

        return list;
    }
}
