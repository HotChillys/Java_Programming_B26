package day15_switch_statement;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the vending machine. \nPlease select one of the following:\n\tDrinks\n\tSnacks\n\tGums");
        String selection = input.next();

        String item = "";

        switch (selection) {

            case "Drinks":
                System.out.println("You choose drinks: press a number:\n\t1)Water\n\t2)Soda\n\t3)Juice");
                int drinkNumber = input.nextInt();

                if (drinkNumber == 1) {
                    item = "Water";
                } else if (drinkNumber == 2) {
                    item = "Soda";
                } else if (drinkNumber == 3) {
                    item = "Juice";
                }
                break;
            case "Snacks":
                System.out.println("You chose snacks: press a number:\n\t4)chips\n\t5)cookies");
                int snackNumber = input.nextInt();
                if (snackNumber == 4) {
                    item = "Chips";
                } else if (snackNumber == 5) {
                    item = "Cookies";
                }
                break;
            case "Gums":
                item = "Generic Gum";


        } // end of switch


        System.out.println("Vending....." +item);


    }
}
