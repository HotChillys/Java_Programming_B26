package Foo_IQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    /*
    Write a return method that can sort an int array in ascending order without using the sort method of the array class.
    ex:
input: int [] arr = {10, 9, 8, 7};
output: int [] arr = {7, 8, 9, 10};

     */
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length; j++) {

                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));



        }

    }


// TODO: 2022-05-04
