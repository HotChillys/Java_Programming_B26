package coding_bat.string_2;

public class DoubleChar {
/*
Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */

    public static String doubleChar(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            s += str.charAt(i) + "" + str.charAt(i);
        }

        return s;
    }


    public static void main(String[] args) {
        String str = "The";
        System.out.println(doubleChar(str));
    }


}
