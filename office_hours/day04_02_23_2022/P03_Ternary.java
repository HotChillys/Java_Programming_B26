package day04_02_23_2022;

import java.util.Scanner;

public class P03_Ternary {
    public static void main(String[] args) {

        /*
        Create  a program that accepts animal as String

        DOG 	- domestic animal
        CAT 	- domestic animal
        TIGER 	- wild  animal

        For other animals - unknown animal

        INPUT : DOG 		EXPECTED OUTPUT : DOG is domestic animal
                */

        int a = 15;
        int b = 10;

        System.out.println(a > b ? a : b);

        Scanner input = new Scanner(System.in);
        System.out.println("What kind of animal do you have?");
        String animal = input.next();

        switch (animal) {
            case "DOG": case "CAT":
                animal = "domestic animal";
                break;
            case "TIGER":
                animal = "wild animal";
                break;
            default:
                animal = "unknown animal";

        }
        System.out.println(animal);

    }
}
