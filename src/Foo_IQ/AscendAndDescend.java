package Foo_IQ;

import java.util.Arrays;

public class AscendAndDescend {

     /*  if ascend true
    int[]a={1,2,3,4,5,6,7};

//  if descend  true
      int[]a={7,6,5,4};*/

    public static void main(String[] args) {

        int [] a = {1,2,3,4,5,6,7};

        System.out.println(ascending(a));
        System.out.println(descending(a));

    }

    public static boolean ascending(int [] a) {

        for (int i = 0; i < a.length-1; i++) {

            if (a[i] < a[i+1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean descending(int [] a) {

        for (int i = 0; i < a.length-1; i++) {

            if (a[i] > a[i+1]) {
                return true;
            }
        }
        return false;
    }

}
