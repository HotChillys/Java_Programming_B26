package day03_02_22_2022;

public class P04_Discount {
    public static void main(String[] args) {

        /*
        A book store will give discount of 10% if the cost of purchased quantity is more than 1000.
							Create a quantity variable
							    Suppose, one unit will cost 100.
							    Judge and print total cost for user.
					            ( Scanner Class can be used )

							INPUT for quantity :  5 		 							EXPECTED : No discount applied

							INPUT for quantity  :  15									EXPECTED : You get a discount of $totalDiscount and your total cost is $totalCost 																						   your total cost is $totalCost
         */

        double cost = 100;
        int quantity = 5;
        double totalCost = cost * quantity;
        double discountRate = 0.1;
        double totalDiscount = 0;


        if (quantity >= 1000) {
            totalDiscount = discountRate * totalCost;
            System.out.println("Total cost is " +(totalCost - totalDiscount)+ "Total discount is $" +totalDiscount);
        } else {
            System.out.println("Total cost is $" +totalCost+ ", No discount applied");
        }







    }
}
