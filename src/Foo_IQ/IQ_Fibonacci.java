package Foo_IQ;

import java.util.ArrayList;

public class IQ_Fibonacci {
    public static void main(String[] args) {
        /*
        The Fibonacci. It is a series of numbers where the next number is the sum of the previous two numbers. The first two numbers of the Fibonacci is 0 followed by 1. Write a method that will accept one int number n. The method will print n number of Fibonacci numbers.

  // fib(3)  -> 0 1 1
  // fib(5)  -> 0 1 1 2 3
  // fib(6)  -> 0 1 1 2 3 5
  // fib(10) -> 0 1 1 2 3 5 8 13 21 34
         */
        int n = 8;
        System.out.println(fibonacci(n));
    }

    public static ArrayList<Integer> fibonacci(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        for (int i = 2; i < n; i++) {
            list.add(list.get(i-1) + list.get(i-2));
        }
return  list;
    }
}
