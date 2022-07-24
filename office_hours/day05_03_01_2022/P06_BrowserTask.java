package day05_03_01_2022;

import java.util.Scanner;

public class P06_BrowserTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Is your browser open?");
        boolean isBrowserOpen = input.nextBoolean();
        input.nextLine();
        System.out.println("Which browser?");
        String browser = input.nextLine();
        String operatingSystem = "";

        if (!isBrowserOpen) {
            switch (browser) {
                case "chrome":
                case "chrome-headless":
                case "firefox":
                case "firefox-headless":
                case "remote-chrome":
                    System.out.println("Which operating system?");
                    operatingSystem = input.nextLine();
                    System.out.println("Browser is opened successfully with " + browser + " in " + operatingSystem);
                    break;

                case "ie":

                case "edge":
                    System.out.println("Which operating system?");
                    operatingSystem = input.nextLine();
                    if (operatingSystem.equals("windows")) {
                        System.out.println("Browser is opened successfully with " + browser + " in " + operatingSystem);
                    } else {
                        System.out.println("Your" + operatingSystem + "doesn't support " + browser);
                    }
                    break;

                case "safari":
                    System.out.println("Which operating system?");
                    operatingSystem = input.nextLine();
                    if (operatingSystem.equals("mac")) {
                        System.out.println("Browser is opened successfully with " + browser + " in " + operatingSystem);
                    } else {
                        System.out.println("Your " + operatingSystem + " doesn't support " + browser);
                    }
            }

        } else {
            System.out.println("Which operating system?");
            operatingSystem = input.nextLine();
            System.out.println("Browser is already opened with " +browser+ " in " +operatingSystem);
        }








    }
}
