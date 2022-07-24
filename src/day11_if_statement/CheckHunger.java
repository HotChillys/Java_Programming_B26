package day11_if_statement;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {

        /*
           Task:

            boolean variable isHungry

            if the person is hungry,print: You are hungry so I will get some food for you

            if the person is not hungry, print: Great, then practice java
         */
        Scanner input = new Scanner(System.in);
        System.out.println("are you hungry? true or false?");
        boolean isHungry = input.nextBoolean();
//        boolean isHungry = false;

        if (isHungry) {
            System.out.println("Go get some rest");
        } else {
            System.out.println("Great, then practice java");
        }














    }
}
