package day20_string;

import java.util.Scanner;

public class RelativeChecker {
    public static void main(String[] args) {

        /*
        Given two full names check if the two people are related. They will be considered to be related
        if they have the same last name
        Ex:
        Input:
        James Bond
        Jamie Bond
        Output:
        Related
        Input:
        James Bond
        Alex Benji
        Output:
        Not Related
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name and last name");
        String name = input.nextLine().trim().toLowerCase();
        System.out.println("Enter your another first name and last name");
        String name1 = input.nextLine().trim().toLowerCase();

        String lastName = name.substring(name.indexOf(" ") + 1);
        String lastName1 = name1.substring(name.indexOf(" ") + 1);

        if (lastName.equals(lastName1)) {
            System.out.println("They are related");
        } else {
            System.out.println("They are not related");
        }









//        System.out.println("Enter your first name and last name");
//        String firstName = input.nextLine().toLowerCase();
//        String lastName = input.nextLine().toLowerCase();
//
//        System.out.println("Enter another first name and last name");
//        String firstName1 = input.nextLine().toLowerCase();
//        String lastName1 = input.nextLine().toLowerCase();
//
//        if (lastName.equals(lastName1)) {
//            System.out.println("They are related");
//        } else {
//            System.out.println("They are not related");
//        }









    }
}
