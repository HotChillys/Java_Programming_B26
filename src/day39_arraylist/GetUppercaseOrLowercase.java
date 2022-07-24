package day39_arraylist;

import java.util.ArrayList;

public class GetUppercaseOrLowercase {
    public static void main(String[] args) {
        /*
        Write a program that can extract the uppercase and lowercase
        characters from a String and store them into separate ArrayLists of
        Characters
        Ex:
        str = “heLLoWoRlD
        list1: {h, e, o, o, l}
        list2: {L, L, W, R, D}
         */
        String str = "heLLoWoRlD";
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                list1.add(str.charAt(i));
            }
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                list2.add(str.charAt(i));
            }
        }
        System.out.println(list1);
        System.out.println(list2);



    }
}
