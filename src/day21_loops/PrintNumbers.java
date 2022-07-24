package day21_loops;

public class PrintNumbers {
    public static void main(String[] args) {

        /*
        print all the even numbers from 1 to 100, on separate lines
        print all the numbers from 1 to 100, but all in one line with spaces between each number
         */

        int a = 2; // even numbers
        while (a <= 100 ) {
            System.out.println(a);
            a += 2;
        }
        System.out.println();

       // approach 2:

        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println();

        // odd numbers

        int b = 1;
        while (b <= 100) {
            System.out.print(b + " ");
            b += 2;
        }
        System.out.println();

        // approach 2

        int  c = 0;
        while (c++ < 100) {
            if (c % 2 == 1) {
                System.out.print(c + " ");
            }
        }

        /*
        flow:
        c = 0
        c++ <= 100 --> 0<= 100 --> loop runs and c is now 1
        if (b % 2 == 1) --> 1 % 2 == 1 --> true --> prints number

        while ( c++ <= 100) --> 1 <= 100 --> loop runs and c increments to 2
        if (c % 2 == 1) --> 2 % 2 == 1 --> false --> noting happens


         */



    }
}
