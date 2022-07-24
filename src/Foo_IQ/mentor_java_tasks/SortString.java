package Foo_IQ.mentor_java_tasks;

import java.util.*;

public class SortString {
    /*
    Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together. Ex:
Input:  "DC501GCCCA098911"
Output: "CD015ACCCG011899"

     */
    public static void main(String[] args) {

        String s = "DC501GCCCA098911";
        String res = "";
        String str = "";
        for (int i = 0; i < s.length() - 1; i++) {

            if (Character.isAlphabetic(s.charAt(i))) {
                str += s.charAt(i) + "";
                if (Character.isDigit(s.charAt(i+1))){
                    List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
                    Collections.sort(list);
                    for (String each : list) {
                        res += each;
                    }
                    str = "";
                    list.clear();
                }
            }
            if (Character.isDigit(s.charAt(i))) {
                str += s.charAt(i) + "";
                if (Character.isAlphabetic(s.charAt(i+1))){
                    List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
                    Collections.sort(list);
                    for (String each : list) {
                        res += each;
                    }
                    str = "";
                    list.clear();
                }
            }
        }
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        Collections.sort(list);
        for (String each : list) {
            res += each;
        }
        System.out.println(res);





















    }
}
