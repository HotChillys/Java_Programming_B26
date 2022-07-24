package day17_string;

public class StringMethods {
    public static void main(String[] args) {

        String name = "james";

        // how to compare String value --> use .equals()
        System.out.println(name.equals("james"));

        System.out.println("cat" .equals("dog"));

        System.out.println(name .equals("James"));

        System.out.println(name.equalsIgnoreCase("James"));

        String a = new String("Hello");
        String b = new String("Hello");
        System.out.println(a .equals(b)); // compares a object with b object

        System.out.println(a.equals("Hello")); // compares a object with literal "Hello"" object

        System.out.println(name.length());

        String last = "today was fun";
        System.out.println(last.length());

        System.out.println(last.equals("today"));
        System.out.println(last.equalsIgnoreCase("TODAY WAS FUN"));


    }
}
