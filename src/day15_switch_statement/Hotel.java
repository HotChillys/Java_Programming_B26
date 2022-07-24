package day15_switch_statement;

import java.util.Scanner;

        /*
        Ask the user how many days they will stay at the hotel
        Then ask the user how many people are in their party (how many people are
        staying in the room)
        Use those two information to determine the price and room type for the
        hotel based on the below data:
        party size: 1
        room type: single room
        price: number of days * 100
        party size: 2
        room type: double room
        price: number of days * 125
        party size: 3 or 4
        room type: large room
        price: number of days * number of people * 150
        party size: 5, 6, or 7
        room type: suite
        price: number of days * 5000
        any other party size:
        Display one message:
        Sorry we don't have any available rooms for
        that size party
         */

public class Hotel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How long is your stay with us?");
        int numDay = input.nextInt();
        System.out.println("How may people are in your party?");
        int numPeople = input.nextInt();
        String message = "";
        String roomType = "";
        double price = 0;

        switch (numPeople) {

            case 1:
                roomType = "Single Room";
                price = numDay * 100;
                message = "Party size " + numPeople + "\nRoom type: " + roomType + "\nPrice " + price;
                break;
            case 2:
                roomType = "Double Room";
                price = numDay * 125;
                message = "Party size " + numPeople + "\nRoom type: " + roomType + "\nPrice " + price;
                break;
            case 3:
            case 4:
                roomType = "Large Room";
                price = numDay * 150;
                message = "Party size " + numPeople + "\nRoom type: " + roomType + "\nPrice " + price;
                break;
            case 5:
            case 6:
            case 7:
                roomType = "Suite";
                price = numDay * 5000;
                message = "Party size " + numPeople + "\nRoom type: " + roomType + "\nPrice " + price;
                break;
            default:
                message = "Sorry we don't have any available rooms for that size party";
        }


        System.out.println(message);


    }
}
