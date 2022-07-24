package Foo_IQ;

public class IQ_Fizzbuzz {
    public static void main(String[] args) {
/*
FizzBuzz. Print numbers from 1 to 100
- if a number is divisible by 3 print Fizz
- if a number is divisible by 5 print Buzz
- if a number is divisible by both 3 and 5 print FizzBuzz
 */

        String str = "";
        for (int n = 0; n <= 100; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                str += "FizzBuzz" + ", ";
            } else if (n % 3 == 0) {
                str += "Fizz" + ", ";
            } else if (n % 5 == 0) {
                str += "Buzz" + ", ";
            }

        }
        System.out.println(str);


    }
}
