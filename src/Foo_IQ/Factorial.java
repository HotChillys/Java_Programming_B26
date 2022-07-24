package Foo_IQ;

public class Factorial {
    /*
    Write a return method that returns the factorial number of any given number
    ex: input: 5
    output: 120;
     */
    public static void main(String[] args) {

        int n = 6;

System.out.println(factorial(n));

    }

    public static int factorial(int n) {
        int num = 1;

        for (int i = n; i > 0; i--) {
            num *= i;
        }
        return num;
    }
}
