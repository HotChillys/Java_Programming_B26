package day55_polumorphism.mall;

public final class Target extends Shopping{

    @Override
    public void buyItem() {
        System.out.println("I like buying target");
    }

    @Override
    public void returnItem() {
        System.out.println("I like returning target");
    }
}
