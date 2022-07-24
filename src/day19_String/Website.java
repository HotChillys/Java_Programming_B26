package day19_String;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
  /*
    Task

        ask the user to enter a url
        find and print the website from the url

        assume your url always starts with www.
        assume your url always ends with .com

        www.google.com

        --> google
     */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the url");
         String url = input.nextLine();         // www.google. c o m
                                               // 012345678910111213
        String website = url.substring(4, url.length() - 4);
        System.out.println(website);

        // url.substring(4, 10); doesn't work for all input, because 10 is hard coded







    }
}
