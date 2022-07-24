package day27_nested_loops;

public class PrimeInRange {
    public static void main(String[] args) {
        /*
        Given a number. Print out all the prime numbers from 2 to that number.
        A prime number is a number that is only divisible by 1 and itself.
        Ex:
        Input:
        50
        Output:
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
         */


        int prime = 50;

        for (int i = 2; i <= prime; i++) { //purpose of this loop is to check all the numbers from 2 to the value of the prime variable
            int count = 0; // putting the counter inside the outer loop will reset it back to 0 for the next number

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    count++;
                }

                } //inner end

            if (count == 0) {
                System.out.print(i + " " );
            }

            }





    }
}
