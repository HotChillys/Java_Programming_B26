package Foo_IQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "AAABBCDD";
        String s = "";
        int count = 0;

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        ArrayList<String> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if (!newList.contains(list.get(i))){

                count = Collections.frequency(list, list.get(i) );
                newList.add(list.get(i));
                newList.add("" + count);
            }
        }

      for (String each : newList) {
          s += each;
      }
        System.out.println(s);


    }
}
