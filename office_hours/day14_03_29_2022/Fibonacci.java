package day14_03_29_2022;

import java.util.ArrayList;

public class Fibonacci {
    /*
    Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.
				Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

				Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

				    Ex:
				        Input:
				            8
				        Output:
				            0, 1, 1, 2, 3, 5, 8, 13, 21

     */
    public static void main(String[] args) {
        fibonacci(8);
    }


    public static void fibonacci(int num) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        for (int i = 2; i < num; i++) {
            arr.add(arr.get(i - 1) + arr.get(i - 2));
        }
        for (int numbers : arr) {
            System.out.print(numbers + ", ");;
        }

    }

}
