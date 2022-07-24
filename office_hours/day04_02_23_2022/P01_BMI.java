package day04_02_23_2022;

import java.util.Scanner;

public class P01_BMI {
    public static void main(String[] args) {

        /*    ( Scanner Class can be used )


							BMI (Body Mass Index): Program will ask user to enter their mass (kilogram) and their height (meters).
							Calculate their BMI and then print the appropriate message based on the provided values:
								All numbers taken as doubles

								—> BMI Formula: BMI = mass / height^2
								—> Values:

									Less than 18.5 — Underweight
									From 18.5 to 25 — Normal weight
									From 25 to 30 — Overweight
									More than or equal to 30 — Obese

								 	Output :  Underweigth    or    Normal weight    or   etc.

						 */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value");
        double mass = input.nextDouble();
        System.out.println("Enter the height");
        double height = input.nextDouble();
        double bmi = mass / (height * height);
        System.out.println("BMI = " +bmi);
        String message = "";

        if (bmi < 18.5) {
            message = "Underweight";
        }else if (bmi >= 18.5 && bmi < 25) {
            message = "Normal weight";
        }else if (bmi >= 25 && bmi < 30) {
            message = "Overweight";
        }else if (bmi >= 30) {
            message = "Obese";
        }
        System.out.println(message);

        System.out.println("---------with ternary---------------------");

        message = bmi < 18.5 ? "Underweight" : bmi >= 18.5 && bmi < 25 ? "Normal weight" : bmi >= 25 && bmi < 30 ? "Overweight" : "Obese";

        System.out.println("Your BMI index refers : " +message);



    }
}
