package day22_loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to ATM");

        int validPin = 1234;
        int userPin;
        int attempts = 0;

        do {
            System.out.println("Enter your PIN number");
            userPin = input.nextInt();
            attempts++;

        } while (validPin != userPin && attempts < 3);

        if (validPin == userPin) {
            System.out.println("logged in");
        } else {
            System.out.println("LOCKED OUT");
        }








    }
}
