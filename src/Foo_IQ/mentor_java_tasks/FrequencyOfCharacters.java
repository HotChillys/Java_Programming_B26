package Foo_IQ.mentor_java_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    /*
    Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

     */
    public static void main(String[] args) {

        String str = "AAABBCBDD";
        System.out.println(frequencyCharacter(str));
        System.out.println(frequency(str));
    }

    public static String frequencyCharacter(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            temp += "" + str.charAt(i) + count;
            if (!result.contains(temp)) {
                result += temp;
            }
        }

        return result;
    }

    public static String frequency(String str) {
        int count = 0;
        String res = "";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        for (int i = 0; i < list.size(); i++) {

            count = Collections.frequency(list, list.get(i));

            if (!res.contains(list.get(i))) {
                res += list.get(i) + count;
            }
            count = 0;
        }
        return res;

    }

}
