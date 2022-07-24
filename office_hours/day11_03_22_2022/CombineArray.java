package day11_03_22_2022;

import java.util.Arrays;

public class CombineArray {
    /*
     Create a method that can print out the combination of two integer arrays
                int[] array1 = {1,2,3,4};
                int[] array2 = {5,6,7,8,9,10};

                Output:   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     */
    public static void combineArray(int [] array1, int [] array2) {
        int [] newArray = new int[array1.length + array2.length];
        int index = 0;
        for (int element : array1) {
            newArray[index] = element;
            index++;
        }
        for (int element : array2) {
            newArray[index] = element;
            index++;
        }

        System.out.println(Arrays.toString(newArray));

    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8,9,10};
        combineArray(array1, array2);
    }
}
