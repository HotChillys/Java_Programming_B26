package day05_variables;

public class ConcatenationExample {

    public static void main(String[] args) {

        System.out.println(5 + 4);

        System.out.println(5 + 4 + "Hello"); //int + int + String
                        //int + int =>
                        //9 (int) + "Hello"(String) => String

        System.out.println("Hello" + 5 + 4); // String + int + int
                        //String + int => String =  Hello5
                        //Hello5 (String) + 4(int) = Hello54

        //Concatenation makes everything String

    }
}
