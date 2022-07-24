package Foo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice {
    public static void main(String[] args) {

        int [] arr = {3, 6, 0, 4, 3, 2, 7, 0};
        ArrayList<Integer> list = new ArrayList<>(arr.length);
        for(int each : arr) {
            list.add(each);
        }
        System.out.print("Day 0 " );
        System.out.println(list);

        int day = 0;
        for (int k = 0; k < arr.length; k++) {



                for (int i = 0; i < arr.length; i++) {

                    if (  (i+1 < arr.length && arr[i+1] == 0) || (i-1 >= 0 && arr[i-1] == 0)  ) {
                        arr[i] /= 2;
                        if (arr[i] / 2 < 1) {
                            arr[i] = 0;
                        }
                    }
                }

            day = k + 1 ;
            System.out.println("Day " + day + " " + Arrays.toString(arr));
            if (Collections.frequency(list, 0) == list.size()) {
                break;
            }
        }










    }
}
