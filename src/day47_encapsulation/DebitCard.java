package day47_encapsulation;

public class DebitCard {

    long cardNumber;
    String cardHolderName;
    String cardType;
    int pin;
    double balance;

    static String accountType;

    static {
        accountType = "Checking";
    }
    public DebitCard(long cardNumber, String cardHolderName, double balance) {
        if (String.valueOf(cardNumber).length() == 16){
            this.cardNumber = cardNumber;
        } else {
            System.err.println("Invalid Card Number");
        }
        this.cardHolderName = cardHolderName;
        this.balance = balance;
    }
    public DebitCard(long cardNumber, String cardHolderName, String cardType, int pin, double balance) {
        this(cardNumber, cardHolderName, balance);
        if (cardType.equalsIgnoreCase("Visa debit") || cardType.equalsIgnoreCase("Debit")) {
            this.cardType = cardType;
        } else {
            System.err.println("Invalid card type");
        }

        if (String.valueOf(pin).length() == 4) {
            this.pin = pin;
        } else {
            System.err.println("Invalid Pin");
        }

    }
    public String toString() {
        String info = "Card holder name: " + cardHolderName;

        if (cardNumber != 0) {
            info += "\nCard Number: " + cardNumber;
        }

        if (cardType != null) {
            info += "\nCard Type: " + cardType;
        }
        info += "\nBalance: " + balance;
        return info;

    }
}
