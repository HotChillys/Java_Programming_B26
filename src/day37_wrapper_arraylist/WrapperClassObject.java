package day37_wrapper_arraylist;

public class WrapperClassObject {
    public static void main(String[] args) {

        int a = 5;
        // What we can do with this? assign/reassign, math, casting
        // What can't we do with this? a.method()

        Integer a2 = new Integer(10);
        Integer a3 = 20; // autoboxing -->  primitive to object
        int a4 = a3; // unboxing  -->  object to primitive

        System.out.println(a);
        System.out.println(a2);
        System.out.println(a3);

        byte b = 2;
        Byte b2 = 20;


    }
}
