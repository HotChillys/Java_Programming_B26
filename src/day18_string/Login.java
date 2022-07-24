package day18_string;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        /*
        ask the user to enter a username
        make sure the username is in lowercase

        ask user to enter a password
        check if the password is more than 8 characters long

        valid system password: "jamesbond"
        --> if the entered password matches the system password
        logged in
        otherwise print: Invalid password
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your username");
        String userName = input.nextLine();
        userName = userName.toLowerCase();

        System.out.println("Please enter you password");
        String password = input.nextLine();


        if (password.length() >= 8 && password.equals("jamesbond")) {
            System.out.println("logged in with " +userName);
        } else {
            System.out.println("Invalid password");
        }







    }
}
