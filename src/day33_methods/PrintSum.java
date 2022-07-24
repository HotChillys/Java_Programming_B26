package day33_methods;

public class PrintSum {
    /*
    Create a method that accept an int array. Take the sum of all the numbers
    and print the result
     */
    public static void sumOfArray(int [] nums) {
        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int [] numbers = {50, 0, 10, 500, 20, 40, 124};
        sumOfArray(numbers);
    }
}
