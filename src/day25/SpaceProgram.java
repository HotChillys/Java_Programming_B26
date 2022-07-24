package day25;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {

        /*
        Given a String return a version of with spaces between all of the letters.
        If there is already a space in the String put an underscore
        Ex: java -> j a v a
        space -> s p a c e
        more words -> m o r e _ w o r d s
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence NOW");
        String word = input.nextLine().trim();


        for (int i = 0; i < word.length(); i++) {

            word = word.replace(" ", "_");



            System.out.print(word.charAt(i) + " ");
        }



    }
}
