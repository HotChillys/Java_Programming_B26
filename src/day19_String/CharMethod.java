package day19_String;

public class CharMethod {
    public static void main(String[] args) {

        String s = "java";
        //          0123
        System.out.println(s.length());

        System.out.println(s.charAt(0)); // j
        System.out.println(s.charAt(1)); // a
        System.out.println(s.charAt(2)); // v
        System.out.println(s.charAt(3)); // a
//        System.out.println(s.charAt(4)); // error

        int lastIndex = s.length() - 1; // 4 - 1 = 3
        System.out.println("last char: " +s.charAt(lastIndex)); // this is the same as line 13. but line 13 is hard coded

        int secondToLast = s.length() - 2;
        char secondToLastChar = s.charAt(secondToLast); // this is the same as line 12
        System.out.println("second to last character: " + secondToLastChar);
    }
}
