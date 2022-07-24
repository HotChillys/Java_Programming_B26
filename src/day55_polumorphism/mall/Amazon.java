package day55_polumorphism.mall;

public final class Amazon extends OnlineShopping{

    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon cart");
    }

    @Override
    public void payForShipping(boolean b) {
        System.out.println(b ? "pay for shipping" : "free shipping");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("returning to amazon drop location");
    }
}
