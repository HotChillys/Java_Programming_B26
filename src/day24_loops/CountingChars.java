package day24_loops;

public class CountingChars {
    public static void main(String[] args) {

        /*
        Given a String, find and print how many uppercase letter, lowercase
        letter, and number are in the String.
        Ex:
        Input: 2juMp41EEkd4s4
        Output:
        3 uppercase letters
        6 lowercase letters
        5 numbers
         */

        String a = "2juMp41EEkd4s4";

        int upper = 0;
        int lower = 0;
        int num = 0;
        String upperLetter = "";
        String lowerLetter = "";
        String numbers = "";

        for (int i = 0; i < a.length(); i++) {

           char letter = a.charAt(i); // get the character at the index number i for this iteration, and stores into the variable letter for re-usability
           if (letter >= 'A' && letter <= 'Z') {
               upper++;
               upperLetter += a.charAt(i) + " ";
           } else if (letter >= 'a' && letter <= 'z'){
               lower++;
               lowerLetter += a.charAt(i) + " ";
           } else if (letter>= '0' && letter <= '9'){
               num++;
               numbers += a.charAt(i) + " ";
           }

        }

        System.out.println("Upper case: " +upper + ", and they are: " +upperLetter);
        System.out.println("Lower case: " +lower + ", and they are: " +lowerLetter);
        System.out.println("number: " +num + ", and they are : " +numbers);













    }
}
