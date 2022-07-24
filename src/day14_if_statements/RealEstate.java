package day14_if_statements;

import java.util.Scanner;

public class RealEstate {
    public static void main(String[] args) {

        /*

        We are buying a house
        ask the user for their budget (single number, max)

        Find the area that the user's budget fits into and provide all the information of the neighborhood

        extra condition: if the user gives a budget value below 0, it is invalid, so print: "That is not a valid budget". If the budget is more than 300,000 print "Too much money for this agency"

        Data based on neighborhood name:
            name - Hills
            average price - 80,000 - 100,000
            rating - 4.0
            gated - no
            allow pets - yes

            name - Oaks
            average price - 55,000 - 75,000
            rating - 3.5
            gated - no
            allow pets - yes
            name - Highland

            average price - 120,000 - 150,000
            rating - 4.5
            gated - yes
            allow pets - no

            name - Canyon
            average price - 160,000 - 201,000
            rating - 4.8
            gated - yes
            allow pets - yes

            If the budget is not in any range print: "No available houses"

     */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your budget, and we will show you what you can afford.");
        double budget = input.nextDouble();

        if (budget <= 0) {
            System.out.println("That is not a valid budget");
        } else {
            if (budget >= 0 && budget < 80000) {
                System.out.println("name : Oaks\naverage price - 55,000 to 75,000\nrating - 3.5\ngated - no\nallow pets - yes");
            }
            if (budget >= 80000 && budget < 120000) {
                System.out.println("name : Hills\naverage price - 80,000 to 100,000\nrating - 4.0\ngated - no\nallow pets - yes");
            }
            if (budget >= 120000 && budget < 160000) {
                System.out.println("name : Highland\naverage price - 120,000 to 150,000\nrating - 4.5\ngated - yes\nallow pets - no");
            }
            if (budget >= 160000 && budget < 201000) {
                System.out.println("name : Canyon\naverage price - 160,000 to 201,000\nrating - 4.8\ngated - yes\nallow pets - yes");
            }
            if (budget >= 300000) {
                System.out.println("No available houses");
            }
        }








    }
}
