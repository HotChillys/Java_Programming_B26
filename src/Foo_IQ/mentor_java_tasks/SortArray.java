package Foo_IQ.mentor_java_tasks;

import javax.print.DocFlavor;
import java.util.*;

public class SortArray {
    /*
        Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    Ex:
            int[] arr = {10, 9, 8, 7};
            arr = Sort(arr);         ==>{ 7, 8, 9, 10};
     */

    public static Set<Integer> sortArray(int [] arr) {

        Set<Integer> list = new TreeSet<>();
        for (Integer each : arr) {
            list.add(each);
        }
        return list;
    }

    public static int [] sortArray2(int [] arr) {

        int n = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length-1; j++) {
                if (arr[i] > arr[j]) {
                    n = arr[i];
                    arr[i] = arr[j];
                    arr[j] = n;
                }
            }
        }

        return arr;
    }

// TODO: 2022-06-09




    public static void main(String[] args) {

        int [] arr = {10, 9, 8, 7};

        System.out.println(sortArray(arr));
        System.out.println(Arrays.toString(sortArray2(arr)));

    }

}
