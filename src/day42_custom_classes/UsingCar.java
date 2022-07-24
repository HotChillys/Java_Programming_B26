package day42_custom_classes;

public class UsingCar {
    public static void main(String[] args) {

        Car one = new Car();
        System.out.println(one);

        one.model = "Escape";
        one.colour = "Red";
        one.year = 2018;
        one.fuelLevel = 80;
        System.out.println();
        System.out.println(one);
        System.out.println();

        one.drive();
        one.drive();
        one.drive();
        System.out.println();

        one.fillTank();





    }
}
