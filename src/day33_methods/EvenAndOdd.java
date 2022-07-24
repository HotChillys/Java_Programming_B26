package day33_methods;

import java.util.Arrays;

public class EvenAndOdd {
    /*
    Create a method that accepts an int array. Count how many even and odd
    numbers there is. Print an array at the end where the first element is how
    many even numbers there was and the second element in the number of odd
    elements
    Ex:
    input: ( {1, 2, 3, 4}) -> [ 2, 2 ]
    input: ( {1, 3, 5, 2}) -> [ 1, 3 ]
     */
    public static void evenAndOddCount(int [] numbers) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else if (numbers[i] % 2 == 1) {
                oddCount++;
            }
        }
        int [] myArray = {evenCount,  oddCount};
        System.out.println(Arrays.toString(myArray));
    }

    public static void main(String[] args) {
        int [] numbers = {50, 1, 10, 500, 20, 40, 124};
        evenAndOddCount(numbers);
    }
}
