package day39_arraylist;

import java.util.ArrayList;

public class SeparateParts {
    public static void main(String[] args) {
        /*
        Write a program that can extract the special characters, digits and letters
        from a string and stores them into separate ArrayLists of Characters
        Ex:
        str = "ABCD123$%#@&456EFG!"
        list1: {$, %, #, @, &, !}
        list2: {A, B, C, D, E, F, G}
        list3: {1, 2, 3, 4, 5, 6}
         */

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        ArrayList<Character> list3 = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (each == '!' || each == '@' || each == '#' || each == '$' || each == '%' || each == '&') {
                list1.add(each);
            }
            if (each >= 'A' && each <= 'Z') {
                list2.add(each);
            }
            if (Character.isDigit(each)) {
                list3.add(each);
            }
        }
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("list3: " + list3);



    }
}
