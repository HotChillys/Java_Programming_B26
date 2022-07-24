package day15_switch_statement;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {

              /*
         Task:

            Ask the user to enter which day it is
            print which class we have on that day, and the time of the class
            show if there is office hours

            topic with instructor at time

            challenge:
                make each day flexible

                    monday
                    Monday
                    mon

                 reduce repeating code

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Which day do we have office hour?");
        String day = input.nextLine();
        String message = "";

        switch (day) {
            case "Monday":
            case "monday":
            case  "mon":
                message = "We do not have class this Monday, it is Family Day.";
                break;
            case "Tuesday":
            case "tuesday":
            case "tue":
                message = "We have office hours 5:30 to 6:45, class from 7:00 to 10:00.";
                break;
            case "Wednesday":
            case "wednesday":
            case "wed":
                message = "We have office hours 5:30 to 6:45 and class from 7:00 to 10:00.";
                break;
            case "Thursday":
            case "thursday":
            case "thur":
                message = "We have soft skills class today from 7:00 to 10:00";
                break;
            case "Friday":
            case "friday":
            case "fri":
                message = "We dont have class today";
                break;
            case "Saturday":
            case "saturday":
            case "sat":
                message = "We have class from 10am to 5pm.";
                break;
            case "Sunday":
            case "sunday":
            case "sun":
                message = "We have class from 10am to 5pm.";

        }

        System.out.println(message);







    }
}
