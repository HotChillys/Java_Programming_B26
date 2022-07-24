package day33_methods;

import java.util.Scanner;

public class PositiveOrNegativeOrZero {
    /*
    create a method that will accept a number. Find and print if it is a
    positive number, negative number, or zero
     */
    public static void posNegZero(int nums) {
        if (nums > 0) {
            System.out.println("It is a positive number");
        }
        if (nums < 0) {
            System.out.println("It is a negative number");
        }
        if (nums == 0) {
            System.out.println("This number is zero");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        posNegZero(input.nextInt());
    }
}
