package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {
        /*
        Given an ArrayList of passwords (String). Hide each password in a star
        (*) format where each character is a star and print the ArrayList of
        hidden passwords
        Ex:
        Input:
        {"one", "hi", "hold}
        Output:
        [ ***, **, **** ]
         */

        ArrayList<String> passwords = new ArrayList<>(Arrays.asList("one", "hi", "hold"));

        ArrayList<String> hidden = new ArrayList<>();

       for (String each : passwords) {

           String s  = "";

           for (int i = 0; i < each.length(); i++) {

                s += "*";

           }
           hidden.add(s);
       }
        System.out.println(hidden);
    }
}
