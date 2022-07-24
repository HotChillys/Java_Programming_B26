package my_utilities;

import java.util.Scanner;

public class StringUtil {

    //reverse String word
    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    //Fixes format of a word.   input: jamES --> output: James
    public static String fixFormat(String str) {
        str = str.trim();
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    //makes given String camel case
    public static String camelCase(String str) {
        str = str.toLowerCase().trim();
        String[] arr = str.split(" ");
        String word = "";
        for (int i = 0; i < arr.length; i++) {
            word += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
        }
        return word;
    }

    // calculate how many times a character appeared in String --> String word = "apple", p; output: 2
    public static int frequencyOfCharacter(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    //finds and returns a letter that appeared in String only once, --> input: "aaaaabcccdeeff" output: "bd"
    public static String uniqueCharacter(String str) {
        String unique = "";
        String checked = "";
        for (int i = 0; i < str.length(); i++) {
            if (checked.contains("" +str.charAt(i))) {
                continue;
            }
            int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));
            checked += str.charAt(i);
            if (count == 1) {
                unique += str.charAt(i);
            }
            }
        return unique;
        }
    }


