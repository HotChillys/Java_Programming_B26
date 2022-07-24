package day05_03_01_2022;

import java.util.Scanner;

public class P05_CarpetShop {
    public static void main(String[] args) {

        /*
         - Ask the user which room do they need carpet? (String)
                            			List of Rooms
                            				Bedroom
                            				Kitchen

                            -> If the user gives other than these roomTypes ,  give an error message about "Invalid Room Type"

                            		- Ask the user roomType dimensions (as meter and double)
                            			Kitchen is circle.Take radius from user
                            			Bedroom is square or Rectangle.Take lenght and width from user

                            			- Ask the user to delivery address (String, multiple words)
                            			- unitPriceForCarpet = 3.92
                            			- totalcost = area*unitPriceForCarpet;

                            - Print in the following format:
                            		Ex:
                            			inputs: Bedroom,length 4,width 3,1300 Lamar St Houston TX 77010

                            			"TotalCost for your carpet is 51.84 and it will be delivery 1300 Lamar St Houston TX 77010 in one week"
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Which room you'd like your carpet to be in?");
        String room = input.nextLine().toLowerCase();

        double unitPrice = 3.92;
        String address = "";

        switch (room) {

            case "bedroom" :
                System.out.println("Enter the length and width of the room.");
                double length = input.nextDouble();
                double width = input.nextDouble();
                input.nextLine();
                unitPrice *= length * width;
                System.out.println("Enter your address");
                address = input.nextLine();
                break;

            case "kitchen":
                System.out.println("Enter the radius of the room");
                double radius = input.nextDouble();
                unitPrice *= 3.14 * radius * radius;
                input.nextLine();
                System.out.println("Enter your address");
                address = input.nextLine();
                break;

            default:
                System.out.println("Invalid room type");

        }

        System.out.println("Total price for your carpet is $" +unitPrice+ ", and it will be delivered to " +address+ " in one week");




    }
}
