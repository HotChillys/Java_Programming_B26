package Foo_IQ;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String a = "abc";
        String b = "bac";

       char [] arr1 = a.toCharArray();
       char [] arr2 = b.toCharArray();

       Arrays.sort(arr1);
       Arrays.sort(arr2);

     if (Arrays.equals(arr1, arr2) ) {
         System.out.println(true);
     } else {
         System.out.println(false);
     }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
