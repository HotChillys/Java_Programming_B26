package Foo_IQ.mentor_java_tasks;

import java.util.Arrays;

public class FindMaxAndMin {
    /*
    Write a method that can find the maximum number from an int Array
    Write a method that can find the maximum number from an int Array
     */
    public static int findMax (int [] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int [] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr = {3, 8, 4, 56, 2, 43};
        System.out.println(findMax(arr));
        System.out.println(findMin(arr));

    }

}
