package day19_String;

public class AppleBanana {
    public static void main(String[] args) {

        /*
        Given two words. Print the first word without its first character then print the second word
        without its last character.
        Input:
        apple banana
        Output:
        pple
        banan
         */
        String a = "apple";
        String b = "banana";

        System.out.println(a.substring(1));
        System.out.println(b.substring(0, 5));






    }
}
