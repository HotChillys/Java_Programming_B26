package day28_05_24_2022;

public class ThrowException {
    public static void main(String[] args) {

        String str = "";

        if (str.isEmpty()) {
            System.out.println("1: Name cannot be empty");
            System.err.println( "2: Name cannot be empty");
            throw new RuntimeException("3: Name cannot be empty");
        }


    }
}
