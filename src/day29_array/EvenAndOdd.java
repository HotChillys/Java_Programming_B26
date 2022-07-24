package day29_array;

import java.util.Arrays;

public class EvenAndOdd {
    public static void main(String[] args) {
        /*
        Write a program that can count the even and odd number from an array of
        integers
        Ex:
        Input: [4,1,3,12,5]
        Output:
        Even: 2
        Odd: 3
         */
        int[] number = {4, 1, 3, 12, 5};
        int even = 0;
        int odd = 0;
        String oddNums = "";
        String evenNums = "";
//
//        for (int i = 0; i < number.length; i++) {
//
//            if (number[i] % 2 == 0) {
//                even++;
//                evenNums += number[i] + " ";
//            }
//
//            if (number[i] % 2 == 1) {
//                odd++;
//                oddNums += number[i] + " ";
//            }
//
//        }

        for (int num : number) {
            if (num % 2 == 0) {
                even++;
                evenNums += num + " ";
            } else {
                odd++;
                oddNums += num + " ";
            }
        }

        System.out.println(even);
        System.out.println(odd);
        System.out.println("even counter: " + evenNums);
        System.out.println("odd counter: " +oddNums);


    }
}
