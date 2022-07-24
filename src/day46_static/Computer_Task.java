package day46_static;

public class Computer_Task {

    double price;
    String brand;
    String colour;

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    static {
        hasScreen = true;
        hasBattery = true;
        hasMemory = true;
    }


    public static void main(String[] args) {
        Computer_Task number1 = new Computer_Task();
        System.out.println(Computer_Task.hasMemory);
        System.out.println(Computer_Task.hasBattery);
        System.out.println(Computer_Task.hasScreen);
    }





}
