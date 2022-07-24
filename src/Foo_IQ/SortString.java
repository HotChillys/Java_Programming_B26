package Foo_IQ;

import java.util.ArrayList;
import java.util.Collections;

public class SortString {
    /*
    5. Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
    Ex:
    Input: "DC501GCCCA098911"
    OutPut: "CD015ACCCG011899"
     */
    public static void main(String[] args) {

        String str = "DC501GCCCA098911";

        String b = "";

        ArrayList<Character> list = new ArrayList<>();

        for (int j = 0; j < str.length(); j++) {

            if (Character.isAlphabetic(str.charAt(j))) {
                list.add(str.charAt(j));

                if (j+1 < str.length() && Character.isDigit(str.charAt(j + 1))) {
                    Collections.sort(list);
                    for (char each : list) {
                        b += each;
                    }
                    list.clear();
                }
            } else if (Character.isDigit(str.charAt(j))){
                list.add(str.charAt(j)) ;

                if (j+1 < str.length() && Character.isAlphabetic(str.charAt(j+1))) {
                    Collections.sort(list);
                    for (char each : list) {
                        b += each;
                    }
                    list.removeAll(list);
                }
            }

            }
        Collections.sort(list);
        for (char each : list) {
            b += each;
        }

        System.out.println(b);
        }

    }


