package day02_02_16_2022;

public class P02_GallonToLittle {
    public static void main(String[] args) {

       /*
          1.Create a class called GallonsToLiters, and write a program that can convert the gallons to litters
                           Ex:
                              gallon = 10;
                              output:
                                    10 gallons equal to 37.8541 liters

                           Hint: 1 gallon = 3.78541 liters
         */

        double gallon = 10;
        double liter = 37.8541;
        double oneGallon = liter / gallon;

        System.out.println("10 gallon = " +liter);

        gallon = 20;
        System.out.println("20 gallon = " +liter * 2);

    }
}
