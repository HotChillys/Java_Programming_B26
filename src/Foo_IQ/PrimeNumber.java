package Foo_IQ;

public class PrimeNumber {
    /*
    Write a method that can check if a number is prime or not
    Prime number is a number that is greater than 1 and divided by 1 or itself only, and can't be divided by other numbers. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
     */
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(17));
    }

    public static String isPrimeNumber(int n){

        int a = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                a++;
            }
        }

        return (a == 2) ? "prime" : "not prime";
    }
}
