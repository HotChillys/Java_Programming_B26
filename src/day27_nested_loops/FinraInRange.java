package day27_nested_loops;

import java.util.Scanner;

public class FinraInRange {
    public static void main(String[] args) {
        /*
        similar to FIZZBUZ

        number
            % 3 --> fin
            % 5 --> ra
            % both --> finra
            neither --> number
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your stopping point");
        int stop = input.nextInt();

        for (int i = 1; i < stop; i++) {

            String str = "";

            if (i % 3 == 0) {
                str += "FIN ";
            }
            if (i % 5 ==0) {
                str += "RA ";
            }
            System.out.print((str.isEmpty() ? i : str) + " ");

        }












    }
}
