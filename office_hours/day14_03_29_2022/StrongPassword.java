package day14_03_29_2022;

import java.util.Scanner;

public class StrongPassword {
    /*
         Write a method that can verify if a password is a strong password. Characteristics of strong passwords are:
                       1.1 Password must be at least have 8 characters long, and should not contain space
                       1.2 PassWord should at least contain one upper case letter
                       1.3 PassWord should at least contain one lower case letter
                       1.4 Password should at least contain one special characters
                       1.5 Password should at least contain a digit

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = input.nextLine();

        System.out.println(strongPassword(password));
    }
    public static String strongPassword(String str) {

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
        return str.length() > 8 && upper > 0 && lower > 0 && special > 0 && number > 0 ? "Valid Password" : "Invalid password";

    }
}
