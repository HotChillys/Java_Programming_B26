package day10_scanner;
import java.util.Scanner;
public class YourInfo {
    public static void main(String[] args) {
        /*
        Ask the user to enter their age (byte),
ask them to enter their favorite number (long),
and ask them to enter their favorite book
Print all the values from the inputs
         */
      Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        byte age = input.nextByte();
        System.out.println("Favorite number: ");
        long favNumber = input.nextLong();
        System.out.println("Favorite book: ");
        String favBook = input.next();


    }
}
