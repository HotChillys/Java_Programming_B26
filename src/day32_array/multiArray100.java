package day32_array;

import java.util.Arrays;

public class multiArray100 {
    public static void main(String[] args) {

        int [][] myArray = new int[10][10];

        int n = 1;

        for (int i = 0; i < myArray.length; i++) {

            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = n++;
            }

            System.out.println(Arrays.toString(myArray[i]));
        }












    }
}
