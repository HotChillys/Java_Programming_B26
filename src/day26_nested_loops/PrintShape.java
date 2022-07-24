package day26_nested_loops;

public class PrintShape {
    public static void main(String[] args) {
        /*
        Print this shape:
         *  *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *  *
         */

       int a = 8; // inner
       int b = 8; // outer

        for (int i = 0; i < a; i++) {

            for (int j = 0; j < b; j++) {

                System.out.print(" * ");

            }
            System.out.println(" * ");

        }














    }
}
