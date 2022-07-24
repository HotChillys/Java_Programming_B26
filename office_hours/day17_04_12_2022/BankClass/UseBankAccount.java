package day17_04_12_2022.BankClass;

import day17_04_12_2022.BankClass.BankAccount;

public class UseBankAccount {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("Megan", 7106432, 20000);
        System.out.println(myAccount);

        BankAccount hisAccount = new BankAccount(5400, 5233, 0);
        System.out.println(hisAccount);
        System.out.println();

        BankAccount herAccount = new BankAccount("Tyler", 1234567, 2000, 5000, 500);
        System.out.println(herAccount);

        myAccount.showBalance();
        myAccount.withdraw(100);

        myAccount.deposit(200);




    }
}
