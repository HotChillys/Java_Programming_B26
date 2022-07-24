package day42_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {

        Coffee order = new Coffee();

        order.brand = "Starbucks";
        order.type = "Black";
        order.size = 16.;
        order.price = 4.99;

        System.out.println(order);

        order.drink();
        order.drink();
        order.drink();
        order.drink();

        order.refill(8);

        System.out.println(order);




    }
}
