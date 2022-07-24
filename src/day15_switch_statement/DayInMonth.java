package day15_switch_statement;

import java.util.Scanner;

        /*
        Days In Month (slightly different version than before)
        Write a program that will accept a month name and outputs how many days
        are in that month
        data:
        February: 28 days
        April, June, September, November: 30 days
        January, March, May, July, August, October, December: 31 days
         */
public class DayInMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month you'd like to check:");
        int numMonth = input.nextInt();
        String message = "";

        switch (numMonth) {

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                message = "This month has 31 days";
                break;
            case 4: case 6: case 9: case 11:
                message = "This month has 30 days";
                break;
            case 2:
                message = "This month has 28 days";
                break;
            default:
                message = "Invalid Entry";

        }

        System.out.println(message);









    }
}
