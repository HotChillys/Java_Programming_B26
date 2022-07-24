package day15_switch_statement;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {

/*

    Declare price and calories variables

    Ask the user to enter which size drink they want

    Based on the drink size determine the price and calories of the order

        data:

            size: tall
            price: 2.50
            calories: 100

            size: grande
            price: 4.00
            calories: 150

            size: venti
            price: 4.50
            calories: 200

     */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the drink");
        String size = input.nextLine();
        double price ;
        int calories ;
        String message = "";

        switch (size) {
            case "tall": price = 2.50; calories = 100;
                message = "price is $" +price+ " calories is " +calories;
            break;
            case "grande": price = 4.00; calories = 150;
                message = "price is $" +price+ " calories is " +calories;
            break;
            case "venti": price = 4.50; calories = 200;
                message = "price is $" +price+ " calories is " +calories;
                break;
            default:
                System.out.println("We don't have that size");

        }

        System.out.println(message);


    }
}
