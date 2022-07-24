package day14_03_29_2022;

public class SumOfIntegers {
    /*
             Please implement this method to return the sum of all integers found in the parameter String.

                    String s="jav45ai1000sgre1at82"
                     result: 45+1000+1+82 ----> 1128
     */

    public static void main(String[] args) {
        String s="jav45ai1000sgre1at82";
        System.out.println(sumOfIntegers(s));
    }

    public static int sumOfIntegers(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
           if (Character.isDigit(str.charAt(i))) {
               sum += Integer.parseInt("" + str.charAt(i));
           }
        }

        return sum;
    }

}
