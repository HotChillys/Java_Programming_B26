package Foo_IQ.mentor_java_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySumUpTo0 {
    /*
    1) Array - N unique integers that sum up to 0
        Write a function:
        that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array.
        For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
        For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
     */

    public static int [] sum0Array(int n) {

        int [] arr = new int[n];

        arr[0] = n;
        arr[1] = -n;

        for (int i = 2; i < n; i++) {
            arr[i] = 0;
        }

        return arr;
    }

    public static void main(String[] args) {

        int n = 4;

        System.out.println(Arrays.toString(sum0Array(n)));



    }



}
