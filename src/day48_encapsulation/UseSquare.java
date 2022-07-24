package day48_encapsulation;

public class UseSquare {
    public static void main(String[] args) {

        Square obj = new Square(5);
        System.out.println(obj);

        obj.setSide(11);

        System.out.println(obj.getSide());

        System.out.println(obj);

    }
}
