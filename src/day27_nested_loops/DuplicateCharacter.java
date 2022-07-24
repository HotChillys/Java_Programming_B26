package day27_nested_loops;

public class DuplicateCharacter {
    public static void main(String[] args) {
        /*
        Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

    Ex:
        Input:
            AAABCCDEEF
        Output:
            ACE

	-> the characters A C and E are found in the String multiple times so they are duplicates
         */

        String word = "AAABCCDEEF";

        for (int i = 0; i < word.length(); i++) {

            char a = word.charAt(i);

            boolean dupe = word.indexOf(a) != word.lastIndexOf(a);

            if (dupe) {
                System.out.print(a);
            }

        }
        System.out.println();
        System.out.println("=============Approach two=============");

        String checked = "";
        for (int i = 0; i < word.length(); i++) {

            if (checked.contains(word.charAt(i) + "")) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < word.length(); j++) {

                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }

                checked += word.charAt(i);


            } // inner end

            if (count > 1) { // or count >= 2; or count != 1;
                System.out.print(word.charAt(i));

            }

        }

/*
        String checked = "";
        for (int i = 0; i < word.length(); i++) {

            if (!checked.contains(word.charAt(i) + "")) {



            int count = 0;

            for (int j = 0; j < word.length(); j++) {

                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }

                checked += word.charAt(i);

                }
            } // inner end

            if (count > 1) { // or count >= 2; or count != 1;
                System.out.print(word.charAt(i));

            }

        }

 */







    }
}
