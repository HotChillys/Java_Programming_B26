package day13_if_statement;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        /*
        you will have a number

        if the number is divisible by 3 print -> Fizz
        if the number is divisible by 5 print -> Buzz
        if the number is divisible both 3 and 5 -> print FizzBuzz
        if the number is not divisible by any of those, print just the number
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number that is divisible by 3, 5, or both");
        double num = input.nextDouble();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");}
        else if (num % 5 ==0 ) {
            System.out.println("Buzz");}
        else if (num % 3 == 0) {
            System.out.println("Fizz");}
        else {
            System.out.println(num);}









    }
}
