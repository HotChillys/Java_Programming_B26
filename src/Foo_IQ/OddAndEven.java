package Foo_IQ;

public class OddAndEven {
    public static void main(String[] args) {
        /*
        Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"
         */

        System.out.println(oddAndEven(5));

    }

    public static String oddAndEven(int num){
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}
