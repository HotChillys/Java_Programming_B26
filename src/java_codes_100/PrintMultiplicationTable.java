package java_codes_100;

import java.util.Scanner;

public class PrintMultiplicationTable {

    public static void multiplicationTable(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    public static void multiplication(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println("Multiplication of " + i + " is ");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }

    public static void main(String[] args) {
        multiplicationTable(5);
        multiplication(1, 9);
    }
}
