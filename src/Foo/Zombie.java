package Foo;

import java.util.Arrays;

public class Zombie {
    public static void main(String[] args) {

        int [] arr = {3, 6, 0, 4, 3, 2, 7, 0};

        int day = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i-1 >= 0 && arr[i-1] == 0 || i+1 < arr.length && arr[i+1] == 0 ) {
                arr[i] = arr[i] / 2;
                if (arr[i] < 1) {
                    arr[i] = 0;
                }
            }
            day++;
            System.out.println("Day " + day + " " + Arrays.toString(arr));
        }







    }
}
