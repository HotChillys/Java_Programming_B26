package day18_string;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your address");
        String address = input.nextLine();
        address = address.trim();
        address = address.toUpperCase();

        String side = "";
        String streetKind = "";

        if (address.startsWith("500")) {
            side = "House on the right side";
        } else if (address.startsWith("600")) {
            side = "House on the left side";
        }
        if (address.endsWith("DRIVE")) {
            streetKind = "House on drive";
        } else if (address.endsWith("LANE")) {
            streetKind = "House on lane";
        } else if (address.endsWith("AVENUE")) {
            streetKind = "house on avenue";
        }

        System.out.println(address + "\n" +side+ "\n" +streetKind);













    }
}
