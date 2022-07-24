package day14_if_statements;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {

        /*
        inputs:
declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234

declare and assign expected values for both
    example expected:
        pin: 1552
        ssn: 1234

outputs:

    when the pincode and ssn match the expected print:
        Authentication successful

    when the pincode or ssn are not correct print:
        Authentication failed

    when the pincode was not correct print:
        incorrect pin code

    whent he ssn is not correct print:
        invalid ssn
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the pin code");
        int pin = input.nextInt();
        System.out.println("Enter the SSN code");
        int SSN = input.nextInt();

        int expectedPin = 1552;
        int expectedSSN = 1234;

        if (pin == expectedPin && SSN == expectedSSN) {
            System.out.println("Authentication successful");}

        else {
            if (pin != expectedPin && SSN != expectedSSN) {
                System.out.println("Authentication failed");
            }
            if (pin != expectedPin && SSN == expectedSSN) {
                System.out.println("incorrect pin code");
            }
            if (pin == expectedPin && SSN != expectedSSN) {
                System.out.println("invalid ssn");
            }
        }












    }
}
