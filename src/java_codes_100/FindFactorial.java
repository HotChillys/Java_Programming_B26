package java_codes_100;

import java.math.BigInteger;
import java.util.Scanner;

public class FindFactorial {

    //factorial formula: n! = n * (n-1)!  ex: 5! = 5*4*3*2*1 = 120

    public static String factorial() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int n;
        n = input.nextInt();
        int res = 1;
        if (n > 0) {
            for (int i=n; i>0; i--) {
                res = res*i;
            }
            return res + "";
        } else {
            return "number needs to be positive";
        }
    }

    public static int largeNumberFactorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number");
        String n;
        n = input.nextLine();

        BigInteger num = new BigInteger(n);
        int res = 1;
        for (int i = num.intValue(); i > 0; i--) {
            res = res * i;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(factorial());
        System.out.println(largeNumberFactorial());

    }
}
