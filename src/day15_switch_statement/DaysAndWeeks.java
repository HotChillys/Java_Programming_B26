package day15_switch_statement;

import java.util.Scanner;

public class DaysAndWeeks {
    public static void main(String[] args) {

 /*
        Given a day number, find and print the day related to the number

        1- Monday
        2- Tuesday

        6- Saturday
        7- Sunday
        any other number : Not a day
     */
        Scanner input = new Scanner(System.in);

        System.out.println("What day is it today?");
        String day = input.nextLine();

        switch (day) {
            default:
                System.out.println("Not a day");
                break;
            case "monday":
            case "Monday":
                System.out.println("Monday");
                break;
            case "tuesday":
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "wednesday":
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "thursday":
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "friday":
            case "Friday":
                System.out.println("Friday");
                break;
            case "saturday":
            case "Saturday":
                System.out.println("Saturday");
            case "sunday":
            case "Sunday":
                System.out.println("Sunday");
        }


    }
}
