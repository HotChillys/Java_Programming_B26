package day07_03_08_2022;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UniqueCharacter {
    public static void main(String[] args) {
/*
            Write a program that can return the unique chars  from  a  string

            String str = "aabdfccfs";

            Output : bds

            Small Task --> Find me first Unique Char from the String
 */
        String word = "aabdfccfs";

        for (int i = 0; i < word.length(); i++) {

            int count = 0;
            char letter = word.charAt(i);
//inner starts
            for (int j = 0; j < word.length(); j++) {
                char secondLetter = word.charAt(j);

                if (letter == secondLetter) {
                    count++;
                }

            } //inner end

            if (count > 1) {
                word = word.replace("" +letter, "");

            }

        } // outer end
        System.out.println(word);

    }
}

