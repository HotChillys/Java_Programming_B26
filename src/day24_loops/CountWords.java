package day24_loops;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class CountWords {
    /*
            Given a sentence determine how many words are in the String.
        Ex:
        Input:
        This has multiple words
        Output:
        4
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine().trim();
        int spaces = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') { // str.substring(i, i + 1)
                spaces++;
            }

        }

        System.out.println("Number of words: " + (spaces + 1));


















    }











}

