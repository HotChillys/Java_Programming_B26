package day24_loops;

public class BiggestSubstring {
    public static void main(String[] args) {

       /*
       Given a String find the biggest substring of chars that match and print
        it.
        Ex: aaabbbcccccddddee
        Output: ccccc

        FLOW:
        go through each char in a loop
        look for each substring, which is repeating chars
            ex: aaa

        check next character to see if it is a different one

        check if it's the biggest substring
         */

        String s = "aaabbbcccccddddee";
        String sub = "";
        String biggest = "";


        for (int i = 0; i < s.length() - 1; i++) {

            sub += s.charAt(i);

            if (s.charAt(i) != s.charAt(i + 1)) { // when the character of i is different from the character next to it (i + 1)

                if (sub.length() > biggest.length()) {
                    biggest = sub; // assigns the substring to the new biggest
                }
                sub = ""; // resets this String for the next substring
            }

        }

        System.out.println(biggest);




    }
}
