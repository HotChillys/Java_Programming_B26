package day11_if_statement;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        /*
        create an int value for the time of the day. Use a 24 hour format
        use the given time of day to display a message
        hint: use seperate if statements
        if the hours are from 6 - 11, print: Good morning
        if the hours are from 12 - 16, print: Good evening
        if the hours are from 17 - 23, print: Good night
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the hour in 24 hour format: ");
        int hour = input.nextInt();
        System.out.println("Please enter the minute in 24 hour format: ");
        int minute = input.nextInt();
        System.out.println("Please enter the second in 24 hour format: ");
        int second = input.nextInt();

        if(hour >= 6 && hour <= 11) {
            System.out.println("Good Morning!");
        }else if (hour >= 12 && hour <= 16){
            System.out.println("Good Afternoon!");
        } else if (hour >= 17 && hour <= 23){
            System.out.println("Good Evening!");}
        else {
            System.out.println("Good Night!");}





    }
}
