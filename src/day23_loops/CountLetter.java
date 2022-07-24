package day23_loops;

public class CountLetter {
    public static void main(String[] args) {

        /*
        Given a String and we want to count how many 'a' characters we have

        challange : adjust so that we can check for not only 'a' but any character

        Ex: aabbcaa  --> 4

         */

        String word = "aabbcaa";

        int count = 0;

        for (int a = 0; a < word.length(); a++) {

            if (word.charAt(a) == 'a') {
                count++;
            }




        }

        System.out.println(count);







    }
}
