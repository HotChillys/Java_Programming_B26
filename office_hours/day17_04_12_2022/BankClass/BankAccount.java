package day17_04_12_2022.BankClass;

public class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;
    double deposit;
    double withdraw;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(double balance, double deposit, double withdraw) {
        this.balance = balance;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public BankAccount(String accountHolder, int accountNumber, double balance, double deposit, double withdraw) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.err.println("Depositing amount can not be zero or negative");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.err.println("Insufficient Balance");
        }
        else if (amount <= 0) {
            System.err.println("Withdrawing balance can not be negative or zero");
        }else {
            balance -= amount;
        }
    }
    public void showBalance(){
        System.out.println("As of today, " + accountHolder + "'s available balance is " + balance);
    }

    public String toString() {

        String info = "";

        if (this.accountHolder != null) {
            info += "Account holder name: " + accountHolder;
        }
        if (this.accountNumber != 0) {
            info += "\nAccount number: " + accountNumber;
        }

        if (withdraw > this.balance) {
            info += "\nInsufficient Fund";
        } else {
            balance -= withdraw;
            info += "\nCurrent Balance is $" + balance;
        }
        return info;
    }



}
