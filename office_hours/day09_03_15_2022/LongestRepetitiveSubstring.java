package day09_03_15_2022;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestRepetitiveSubstring {
    public static void main(String[] args) {
        /*
        Real Interview Task-->  Longest Repetitive Substring

    Write a program if some substring K that can be repeated N>1 times to produce the input string exactly as it appears.
    Your program should return longest substring K, and
    if there is none it should be return "There is no repetitive substring"

    		For Example is str ="abcababcababcab"  			   output should be abcab
    					   str ="abcdefabcdef"     			   output should be abcdef

    					   str ="abcdefabcdefabcdefabcdef"    output should be abcdefabcdef
    					   str ="abcdefxabcdef"				   output should be "There is no repetitive substring"
         */
        String word = "abcdefabcdefabcdefabcdef";

//        String [] split = word.split("");
//        System.out.println(split.length);
//        System.out.println(Arrays.toString(split));

        String temp = "";
        String longest = "";
        for (int i = 0; i < word.length() / 2; i++) {

            temp += word.charAt(i);
            String [] s = word.split(temp);

            if (s.length == 0 && longest.length() < temp.length()) {
                longest = temp;
            }
        }
        System.out.println(!longest.isEmpty() ? longest : "There is no repetitive substring");













    }
}
