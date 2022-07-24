package Foo_IQ;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfString {
    /*
    write a method that can return the sum of digits in a string
    input = “abc4d6rf7”
    Output = 17
     */
    public static void main(String[] args) {

        String str = "abc4d6rf7";
        System.out.println(sumOfString(str));

    }

    public static int sumOfString(String str){

        int n = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                n += Integer.parseInt(str.charAt(i) + "");
            }
        }
        return n;
    }

}
