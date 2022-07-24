package day25;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String str = input.nextLine().toLowerCase().trim();

        String camelCase = str.substring(0, 1);// i'm putting the first character into the string right away, because my loop will start from i = 1. it starts from i = 1 because i don't want to do this in the first iteration

        for (int i = 1; i < str.length() ; i++) {

            if (str.charAt(i -1) == ' ') {
                camelCase += str.substring(i, i + 1).toUpperCase();//or ("" + str.charAt(i))
                // str.substring(i, i + 1) is the same as charAt(i) but the types are different.
            }else {
                camelCase += str.charAt(i); // today
            }

        }

        System.out.println(camelCase.replace(" ", ""));// delete the spaces









    }
}
