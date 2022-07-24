package day18_string;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {

        /*
                create a class AccountNumber
        ask the user enter an account number and check if the account number is
        valid. Accounts are valid if:
        handle empty inputs. If there is an empty input, do not check anything
        else and print: "Empty input given"
        - If the account number begins with a "2" the account number should
        be 7 characters long
        Print: "Valid 7-digit account number"
        Otherwise: "Invalid 7-digit account number"
        - If the account number begins with a "5" the account number should
        be 10 characters long
        Print: "Valid 5-digit account number"
        Otherwise: "Invalid 5-digit account number"
        â If the account number does not begin with a 2 or a 5 OR the
        account number lengths do not meet the expected results print Invalid
        account number
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your account number");
        String accNum = input.nextLine();

        String message = "";

        if (accNum.startsWith("2")) {

            switch (accNum.length()) {
                case 7:
                    message = "Valid 7-digit account number";
                    break;
                default:
                    message = "Invalid 7-digit account number";
            }
        } else if (accNum.startsWith("5")) {
            switch (accNum.length()) {
                case 10:
                    message = "Valid 5-digit account number";
                    break;
                default:
                    message = "Invalid 5-digit account number";
            }
        } else {
            message = "Invalid account number";
        }


        System.out.println(message);




    }
}
