package day33_methods;

import java.util.Scanner;

public class AngleCalculator {
    /*
    Create a method that will that accepts three numbers. Check if the three
    numbers equal to 180.
    If they are equal to 180 print: "This is a triangle
     */
    public static void angleCalculator(int nums) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your 3 angles");
            int angles = input.nextInt();
             sum += angles;
        }
        if (sum == 180) {
            System.out.println("It is a triangle");
        } else if(sum == 360) {
            System.out.println("It is a circle");
        } else {
            System.out.println("It is not a triangle nor a circle");
        }
    }

    public static void main(String[] args) {
        angleCalculator(0);
    }
}

