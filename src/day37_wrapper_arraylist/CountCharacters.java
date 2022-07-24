package day37_wrapper_arraylist;

import java.util.Arrays;

public class CountCharacters {
    /*
    given some String, count the number of uppercase letter, lowercase letters, numbers, and other characters

    sP3d572&*jd@jdJU
     */
    public static void main(String[] args) {
        String str = "sP3d572&*jd@jdJU";
        int countUpper = 0;
        int countLower = 0;
        int countNum = 0;
        int countOther = 0;

        String upperChars = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                countUpper++;
                upperChars += str.charAt(i);
            } else if (Character.isLowerCase(str.charAt(i))) {
                countLower++;
            } else if (Character.isDigit(str.charAt(i))) {
                countNum++;
            } else {
                countOther++;
            }
        }
        System.out.println(countUpper+ " Uppercase, " +countLower+ " Lowercase, " +countNum+ " Numbers, and " +countOther+ " Other characters");
        System.out.println("Uppercase letters are: " + Arrays.toString(upperChars.toCharArray()));


    }

}
