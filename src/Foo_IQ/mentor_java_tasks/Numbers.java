package Foo_IQ.mentor_java_tasks;

public class Numbers {
    /*
    Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
     */

    public static void numbers(int n ){

        String two = "Codility";
        String three = "Test";
        String five = "Coders";

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println(two + three + five);
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(two + three);
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(two + five);
            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(three + five);
            } else if (i % 2 == 0){
                System.out.println(two);
            } else if (i % 3 == 0) {
                System.out.println(three);
            } else if (i % 5 == 0) {
                System.out.println(five);
            } else {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {

        numbers(24);



    }
}
