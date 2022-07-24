package day07_03_08_2022;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
/*
            Given two Strings determine if they are anagram or not. Strings are anagram if
                        they are built up of the same characters
                 Ex:
                    listen vs silent
                    funeral vs  real fun
                    a gentleman vs elegant man

                 -> anagram
                 Hint: look up and use replaceFirst() method

 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words that has same number of characters");
        String a = input.nextLine();
        String b = input.nextLine();

        String w = "";

        if (a.length() != b.length()) {
            System.out.println("Invalid Entry");
        }

        for (int i = 0; i < a.length(); i++) {

            char a1 = a.charAt(i);

            int j = 0;
            while (j < b.length()){
                char b1 = b.charAt(j);

                if (b1 == a1) {
                    w += b1;

                }
                j++;
            }


            if (w.equals(a)) {
                System.out.println("Anagram");
            }

        }

    }
}

// this code only works with anagrams with not repeating letters.