package day40_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class StringNumbersToSum {
    /*
    Create a method that will accept an ArrayList of numbers in String
    format, add each digit of each element and store into a different
    ArrayList. Return the ArrayList of summed numbers
    Ex:
    Input:
    “123”, “34”, “513”
    Output:
    [ 6, 7, 9 ]
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "34", "513"));
        System.out.println(numbersToSum(list));

        System.out.println(numbersToSum2(list));
    }

    public static ArrayList<Integer> numbersToSum(ArrayList<String> list) {

        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int number = 0;
            String[] each = list.get(i).split("");
            for (int j = 0; j < each.length; j++) {
                number += Integer.parseInt(each[j]);
            }
            newList.add(number);
        }

        return newList;
    }

    // approach 2 (with Saim)
    public static ArrayList<Integer> numbersToSum2(ArrayList<String> list) {
        ArrayList<Integer> sums = new ArrayList<>();

        for (String each : list) {
            int number = 0;
            for (String eachDigit : each.split("")) {
                number += Integer.parseInt(eachDigit);
            }
            sums.add(number);

        }
        return sums;
    }
}
