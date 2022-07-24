package day36_methods;

public class Picture {
    public static void draw(){
        System.out.println("trying to draw");
    }
    public static void draw(String colour) {
        System.out.println("draw with " + colour);
    }
    public static void draw(String colour, String colour2) {
        System.out.println("trying with colour " + colour + " and with " + colour2);
    }
    public static void draw(int size) {
        System.out.println("drawing with size " + size);
    }

    public static void draw (String colour, int size) {
        System.out.println("colour with size");
    }

    public static void draw(int size, String colour){
        System.out.println("size first, then colour");
    }
}

// this is call overloading. same method name with different parameter.
