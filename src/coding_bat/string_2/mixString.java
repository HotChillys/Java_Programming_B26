package coding_bat.string_2;

public class mixString {
    /*
    Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
     */
    public static void main(String[] args) {
        String a = "Hi";
        String b = "There";
        System.out.println(mixString(a, b));

    }

    public static String mixString(String a, String b) {

        String str = "";

        if (a.length() == b.length()) {

            for (int i = 0; i < a.length(); i++) {
                str += a.charAt(i) + "" + b.charAt(i);
            }

        } else if (a.length() > b.length()) {

            for (int i = 0; i < b.length(); i++) {
                str += a.charAt(i) +  "" + b.charAt(i);
            }
            str += a.substring(b.length());

        } else {

            for (int i = 0; i < a.length(); i++) {
                str += a.charAt(i) + "" + b.charAt(i);
            }
            str += b.substring(a.length());

        }


        return str;
    }


}
