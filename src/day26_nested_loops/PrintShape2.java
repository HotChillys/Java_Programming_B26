package day26_nested_loops;

public class PrintShape2 {
    public static void main(String[] args) {
        /*
        Print this shape:
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
         */

        int a = 9;


        for (int i = 0; i < a; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print(" * ");

            }
            System.out.println();
        }


    }
}
