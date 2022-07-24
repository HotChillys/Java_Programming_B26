package day24_loops;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        /*
        Given two Strings determine if they are anagram or not. Strings are anagram if
        they are built up of the same characters
        Ex:
        listen
        silent
        -> anagram
        Hint: look up and use replaceFirst() method
         */

        Scanner input = new Scanner(System.in);

        String word1 = "listen";

        String word2 = "silent";

        int count = 0;
        for (int i = 0; i < word1.length(); i++) {

            if (word1.contains("" + word2.charAt(i))) {
                count++;
                if (count == word1.length()) {
                    System.out.println("Anagram");
                }
            } else {
                System.out.println("Not Anagram");
            }


        }


    }
}
