package day15_switch_statement;

import java.util.Scanner;

        /*
        Season Finder
        declare and assign a month number. Bases on the below data determine what
        season it is and what kind of clothes to wear. You can create your own
        expectations of what kind of clothes to wear based on the month
        12, 1, 2 --> Winter
        3, 4, 5 --> Spring
        6, 7, 8 --> Summer
        9, 10, 11 --> Fall
        Ex:
        2
        It is winter, so wear a winter coat, gloves and a hat
         */

public class SeasonFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month number you want to check");
        int monthNum = input.nextInt();
        String message = "";

        switch (monthNum) {
            case 12: case 1: case 2:
                message = "It is Winter, get your shovel ready.";
                break;
            case 3: case 4: case 5:
                message = "It is Spring, start panting tree.";
                break;
            case 6: case 7: case 8:
                message = "It is Summer, time to have fun.";
                break;
            case 9: case 10: case 11:
                message = "It is Fall, enjoy the scene.";
                break;
            default:
                message = "Invalid Entry, you know there are only 12 month in a year right?!";
        }
        System.out.println(message);






    }
}
