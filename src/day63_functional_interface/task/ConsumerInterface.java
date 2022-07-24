package day63_functional_interface.task;

import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        /*
        Create a function that prints the first and last element of an array
         */
        Consumer<int []> printFirstLast = arr -> {
            System.out.println(arr[0]);
            System.out.println(arr[arr.length - 1]);
        };
        int [] arr = {3, 7, 0, 2, 5, 7};
        printFirstLast.accept(arr);

        /*
        Create a function that prints the middle character/s of a String
         */
        Consumer<String> printMiddle = str -> {

            if (str.length() % 2 == 0) {
                System.out.println( "" + str.charAt((str.length() / 2) -1) + "" + str.charAt((str.length() / 2)));
            }
            if (str.length() % 2 == 1) {
                System.out.println( ("" + str.charAt((str.length() - 1) / 2)) );
            }
        };
        printMiddle.accept("java");
        printMiddle.accept("apple");




    }
}
