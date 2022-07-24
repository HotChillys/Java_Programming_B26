package day16_review;

import java.util.Scanner;

public class SoccerGame {
    public static void main(String[] args) {

        /*
        declare and assign a minutes variable
        use the minutes value to determine how much time is left in the soccer
        game
        use these ranges to determine the outputs:
        - any number less than 0 and more than 90 are not valid:
        when the minutes is less than 0:
        print: minutes cannot be a negative number
        when the minutes is more than 90:
        print: games cannot be longer than 90 minutes
        - when the minutes are between 90 - 75
        print: just getting started
        - when the minutes are between 74 - 60
        print: players are doing their best
        - when the minutes are between 59 - 30
        print: middle of the game is going great
        - when the minutes are between 29 - 0
        print: the end of the same is approaching
         */

        Scanner input = new Scanner(System.in);
        System.out.println("How many minutes are left in the game?");
        int minute = input.nextInt();
        String message = "";

        if (minute < 0 ) {
            message = "minutes cannot be a negative number";
        }
        else {
            if (minute > 90) {
                message = "games cannot be longer than 90 minutes";
            } else if (minute >= 75 && minute <= 90) {
                message = "just getting started";
            } else if (minute >= 60 && minute <= 74) {
                message = "players are doing their best";
            } else if (minute >=30 && minute <= 59) {
                message = "middle of the game is going great";
            } else if (minute >= 0 && minute <= 29) {
                message = "the end of the same is approaching";
            }
        }

        System.out.println(message);

        // ternary example way
        System.out.println(minute < 0 ? "minutes cannot be a negative number" : "games cannot be longer than 90 minutes");


    }
}
