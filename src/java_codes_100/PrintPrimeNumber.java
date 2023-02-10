package java_codes_100;

public class PrintPrimeNumber {
    // a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11)

    public static void primeNumberWithin100() { // print prime number within 100

        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= 100; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public static void main(String[] args) {
        primeNumberWithin100();
        System.out.println();
        System.out.println(isPrime(5));
    }
}
