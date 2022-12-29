package Foo_IQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveNumber {
    /*
     Sunday Task for you:) int y[]=new int[]{6,-6,5,1,2,8};
    Remove all digits that less than 0 and also if that numbers match any number remove that number too
        examp: -6 is less than 0 and also equals 6 . So output should be [5, 1, 2, 8]
     */
    public static void main(String[] args) {

        int [] arr = {5, 1, 2, 8, -15, 5};

        System.out.println(removeDupe(arr));


    }

    public static List<Integer> removeDupe (int [] a) {

        List<Integer> list = new ArrayList<>();
        for (int each : a) {
            list.add(each);
        }

        List<Integer> newList = new ArrayList<>();

        for (Integer each : list){
            if (each >= 0 && Collections.frequency(list, each) <= 1) {
                newList.add(each);
            }
        }


        return newList;
    }
}
