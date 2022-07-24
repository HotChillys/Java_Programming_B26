package day03_02_22_2022;

import java.util.Scanner;

public class CodilityTest {
    public static void main(String[] args) {

        /*
        Task : 	 Write a function:
				    		 that, given a positive integer N  However, any number divisible by 2, 3 or 5 should be replaced by the word

				    			Codility -- 2
				    			Test     -- 3
				    			Coders   -- 5

				    			- If a number is divisible by more than one of the numbers:2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.

				    			EXPECTED

				    						 numbers divisible by both 2 and 3 should be replaced by CodilityTest
				    						 INPUT : 6    OUTPUT :  CodilityTest

				    						 numbers divisible by both 3 and 5 should be replaced by TestCoders
                                             INPUT : 15    OUTPUT :  TestCoders

				    			 			 numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
				    			 			 INPUT : 30    OUTPUT :  CodilityTestCoders

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        String message = "";

        if ( num % 2 == 0){
            message += "Codility";
        }

        if ( num % 3 == 0) {
            message += "Test";
        }

        if ( num % 5 == 0) {
            message += "Coders";
        }
        System.out.println(message);





        // with multi branch if

        if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0) {
            message = "CodilityTestCoders";
        } else if (num % 2 == 0 && num % 3 == 0) {
            message = "CodilityTest";
        } else if (num % 3 == 0 && num % 5 == 0) {
            message = "TestCoders";
        } else if (num % 2 == 0 && num % 5 == 0) {
            message = "CodilityCoders";
        } else if (num % 3 == 0) {
            message = "Test";
        } else if (num % 5 == 0) {
            message = "Coders";
        }

        System.out.println(message);









    }
}
