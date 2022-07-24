package day32_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {

        int [] arr = {30, 90, 60, 360, 180};
        int [] arr2 = {180, 360, 30, 90, 60};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.equals(arr, arr2));//compare Arrays

        System.out.println("Before sorting: " + Arrays.equals(arr, arr2));//compare Arrays

        Arrays.sort(arr);//sort Array
        Arrays.sort(arr2);//sort Array

        System.out.println("After sorting: " + Arrays.equals(arr, arr2));//compare Arrays

        String [] words = {"Hello", "Java", "Saturday"};
        System.out.println(String.join(" ### ", words));//join method

        String str = "Today is Saturday";
        System.out.println(Arrays.toString(str.toCharArray()));// to char array method
        System.out.println(Arrays.toString(str.split(" ")));// split method





    }
}
