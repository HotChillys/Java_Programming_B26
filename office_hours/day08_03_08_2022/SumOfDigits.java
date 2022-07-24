package day08_03_08_2022;

public class SumOfDigits {
    public static void main(String[] args) {
        /*
        Write a program that can return the sum of digits from  a  string
             		Ex:
             			input: A1B2C3

             			output: 6
             					1+2+3
         */

        // manual way
        String word = "A1B2C3";
        System.out.println("hard coded: " + (word.charAt(1) - 48 + word.charAt(3) -48 + word.charAt(5) - 48 )); // according to ASCII table, char '2' is 49, so minus 48 will give us the value of char '1'

        // dynamic way
        int sum = 0;

        for (int i = 0; i < word.length(); i++) {

            char each = word.charAt(i);

            if (each >= '0' && each <= '9') {
                sum += each - 48;
            }

        }

        System.out.println("dynamic way: " + sum);








    }
}