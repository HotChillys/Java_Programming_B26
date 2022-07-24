package day33_methods;

import java.util.Scanner;

public class VoteEligibility {
    /*
    create a method that will accept an age and determine if the person is
    eligible to vote. Person must be 18 years or older to vote
     */
    public static void votingAge(int nums) {
        if (nums >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        votingAge(age);
    }
}
