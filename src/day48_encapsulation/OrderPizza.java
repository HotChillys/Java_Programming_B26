package day48_encapsulation;

public class OrderPizza {
    public static void main(String[] args) {

        Pizza first = new Pizza("large", 3);
        System.out.println(first);

        first.setNumberOfTopping(2);
        System.out.println(first);

        Pizza second = new Pizza("", -2);
        System.out.println(second);

        second.setSize("small");
        second.setNumberOfTopping(1);
        System.out.println(second);








    }
}
