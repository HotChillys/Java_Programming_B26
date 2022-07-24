package day38_arraylist;

import java.util.ArrayList;

public class Characters {
    /*
    Create an ArrayList of Characters
    Fill the ArrayList with letters from A-Z
    Print the ArrayList of all the characters
     */
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            list.add("" + i);

        }
        System.out.println(list);
    }




}
