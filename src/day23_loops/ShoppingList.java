package day23_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        /*
        repeated steps:
            ask user to enter the item
            add item to shopping list

            at the end show the full shopping list
         */

        Scanner input = new Scanner(System.in);
        String list = "Shopping List:";
        String addMore = "";

        do {

            System.out.println("Enter the name of the item");
            list += "\n *" + input.nextLine();

            System.out.println("Do you want to add more to your shopping list?");
            addMore = input.nextLine();

        } while (addMore.equals("yes") || addMore.equalsIgnoreCase("y"));
        // if the use types 'yes' in the console about wanting to add more item, then the loop will iterate again
        // if the user type anything besides 'yes' the 'equals' method will give false and the loop will stop

        System.out.println(list);














    }
}
