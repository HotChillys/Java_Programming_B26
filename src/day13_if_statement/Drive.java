package day13_if_statement;

public class Drive {
    public static void main(String[] args) {

        /*
        create a class Diver
        You are diving in the ocean. Your oxygen tank has a certain level (number)
        declare and assign an int variable about the oxygen level in the tank and
        print a message based on the oxygen level:
        Above 90 - Your tank is full
        Above 80 - Still okay
        Above 70 - Don't go too far
        Above 60 - Start to head back
        Above 50 - Be careful now you at 50%
         */

        int tankLevel = 65;

        if (tankLevel >= 90) {
        System.out.println("Your tank is full");
        }else if (tankLevel >= 80 && tankLevel < 90) {
            System.out.println("Still okay");
        } else if (tankLevel >= 70 && tankLevel < 80) {
            System.out.println("Don't go too far");
        }else if (tankLevel >= 60 && tankLevel < 70) {
            System.out.println("Start to head back");
        }else if (tankLevel >= 50 && tankLevel < 60) {
            System.out.println("Be careful now you are at 50%");
        } else {
            System.out.println("It's over for you ");
        }



    }
}
