package Foo_IQ;

import java.util.Arrays;

public class FindMissingNumber {
    /*
    Given an array size of 99, all the numbers are unique. from numbers between 1 - 100, there is one number missing from the array. write a function to find that missing number
     */

    public static int missingNumber(int [] arr){

        int range = arr.length + 1;
        int missingNumber = 0;

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            int count = 0;

            for (int j = 1; j < range; j++) {
                if (arr[i] == j) {
                    count++;
                }
                if (count == 1) {
                    break;
                }
            }

            if (count == 0) {
                missingNumber = i;
                break;
            }
        }


        return missingNumber;
    }
}
