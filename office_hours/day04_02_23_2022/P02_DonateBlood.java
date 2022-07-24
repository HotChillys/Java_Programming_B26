package day04_02_23_2022;

import java.util.Scanner;

public class P02_DonateBlood {
    public static void main(String[] args) {

        /*    ( Scanner Class can be used )


					        Create a program that accepts age and weight(kg) as int.

					        If age greater than or equal 18 and weight greater than 50 kg give a message
					        	EXPECTED  :  "You are eligible to donate blood"

					        If age greater than or equal 18 and weight smaller or equal than 50 kg give a message
					        	EXPECTED  :  "You are not eligible to donate blood"

					        If age is smaller than 18 "Age must be greater than 18"
					        	EXPECTED  :  "Age must be greater than 18"

      				   */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age and weight");
        int age = input.nextInt();
        int weight = input.nextInt();
        String message= "";

        if (age >= 18 && weight > 50) {          //
            message = "You are eligible to donate blood";

        } else{
            if (age >= 18 ){
                message = "You are not eligible to donate blood";
            } if ( age < 18){
                message = "Age must be greater than 18";
            }
        }

        System.out.println(message);

        System.out.println("-----------with Ternary-------------");
        message =  age < 18 ? weight > 50 ? "Age must be greater than 18" : "You are not eligible to donate blood" : "You are eligible to donate blood";

        System.out.println(message);













    }
}
