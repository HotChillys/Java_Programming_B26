package day05_variables;

public class Cellphone {
    public static void main(String[] args) {

//Task
//
//    create a class CellPhone
//    create a main method
//    declare and assign these variables:
//        brand, model, color, price, storage, hasCamera
//
//    Print all the variables
//       sample data: apple, iphone 10, black, 1000, 128, true, A

        //approach 1

        String brand = "Apple";
        String model = "Iphone 10";
        String colour = "black";
        double price = 1000.99;
        int storage = 128;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("The brand of my phone is "+brand);
        System.out.println("I have an "+model);
        System.out.println("It came in colour "+colour+" with "+storage+" GB");
        System.out.println("It cost me $ "+price+" and it has camera "+hasCamera+" with type "+sim+ " card");

        //============================================================

        // approach 2 with String variable
        System.out.println();
        String fullMessage = "The brand of my phone is "+brand+ ", I have an "+model+", it came in colour "+colour+" with "+storage+" GB\nIt cost me $ "+price+" and it has camera "+hasCamera+" with type "+sim+ " card.";

        System.out.println(fullMessage);



    }
}
