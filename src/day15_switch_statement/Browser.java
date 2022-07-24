package day15_switch_statement;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your browser");
        String browser = input.nextLine();
        System.out.println("Enter your URL");
        String url = input.nextLine();

        switch (browser){

            case "chrome":
            case "Chrome":
                System.out.println("Opening " + url + " in the chrome browser");
                System.out.println("loading...");
                break;
            case "Safari":
                System.out.println("Opening " + url + " in the safari browser");
                System.out.println("loading...");
                break;
            case "Firefox":
                System.out.println("Opening " + url + " in the firefox browser");
                System.out.println("loading...");
                break;
            default:
                System.out.println(browser + " is not a valid browser");

        }











    }
}
