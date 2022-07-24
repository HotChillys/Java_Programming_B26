package day11_if_statement;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the temperature ");
        double temperature = input.nextDouble();

        if (temperature > 20) {
            System.out.println("Go outside, but with your laptop to code java");
        }else{
            System.out.println("It's too cold, code more java");}








    }

}
