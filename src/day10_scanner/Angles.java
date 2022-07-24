package day10_scanner;
import java.util.Scanner;
public class
Angles {
    public static void main(String[] args) {
/*
Write a program that asks the user to enter 3 angle numbers ( can be
floating numbers )
Determine if the angles make a triangle, which means the angles add to
180.0
and
Determine if the angles make a circle, which means the angles add to
360.0
 */
        Scanner input = new Scanner(System.in);


        System.out.println("What is angle one? " );
        double angle1 = input.nextDouble();
        System.out.println("What is angle two? " );
        double angle2 = input.nextDouble();
        System.out.println("What is angle three? " );
        double angle3 = input.nextDouble();

        boolean triangle = (angle1 + angle2 + angle3) ==180;
        boolean circle = (angle1 + angle2 + angle3) ==360;
        System.out.println("Is this a triangle? " +triangle+ "\nIs the angle circle? " +circle);









    }
}
