package day08_Relational_operators;

public class GalonsToLiters {
    public static void main(String[] args) {

        /*
                    create a class called GalonsToLiters, and write a program that can convert
            the gallons to litters
            Ex:
            gallon = 10;
            output:
            10 gallons equal to 37.8541 liters
            gallon = 20
            output:
            20 gallons equal to 75.7082 liters
         */

        int gallon = 10;
        double liter = 37.8541;
        double oneGallon = liter / gallon;

        System.out.println("10 gallon = " +liter);

        gallon = 20;
        System.out.println("20 gallon = " +liter * 2);
    }
}
