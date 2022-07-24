package day07_03_08_2022;

import java.util.Scanner;

        /*
        Given a String of words that follow Camel Case convention.

				Every word, except the first word, begin with an uppercase letter.
				The other characters of the word will be lowercase


				-  Find and print each words are in the given String.

						Input:  neverGiveUp
						Output: Never
								Give
								Up
         */

public class CamelCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = input.nextLine().toLowerCase().trim();

        String firstWord = sentence.substring(0, sentence.indexOf(' ')).trim();
        String secondWord = sentence.substring(sentence.indexOf(' ') + 1, sentence.lastIndexOf(' '));
        String lastWord = sentence.substring(sentence.lastIndexOf(' ') + 1);

        firstWord = firstWord.substring(0, 1).toUpperCase() + firstWord.substring(1);
        secondWord = secondWord.substring(0, 1).toUpperCase() + secondWord.substring(1);
        lastWord = lastWord.substring(0, 1).toUpperCase() + lastWord.substring(1);

        System.out.println(firstWord + secondWord + lastWord);














    }
}
