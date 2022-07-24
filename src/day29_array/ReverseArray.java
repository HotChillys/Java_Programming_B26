package day29_array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        /*
        Write a program that will reverse the order of any given array
        Ex:
        Input:
        [1, 2, 3, 4, 5]
        Output:
        [5, 4, 3, 2, 1]
         */
        int [] number = {1, 2, 3, 4, 5};

        for (int i = number.length - 1; i >= 0; i--) {

            System.out.print(number[i] + ", ");
        }
        System.out.println();

        // make a new array that is reverse of number[]
        int [] reverse = new int[number.length];

//        for (int i = number.length - 1, j = 0; i >= 0; i--, j++) {
//
//            reverse[j] = number[i];
//
//        }

        for (int i = 0; i < number.length; i++) {
            reverse[number.length - 1 - i] = number[i];
        }
        /*
        i = 0
            reverse[number.length - 1 - i] = number[i]
            reverse[5 - 1 - 0] = number[0]
            revers [4] = number[0]

        i=1;
          reverse[number.length - 1 - i] = number[i]
          reverse[5 - 1 - 1] = number[1]
          revers [3] = number[0]

        i = 2;
          reverse[number.length - 1 - i] = number[i]
          reverse[5 - 1 - 2] = number[2]
          revers [2] = number[1]
         */

        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(reverse));





    }
}
