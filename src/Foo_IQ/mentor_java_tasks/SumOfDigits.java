package Foo_IQ.mentor_java_tasks;

public class SumOfDigits {
    /*
    Write a method that can return the sum of the digits in a string
     */
    public static int sumOfDigits(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {
                sum += Integer.parseInt(s.charAt(i) + "");
            }
        }

       return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("38hgyt8"));
    }
}
