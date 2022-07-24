package day42_custom_classes;

public class Car {
    /*
    Create a class Car

        create instance variables:
            model, year, color, fuel level (percent number)

        create instance methods:

            - toString(): [return String]
                returns all the information of the Car objects

            - drive(): [void]
                prints: driving $model
                subtract 5 from the fuel amount

            - fillTank(): [void]
                prints: filling tank
                fuel level will be maxed at 100

            - isLow() [boolean]
                create a method that will check if the gas level is low.
                    return true is the gas level is below 25
                    otherwise return false

        Create a separate class to create Car objects and test the methods created
     */

    String model;
    String colour;
    int year;
    int fuelLevel;

    public String toString() {
        return "Car model: " + model +
                "\ncolour: " + colour +
                "\nyear: " + year +
                "\nfuelLevel: " + fuelLevel + "%" +
                "\n" + (isLow() ? "Tank is low" : "Don't worry, keep driving");
    }

    public void drive(){
        System.out.println("Driving " + model);
        fuelLevel -= 5;
        System.out.println("Fuel amount is: " + fuelLevel + "%");
    }

    public void fillTank() {
            System.out.println("Filling tank: ");
            fuelLevel = 100;
        System.out.println("Fuel level is: " + fuelLevel + "%");

    }

    public boolean isLow(){
       return fuelLevel < 25;
    }









}

