package day40_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    /*
    Create a method that will take an ArrayList of numbers and remove any duplicates values.
    The method will return an ArrayList of unique elements.
    @param nums - The given ArrayList of numbers
    @return - ArrayList of numbers
    Ex:
    Input: {1, 3, 5, 1, 4, 5, 9};
    Output: {3, 4, 9};
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(removeDuplicates(list));

    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        list.removeIf( number -> Collections.frequency(list, number) > 1 );
return list;
    }
}
