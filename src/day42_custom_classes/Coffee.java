package day42_custom_classes;

public class Coffee {

    String brand;
    double price;
    double size;
    String type;

    @Override
    public String toString() {
        return type + "from: " + brand +
                "Size of " + size + " oz. for a total price of $"  + price;

    }

    public void drink() {
        System.out.println("Drinking " + type);
        size -= 1.5;
    }
    public void refill(double amount){
        System.out.println("Refilling " + amount + " oz of coffee");
        size += amount;
    }

    }

