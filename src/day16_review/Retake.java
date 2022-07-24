package day16_review;

import java.util.Scanner;

public class Retake {
    public static void main(String[] args) {

        /*
        create a class Retake
        declare and assign a grade variable
        declare and assign an attempt number
        Doing a retake for the assignment will reduce the grade by a percentage
        based on the number of attempts taken:
        If its the first attempt -> subtract 10%
        If its the second attempt -> subtract 20%
        If its the third attempt -> subtract 35%
        Based on the retake attempt number calculate the final grade
         */

        Scanner input = new Scanner(System.in);

        System.out.println("What was the grade?");
        double grade = input.nextDouble();
        System.out.println("Which attempt number is it?");
        int attemptNumber = input.nextInt();

        String message = "";

        if (attemptNumber == 1) {
            grade -= grade * 0.1;
            message = "Your final grade is " +grade;
        } else if (attemptNumber == 2) {
            grade -= grade * 0.2;
            message = "Your final grade is " +grade;
        } else if (attemptNumber == 3) {
           grade -= grade * 0.3;
            message = "Your final grade is " +grade;
        } else {
            message = "You failed";
        }

        System.out.println(message);






    }
}
