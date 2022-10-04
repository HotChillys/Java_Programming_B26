package day62_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
   /*
        Given a String count how many times each character is in the String
     */
   public static void main(String[] args) {
       String s = "apple";
       frequencyOfChar(s);
   }

    public static void frequencyOfChar(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }

        }

        System.out.println(map);
    }


}
