package day18_string;


import java.util.Scanner;

public class Website {
    public static void main(String[] args) {

           /*
    Ask the user to enter a website
    check if it is a valid website

    - it is valid if it begins with:
        www.

    - it is valid if the end is:
        .com
        .edu
        .gov
        .net
        if cases are not valid, tell the reason why
     */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the url");
        String url = input.nextLine();
        url = url.toLowerCase();

        boolean validStart = url.startsWith("www.");
        boolean validEnd = (url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov") || url.endsWith(".net"));

        if (validStart && validEnd) {
            System.out.println("opening website " +url);
        } else {
            if ( !validStart ) {
                System.out.println("url needs to start with www.");
            } if (!validEnd) {
                System.out.println("url needs to end with .com or .edu or .net or .gov");
            }
        }



//        if (url.startsWith("www.") && (url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov") || url.endsWith(".net"))) {
//            System.out.println("opening website " +url);
//        } else {
//            System.out.println("Invalid website. It must start with www. and .com or .gov or .edu or .net");
//        }















    }
}
