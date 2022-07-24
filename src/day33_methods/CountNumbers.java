package day33_methods;

import java.util.Scanner;

public class CountNumbers {
    /*
    count up to a certain number
    start from 0all the numbers until the number input
    Ex:
        method(5) -- > 0 1 2 3 4 5
        method(10) --> 0 1 2 3 4 5 6 6 7 8 9 10
     */
    public static void count(int nums) {
        for (int i = 0; i <= nums; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        count(input.nextInt());

        count(-100);
    }
}
