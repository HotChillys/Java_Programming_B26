package day38_arraylist;

import java.util.ArrayList;

public class Characters2 {
    public static void main(String[] args) {
        /*
        Create an ArrayList of Characters
        Fill the ArrayList with letters from a-z
        Print the ArrayList of all the characters

        Manually remove each vowels and print the new ArrayList
         */
        ArrayList<String> list = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            list.add("" + i);
        }
        System.out.println(list);
        list.remove("a");
        list.remove("e");
        list.remove("o");
        list.remove("u");
        list.remove("i");
        System.out.println(list);
    }
}
