package day11_if_statement;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        /*
        Task: Hard code -> Dynamic

    Create a double value for the account balance.//100
    Create a double value for how much you want to withdraw//50

    Check the balance after the withdrawal
        if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance

    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the account withdrawal");
        double accountBalance = input.nextDouble();
        double accountBalanceAfterWithdrawal = ((100 - accountBalance));
        System.out.println(accountBalanceAfterWithdrawal);

        if (accountBalanceAfterWithdrawal < 0) {
            System.out.println("You have an overdraft fee of $100 applied to your account");
            accountBalanceAfterWithdrawal -= 100;
        }
        System.out.println("your new balance is " +accountBalanceAfterWithdrawal);














    }
}
