package java_codes_100;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        System.out.println(reverseNumber());
    }

    public static int reverseNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int n;
        int reverse = 0;
        n = input.nextInt();
        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n/10;
        }
        return reverse;
    }
}
