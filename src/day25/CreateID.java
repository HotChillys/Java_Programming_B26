package day25;

import java.util.Scanner;

public class CreateID {
    public static void main(String[] args) {
        /*
        Given a first name and last name create and return an id using the
        following format:
        the first letter of the first name as lowercase,
        the first 3 letters of the last name with the first letter as
        uppercase and the rest lowercase,
        the length of the first String multiplied by 2
        first name: john
        last name: smith
        id: jSmi8
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name, and last name");
        String firstName = input.nextLine().toLowerCase().trim();
        String lastName = input.nextLine().toLowerCase().trim();

        String a, b1, b2;
        int c;
        a = firstName.substring(0,1);
        b1 = lastName.substring(0,1).toUpperCase();
        b2= lastName.substring(1, 3);
        c = firstName.length() * 2;



        System.out.println(a + b1 + b2 + c);

/* Q: How to make character with charAt method lowercase
        ("" + charAt).toLowerCase
        */







    }
}
