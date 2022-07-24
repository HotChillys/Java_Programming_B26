package day18_string;

import java.util.Scanner;

public class UserAndPass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your username");
        String userName = input.nextLine();
        System.out.println("Please enter your password");
        String password = input.nextLine();

        String message = "";

        if (password.length() < 5 ) {
            message = "Password cannot be less than 5 characters";
        } if (password.length() >= 5) {
            message = "Valid password";
            if (password.contains(userName)) {
                message = "Invalid password, username should not be in it";
                password = "password";
            }
        }

        System.out.println(message);







    }
}
