package day11_if_statement;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        /*
        Create two number variables
        Find and print which number is bigger between the two
        ex:
        50
        45
        output:
        50 is bigger
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("Number " +num1+ " is bigger");}else{
            System.out.println("Number " +num2+ " is bigger");}


    }
}
