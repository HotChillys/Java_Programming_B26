package day10_03_16_2022;

import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        /*
         Write a program that accepts an array and prints an array with the elements "rotated left”

		int[] x = {1,2,3};			 // = > [2,3,1]
		int[] y = {17,12,10,8};		 // = > [12,10,8,17]
		int[] a = {7,0,0}; 			 // = > [0,0,7]

         */

        int [] y = {17, 12, 10, 8};
        int [] y1 = new int[y.length];

        for (int i = 0; i < y1.length-1; i++) {

            y1[y1.length - 1] = y[0];//
            y1[i] = y[i + 1];

        }

        System.out.println(Arrays.toString(y1));











    }
}
