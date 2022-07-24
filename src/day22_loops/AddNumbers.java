package day22_loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        /*
        write a program that will add all the numbers from 1 - 500
         */
Scanner input = new Scanner(System.in);

        int n = 1;
        int result = 0;

        while (n <= 5) {

            System.out.println("Enter number " + n);
            n++;
           result +=input.nextInt();
        }
        System.out.println(result);














    }
}
