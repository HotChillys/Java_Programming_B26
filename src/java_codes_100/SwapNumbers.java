package java_codes_100;

public class SwapNumbers {
    //swap numbers without using third variable

    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        System.out.println("Before swap a = " + a + " b = " +b);
        b = a + b; //15
        a = b - a; //8
        b = b - a; //7
        System.out.println("After swap a = " + a + " b = " +b);
    }


}
