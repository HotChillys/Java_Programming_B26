package day25;

import java.util.Scanner;

public class MultiplyEnd {
    public static void main(String[] args) {

        /*
        Given a String and a number return a String that has the ending character
        duplicated and attached by the number amount of times
        Ex:
        Input:
        Hello?
        3
        Output:
        Hello????
        Ex:
        Input:
        java
        5
        Output:
        javaaaaaa
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.nextLine();
        System.out.println("How many times do you want to repeat the ending?");
        int num = input.nextInt();

        int n = 0;
        char lastCharacter = ' ';

        while (n < num) {

            lastCharacter = word.charAt(word.length() - 1);
            n++;

            word += lastCharacter;

        }
        System.out.println(word);




















    }
}
