package day47_encapsulation;

import day47_encapsulation.DebitCard;

public class UseDebit {
    public static void main(String[] args) {

        System.out.println(DebitCard.accountType);

        DebitCard obj1 = new DebitCard(1525458541232556L, "James", 100_000_00);
        System.out.println(obj1);

        System.out.println();

        DebitCard obj2 = new DebitCard(5454545454454545L, "Ben", 100000002);
        System.out.println(obj2);
        System.out.println(obj2.accountType);

        System.out.println();

        DebitCard obj3 = new DebitCard(5454547454454545L, "John", "visa debit", 7000, 100000002);
        System.out.println(obj3);

        // invalid values
        System.out.println();
        DebitCard obj4 = new DebitCard(52656321146L, "Ryan", "saving", 7, 100000000);
        System.out.println(obj4);



    }
}
