package day15_04_05_2022;

import java.util.ArrayList;

public class SumOfAllInteger {
    public static void main(String[] args) {
        /*
        Please implement this method to return the sum of all integers found in the parameter String.

                    String s="jav45ai1000sgre1at82"
                     result: 45+1000+1+82 ----> 1128
         */

        String s="jav45ai1000sgre1at82".toLowerCase();
        String temp = "";
        int sum = 0;

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            if(Character.isDigit(s.charAt(i))) {
                temp += s.charAt(i);
            }
            if (Character.isLowerCase(s.charAt(i)) || i == s.length() - 1) {
                if (!temp.isEmpty()){
                    list.add(temp);
                }
                temp = "";
            }
        }
        System.out.println(list);

        for (String each : list) {
            sum += Integer.parseInt(each);
        }
        System.out.println(sum);















    }


}
