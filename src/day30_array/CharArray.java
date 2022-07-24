package day30_array;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        char [] letter = {'j', 'a', 'v', 'a'};

        String word = "java";

        // converting a String to a char []
        char [] java = word.toCharArray();

        System.out.println(Arrays.toString(letter));
        System.out.println(Arrays.toString(java));

       // System.out.println(letter); // String work with char[] internally so the char[] is able to be printed as the String

        // print every letter in my String

        for (char eachChar : java) { // or we can also do this instead of declaring char java--> for(char eachChar : word.toCharArray())
            System.out.println(eachChar);
        }
        System.out.println(java[0]);

        //convert a char array to a string

        char [] day = {'m', 'o', 'n', 'd', 'a', 'y'};
        System.out.println(day.length);

        String strDay = new String(day);
        System.out.println(strDay);








    }
}
