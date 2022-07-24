package day11_03_22_2022;

public class P03_Deeper {
    public static void main(String[] args) {

        System.out.println("Not deep");
        deep();
        System.out.println("Not deep");


    }
    public static void deep() {
        System.out.println("deep");
        deeper();
        System.out.println("deep");


    }
    public static void deeper() {
        System.out.println("deeper");


    }
}
