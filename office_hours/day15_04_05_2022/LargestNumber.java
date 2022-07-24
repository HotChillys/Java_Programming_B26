package day15_04_05_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestNumber {
    public static void main(String[] args) {
        /*
            write a program that can return the nth largest number from an arraylist

                    			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
                    			n = 5

                    			output:
                    				4
         */
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));
        int n = 5;

        System.out.println(nthLargestNumber(list, n));
    }

    public static int nthLargestNumber(ArrayList<Integer> list, int n) {
        Collections.sort(list);
        return list.get(list.size() - n);
    }
}
