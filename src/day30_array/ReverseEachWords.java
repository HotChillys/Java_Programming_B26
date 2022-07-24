package day30_array;

import java.util.Arrays;

public class ReverseEachWords {
    public static void main(String[] args) {
        /*
           Given a String, reverse each individual word and print the result
        Hint: Use a nested loop, split

        Input:
        It started to snow in Chicago
        Output:
        tI detrats ot wons ni ogacihC

         */
        String sentence = "It started to snow in Chicago";
        String [] words = sentence.split(" ");


        for (int i = 0; i < words.length; i++) {
            String reverseEach = "";
            for (int j = words[i].length() - 1; j >=0; j--) {
                reverseEach += words[i].charAt(j);
            }
            words[i] = reverseEach;
            System.out.print(words[i] + " ");
        }

















    }
}
