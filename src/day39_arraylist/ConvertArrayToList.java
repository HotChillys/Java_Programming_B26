package day39_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConvertArrayToList {
    public static void main(String[] args) {

        Scanner [] s = new Scanner[2];

        Integer [] arr = {1, 2, 3}; // we made an Integer array because Arraylist does not accept primitive types

        Arrays.asList(arr); // converts the array to a collection type

        ArrayList<Integer> nums = new ArrayList<>( Arrays.asList(arr) ); // creating an Arraylist with values from a collection type
        System.out.println(nums);

        // Creating an Arraylist with some initial values

        ArrayList<Integer> other = new ArrayList<>(Arrays.asList (4, 5, 6, 7) );
        System.out.println(other);

        other.add(8);
        System.out.println(other);








    }
}
