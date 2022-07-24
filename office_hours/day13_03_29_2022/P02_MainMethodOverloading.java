package day13_03_29_2022;

public class P02_MainMethodOverloading {
    public static void main(String[] args) {
        // can we overload mai method?
        // yes we can
        // but it will always look for the String one to run, other ones does not run
        System.out.println("Hello from String main");

    }

    public static void main(int[] args) {
        System.out.println("Hello from int main");
    }

    public static void main(double[] args) {
        System.out.println("Hello from double main");
    }

    public static void main(char[] args) {
        System.out.println("Hello from char main");
    }
}
