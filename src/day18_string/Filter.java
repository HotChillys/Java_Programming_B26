package day18_string;



import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {

  /*
    ask the user to enter a message
    clean the message for empty spaces in the beginning and end
    check the message for bad phrases:

        java is bad
        quit
        have fun
        crying

    if there is a bad phrase in the message print:

        message failed to send

    otherwise print:

    $message sent
     */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your message");
        String message = input.nextLine();
        message = message.toLowerCase(); // input.nextLine().toLowerCase().trim();   this is call chaining
        message = message.trim();

        boolean filter = (message.contains("java is bad")) || (message.contains("quit")) || (message.contains("have fun")) || (message.contains("crying"));

        if (!filter) {
            System.out.println("message sent \n" +message);
        } else {
            System.out.println("message fail to send\n" +message);
        }












    }
}
