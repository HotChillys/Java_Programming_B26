package day20_string;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {

        /*
        first name
        last name

        fix to print proper name
        capital first letter, the rest of the letter lower case, no extra space.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next(); //    jaMES
        System.out.println("Enter your last name");
        String lastName = input.next();

        firstName = firstName.trim().toLowerCase(); // james
        lastName = lastName.trim().toLowerCase();

        String fixedFirst = firstName.substring(0, 1).toUpperCase(); // J
        fixedFirst += firstName.substring(1); // James

        String fixedLast = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

        System.out.println(fixedFirst + " " + fixedLast);






    }
}
