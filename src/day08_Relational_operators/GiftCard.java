package day08_Relational_operators;

public class GiftCard {
    public static void main(String[] args) {

        /*
        task:
            declare and assign a gift card with 200
            buy 2 items.
             buy i item1 for x price and subtract from your gift card
            buy item 2 for x price and subtract from you gift card
            print the remaining balance of your gift card
         */

        double giftCard = 200;
        double item1 = 40.50;
        double item2 = 50.50;

        giftCard -= item1; // giftCard = giftCard - 40.50
        giftCard -= item2; // giftCard = giftCard - 50.50

        System.out.println(giftCard);







    }
}
