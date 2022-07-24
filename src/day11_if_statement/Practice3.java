package day11_if_statement;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        /*
        create a sales amount variable
        use the sales amount to determine the bonus you get at end of the month
        if your sales amount is less than 10000 you don't get any bonus
        if your sales amount is more than or equal to 10000 and less than
        15000 you get a bonus of 5000
        if your sales amount is more than or equal to 15000 you get a bonus
        of 7000
        print your bonus number
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Your sales amount for this month is $");
        double sales = input.nextDouble();

        if (sales >= 15000) {
            System.out.println("You got $7000 bonus for this month.");}
        else if (sales >= 10000 && sales < 15000) {
            System.out.println("You got $5000 bonus this month.");}
        else {
            System.out.println("You got no bonus this month.");
        }













    }
}
