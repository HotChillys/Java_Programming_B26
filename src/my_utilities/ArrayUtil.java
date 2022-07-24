package my_utilities;

import java.util.Arrays;

public class ArrayUtil {

    //find min number in given Array
    public static int minNumber(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    //find min number in given array, using sorting
    public static int minNumberSort(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

    //find max number in given array
    public static int maxNumber(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    //Check to see if int number is contains in an int array
    public static boolean contains(int[] nums, int element) {
        for (int each : nums) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    //add given int number to end of an int array
    public static int [] addNumberToArray(int [] nums, int number) {
       int []  newArray = Arrays.copyOf(nums, nums.length + 1);
        newArray[nums.length] = number;
        return newArray;
        // not done yet
    }



}
