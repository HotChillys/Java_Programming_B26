package day32_array;

import java.util.Arrays;

public class BiggestDiagonal {
    public static void main(String[] args) {
        /*
        Given a 2D array with values:
        {3, 5, 1}
        {1, 6, 10}
        {5, 21, 10}
    Calculate and find the biggest diagonal
        if an array was
        a b c
        d e f
        g h i
        aei and ceg would be the diagonals
         */
        int [][] myArrays = {
                {3, 5, 1},
                {1, 6, 10},
                {5, 21, 10}
        };

        int first = myArrays[0][0];
        int second = myArrays[1][1];
        int third = myArrays[2][2];

        System.out.println("" + first + " " + second + " " + third);

        System.out.println("" + myArrays[0][2] + " " + myArrays[1][1] + " " + myArrays[2][0]);








    }
}
