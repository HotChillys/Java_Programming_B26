package day24_loops;

public class CharacterInString {
    public static void main(String[] args) {
        /*
        Given a String print the ascii value codes for each character
        Ex:
        Input:
        “java”
        Output:
        106 97 118 97
         */

        String s = "java";

        for (int i = 0; i < s.length(); i++) {

            System.out.print((int)s.charAt(i) + " ");

        }










    }
}
