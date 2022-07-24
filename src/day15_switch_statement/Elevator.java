package day15_switch_statement;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

        /*
        add new class Elevator
        declare and assign a floor number variable. The floor number represent
        which floor you want the elevator to go to. After getting to each floor
        show the information of which companies are on that floor. Use the
        following data:
        floor 1 --> Lobby, StarBucks, Amazon Pick Up
        floor 2 --> NASA, Cydeo, Discover
        floor 3 --> Uber, Lyft, Chase
        floor 4 --> Rooftop, Lounge
        any other floor value --> Invalid Floor Selected
         */
public class Elevator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Press a floor number you would like to go");
        int floorNumber = input.nextInt();
        String message = "";

        switch (floorNumber){

            case 1:
                message = "Lobby,\nStarbucks,\nAmazon Pick Up";
                break;
            case 2:
                message = "NASA,\nCydeo,\nDiscover";;
                break;
            case 3:
                message = "Uber\nLift\nChase";
                break;
            case 4:
                message = "Rooftop,\nLounge";
                break;
            default:
                message = "Invalid Floor Selection";
        }

        System.out.println(message);









    }
}
