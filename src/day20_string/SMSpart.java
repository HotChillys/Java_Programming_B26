package day20_string;

public class SMSpart {
    public static void main(String[] args) {

        /*
        Given a String in the following format:
        “Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and
        problem solving}”
        Separate these parts and print them separately:
        Sender: actualSender
        Number: actualNumber
        Message: actualMessage”
         */
//        String a = "“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving }”";
//       System.out.println(a.indexOf());
//
//        System.out.println(a.substring(1, 9) + a.substring(10, 20));
//
//        System.out.println(a.substring(28, 36) + a.substring(37, 48));
//
//        System.out.println(a.substring(54, 63) + a.substring(65, 103));

        String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving }";

        int senderStart = msg.indexOf('<');
        int senderEnd = msg.indexOf('>');

        int numberStart = msg.indexOf('[');
        int numberEnds = msg.indexOf(']');

        int msgStart = msg.indexOf('{');
        int msgEnds = msg.indexOf('}');

        System.out.println("Sender: " + msg.substring(senderStart + 1, senderEnd) + "\nNumber: " + msg.substring(numberStart + 1, numberEnds) + "\nMessage: " + msg.substring(msgStart + 1, msgEnds));






















    }
}
