package day19_String;

import java.util.Locale;
import java.util.Scanner;

public class CreatingEmail {
    public static void main(String[] args) {

        /*
                Ask user to enter two strings. Both strings should be at least 6 character long. If they are shorter
        than that print “Invalid data” and program should end.
        If the information provided is valid, you will take the first 4 characters of first string and
        combine them with the last three characters of the second string. At the end of your combined
        string add “@cybertek.com” and print the final string as your created email. The final email
        should be in all lowercase.
        input: JamesBond Secret
        output: jameret@cybertek.com
         */
        Scanner input = new Scanner(System.in);

       String a = "JamesBond";
       String b = "Secret";

       String email = "";

        if (a.length() < 6 && b.length() < 6) {
            email = "Invalid data";
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        email = a.substring(0,4) + b.substring(3,6) + "@cybertek.com";
        System.out.println(email);









    }
}
