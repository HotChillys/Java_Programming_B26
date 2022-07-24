package day19_String;

import java.util.Locale;
import java.util.Scanner;

public class Title {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your title");
        String title = input.nextLine().toLowerCase();
        String name = input.nextLine();
        String message = "";


        if (title.equals("mr") || title.equals("mister")) {
            message = "Hello Sir " + name;
        } else if (title.equals("ms") || title.equals("miss") || title.equals("madam")) {
            message = "Hello Ma'am " + name;
        } else if (title.equals("dr")) {
            message = "Hello Doctor " + name;
        }

        if (name.endsWith("sr")) {
            message = "Nice to meet you " + name + " " + title;
        } else if (name.endsWith("jr")) {
            message = "nice to meet you " + name + " " + title;
        }

        System.out.println(message);


    }
}
