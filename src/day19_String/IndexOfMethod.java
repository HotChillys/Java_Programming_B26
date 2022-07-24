package day19_String;

public class IndexOfMethod {
    public static void main(String[] args) {

        String s = "pen";

        System.out.println(s.indexOf("p")); // 0
        System.out.println(s.indexOf("e")); // 1
        System.out.println(s.indexOf("n")); // 2

        System.out.println(s.indexOf("x")); // -1, because it doesn't exist

        System.out.println(s.indexOf("pe")); // 0, only gives the first one
        System.out.println(s.indexOf("pz")); // -1, because pz sequence doesn't exist

    }
}
