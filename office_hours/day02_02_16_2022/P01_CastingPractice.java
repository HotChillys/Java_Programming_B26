package day02_02_16_2022;

public class P01_CastingPractice {
    public static void main(String[] args) {

        /*
         Task01:   Casting and Variables Practice

         */

        //byte to short
//        byte a = 10;
//        short s = a; // implicit casting

        //double to int
        double a = 5.3;
        int i = (int) a; // Explicit casting
        System.out.println("i = " + i);
        a = i;
        System.out.println("a = " + a);

        //long to int
        //long l = 99;          //Implicit casting
        long l = 9999999999L;            // there is no casting
        int i2 = (int) l;
        System.out.println("i2 = " +i2);

        double d = 15.2;
        int i3 = (byte) d;
        System.out.println("i3 = " +i3);




    }
}
