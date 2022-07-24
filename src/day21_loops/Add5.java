package day21_loops;

import java.util.Scanner;

public class Add5 {
    public static void main(String[] args) {

        /*
        write a program that will add 5 numbers from the console
         */

        Scanner input = new Scanner(System.in);

        int num = 0;

        while (num++ <= 10) {

            System.out.println("Enter 5 numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();
            int num4 = input.nextInt();
            int num5 = input.nextInt();

            System.out.println(num + num1 + num2 + num3 + num4 + num5);



        }

    }
}
