package day12_multi_if_statement;

public class Calculator {
    public static void main(String[] args) {

        /*
        create a class Calculator
        - do it without Scanner
        declare and assign 2 number variables
        declare and assign a char variable for an operator
        create a calculator based on the operator picked
        + : add num1 and num2
        - : minus num1 and num2
        * : multiply num1 and num2
        / : divide num1 and num2
        any other char: "invalid operator"
         */

        double num1 = 10, num2 = 5, num3 = num1 * num2;

        if (num3 == 15) {
            System.out.println("Sum of 10 and 5 is 15");
        } else if (num3 == 5) {
            System.out.println("Difference between 10 and 5 is 5");
        } else if (num3 == 50) {
            System.out.println("Product of 10 and 5 is 50");
        } else if(num3 == 2) {
            System.out.println("10 divided by 5 is 2");
        } else {
            System.out.println("invalid operator");}






    }
}
