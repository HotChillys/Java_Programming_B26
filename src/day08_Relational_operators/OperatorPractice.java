package day08_Relational_operators;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class OperatorPractice {
    public static void main(String[] args) {

        int b = 10; // b=10
        b++; // b=11
        System.out.println(b); // b=11, prints 11
        b--; //b=10
        System.out.println(b); // b=10, prints 10
        System.out.println(b++); // b=11, but will print 10
        System.out.println(b++); // b=12, but will print 11
        System.out.println(b); // b=12, will print 12



    }
}
