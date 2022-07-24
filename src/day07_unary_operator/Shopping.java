package day07_unary_operator;

public class Shopping {
    public static void main(String[] args) {

        int numberOfItems = 0;
        double price = 0.0;

        System.out.println("we pick up 1 water bottles");
        System.out.println("how many items in the cart: " + ++numberOfItems); // preincrement, so number of items increases right awa, then it is priced

        price = price + 2.5; // take price value which is 0, and add 2.5, and they reassign to the price variable


        System.out.println("we pick up 2 eggs");
        System.out.println("how many items in the cart: " + ++numberOfItems);
        System.out.println("how many items in the cart: " + ++numberOfItems);

        System.out.println(numberOfItems++);




    }
}
