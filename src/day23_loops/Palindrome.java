package day23_loops;

import day15_switch_statement.Schedule;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
       << THIS IS A POPULAR INTERVIEW QUESTION >>

        palindrome: it's the same reading from the beginning and end
        EX:
            mom
            racecars
            anna
            madam

            Task: check is a word os palindrome

            Flow:
            declare some initial String
            how to reverse a String
            check if the reverse version is the same as the original
         */
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        // reverse the string

        String reverse = "";

        for (int a = word.length() - 1; a >= 0; a-- ) {

            reverse += word.charAt(a);


        }
//        if (word.equals(reverse)) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not Palindrome");
//        }

        System.out.println(word.equals(reverse) ? "Palindrome" : "Not Palindrome");

















    }
}
