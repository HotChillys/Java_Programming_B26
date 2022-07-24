package day33_methods;

public class PrintOddAndEvenNumbers {
    /*
        create a method that can print odd numbers between 1-100 in the
        same line separated by space
        create a method that can print even numbers between 1-100 in the
        same line separated by space
     */
    public static void oddNumber(int nums) {
        for (int n = 1; n <= 100; n++) {
            if (n % 2 == 1) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

    public static void evenNumber(int nums) {
        for (int n = 1; n <= 100; n++) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        oddNumber(100);
        evenNumber(100);
    }
}
