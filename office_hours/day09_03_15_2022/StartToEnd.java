package day09_03_15_2022;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.EnumSet;

public class StartToEnd {
    public static void main(String[] args) {
        /*
        Write a program that accepts start and end numbers. Given start and end
          numbers, return a new array containing the sequence of integers from start up to
          but not including end, so start=5 and end=10 yields [5, 6, 7, 8, 9].

                Input:
                        start = 5    end = 10
                Output
                        int[] a → [5, 6, 7, 8, 9]
                Input:
                        start = 11    end = 18
                Output
                        int[] b → [11, 12, 13, 14, 15, 16, 17]
         */
        int start = 11;
        int end = 18;
        int index = 0;

        for (int n = start ; n < end; n++) {
            index++;
        }

        int[] nums = new int[index];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = start ;
            start++;
        }
        System.out.println(Arrays.toString(nums));

// if we want to print without bracket
//        for (int each : nums) {
//            System.out.print(each + " ");
//        }

        System.out.println();
        System.out.println("Mehmet way of doing it");
        int s = 5;
        int e = 10;
        int [] newArray = new int[e-s];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = s++;
        }
        System.out.println(Arrays.toString(newArray));

        // Increase all value of element by 1
        for (int i = 0; i < newArray.length; i++) {

            // newArray[i]=newArray[i]+1;
            newArray[i]+=1;
        }
        System.out.println(Arrays.toString(newArray));

        // Do it same thing with FOR EACH
        for (int each : newArray) {

            // each=each+1;

            each+=1;
            System.out.print(each + " "); // this will print without bracket, means this won't print as an Array
        }

        System.out.println();
        System.out.println(Arrays.toString(newArray));




    }
}
