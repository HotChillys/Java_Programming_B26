package day25;

import java.util.Scanner;

public class ReverseSecondWord {
    public static void main(String[] args) {

        /*
        Reverse only second word [String, Loops]
        Given a String with three words separated by spaces. Reverse only the
        second word and return the modified String
        Ex:
        I love java
        Ouput:
        I evol java
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter you 3 words sentence");
        String str = input.nextLine().trim();

        int firstSpace = str.indexOf(" ");
        int lastSpace = str.lastIndexOf(" ");  // or str.indexOf(" ", firstSpace + 1);

        String middle = str.substring(firstSpace + 1, lastSpace);
                        // or str.substring(firstSpace, lastSpace).trim()

        String reverse = "";
        int n = 0;
        for (int i = middle.length() -1; i >= 0; i--) {

            reverse +=  middle.charAt(i);

        }

        System.out.println(str.substring(0,firstSpace) + " " + reverse + " " + str.substring(lastSpace + 1));

        // or with replace method

        System.out.println(str.replace(middle, reverse));




    }
}
