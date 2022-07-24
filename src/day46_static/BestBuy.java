package day46_static;

public class BestBuy {

    String location; // instance variable

    static String headquarters = "Richfield, Minnesota, United States";
    static String day = "Wednesday";
    static int numberOfComputer = 100;

    public BestBuy(String location) {
        this.location = location;
    }

    public static void restock(){
        numberOfComputer += 20;
    }

    public void openStore(){
        System.out.println("Opening the " + location) ;
    }

}
