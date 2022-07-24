package day05_variables;

public class RecapVariables {

    public static void main(String[] args) {


        //Declare variables

        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalTStudentInClass;

        //we can't print the variables because they don't have a value
//        System.out.println( numberOfCoffeeCups);
//        System.out.println( totalPriceOfCoffee);
//        System.out.println(totalTStudentInClass);

        //Assigning to variable

        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 10.25;
        totalTStudentInClass = 432;

        System.out.println( numberOfCoffeeCups);
        System.out.println( totalPriceOfCoffee);
        System.out.println(totalTStudentInClass);

        System.out.println("numberOfCoffeeCups = " + numberOfCoffeeCups);
        System.out.println("totalPriceOfCoffee = $" + totalPriceOfCoffee);
        System.out.println("totalTStudentInClass = " + totalTStudentInClass); //we use concatenation to print the value of two variables at the time


        //Declare and assign

        double temperature = 20;
        int javaDays = 5;

        System.out.println("\nthis is my temperature " + temperature);
        System.out.println("it is day " + javaDays+" in java class");





    }

}
