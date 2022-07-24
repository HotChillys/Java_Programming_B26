package day30_array;

import java.util.Scanner;

public class FirstName {
    public static void main(String[] args) {
        /*
        Ask the user to enter their first name
        Convert the name into a char array
        print the first and last letter of the name
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String name = input.nextLine();

        char [] each = name.toCharArray();

        System.out.println("" +each[0] + each[each.length - 1]);




    }
}
