package day19_String;

import java.util.Locale;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        /*
        ask use to enter first name
        ask user to enter last name
        print the initials

        james
        bond
        JB
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name and last name");
        String firstName = input.nextLine().toUpperCase();
        String lastName = input.nextLine().toUpperCase();

        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println("Your initial is " +firstInitial + lastInitial);





    }
}
