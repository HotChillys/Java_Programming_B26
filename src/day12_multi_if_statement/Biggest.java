package day12_multi_if_statement;

public class Biggest {
    public static void main(String[] args) {



        int num1 = 50;
        int num2 = 100;
        int num3 = 150;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1);}
        else if (num2 >= num1 && num2 >= num3) {
                System.out.println(num2); }
        else {
                System.out.println(num3);}


    }
}
