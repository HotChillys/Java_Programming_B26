package day32_array;

import java.util.Arrays;

public class Multiply2dArrays {
    public static void main(String[] args) {
        /*
        Given two 2D arrays multiply them together and store the results into a new 2D array. Multiply each number in each position as its own calculation
        Ex:
            {1, 2, 3}
            {2, 5, 10}
            {0, 3, 20}                         Output:
                x                                   {10, 6, 9}
                                                    {10, 10, 70}
                                                    {0, 60, 100}
            {10, 4, 3}
            {5, 2, 7}
            {100, 20, 5}
         */
        int [][] array1 = {
                {1, 2, 3},
                {2, 5, 10},
                {0, 3, 20},
        };
        int [][] array2 = {
                {10, 4, 3},
                {5, 2, 7},
                {100, 20, 5}
        };
        int [] []newArray = new int[3][3];
        newArray[0][0] = array1[0][0] * array2[0][0];
        newArray[0][1] = array1[0][1] * array2[0][1];
        newArray[0][2] = array1[0][2] * array2[0][2];

        newArray[1][0] = array1[1][0] * array2[1][0];
        newArray[1][1] = array1[1][1] * array2[1][1];
        newArray[1][2] = array1[1][2] * array2[1][2];

        newArray[2][0] = array1[2][0] * array2[2][0];
        newArray[2][1] = array1[2][1] * array2[2][1];
        newArray[2][2] = array1[2][2] * array2[2][2];

        System.out.println(Arrays.deepToString(newArray));









    }
}
