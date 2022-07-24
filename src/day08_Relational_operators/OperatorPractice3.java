package day08_Relational_operators;

public class OperatorPractice3 {
    public static void main(String[] args) {

        int h = 5; // h=5
        int p = h; // p=h=5

        h++; // post increment. adds 1 to h

        System.out.println("h " + h); // h=6
        System.out.println("p " + p); // p=5

        int k = h++; // k=h+1=5+1=6

        System.out.println("h " + h); // h=7, prints 7
        System.out.println("k " + k); // k=6, prints 6

        int g = ++h; // g=7+1

        System.out.println("h " + h); // h=8, prints 8
        System.out.println("g " + g); // g=8, prints 8







    }
}
