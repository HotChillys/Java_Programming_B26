package day10_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        /*
        Write a program that asks the user to enter a price and quantity and then
        calculate the revenue. revenue = price Ã— quantity.
         */
        Scanner input = new Scanner(System.in); // this is how to make a scanner variable

        //popular name for Scanner: scan, input, scanner, keyboard

        System.out.println("What is the Price of this jacket? ");
        double jacketPrice = input.nextDouble();
        System.out.println("How many jackets do you have? ");
        int numJacket = input.nextInt();
        String revenue = "Total revenue is $" + (jacketPrice * numJacket);
        System.out.println(revenue);




    }
}
