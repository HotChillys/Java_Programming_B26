package day37_wrapper_arraylist;

import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
    /*
    Given a String password find out if it is a valid password

        Requirements:

            Must have at least 8 characters
            Must have at least 1 uppercase letter
            Must have at least 1 lowercase letter
            Must have at least 1 number
            Must have one of the follow special characters:
                ! @ # $ % ^ & *
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password");
        String str = input.nextLine();

        int upper = 0;
        int lower = 0;
        int number = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isUpperCase(str.charAt(i))) {
                upper++;
            }
            if (Character.isLowerCase(str.charAt(i))) {
                lower++;
            }
            if (Character.isDigit(str.charAt(i))) {
                number++;
            }
            if (each == '!' || each == '@' || each == '#' || each == '$' || each == '%' || each == '^' || each == '&' || each == '*') {
                special++;
            }
        }

        if (str.length() > 8 && upper > 0 && lower > 0 && special > 0 && number > 0) {
            System.out.println("Valid Password");
        } else {
            System.err.println("Invalid password");
        }





    }
}
