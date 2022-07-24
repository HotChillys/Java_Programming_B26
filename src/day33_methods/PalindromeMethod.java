package day33_methods;

import java.util.Scanner;

public class PalindromeMethod {
    /*
    create a method that will accept a String and find if it is
    Palindrome or not
     */
    public static void palindrome(String words){
        String reverse  = "";
        for (int i = words.length() - 1; i >= 0; i--) {
            reverse += words.charAt(i);
        }
        if (reverse.equals(words)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        palindrome(input.nextLine());
    }
}
