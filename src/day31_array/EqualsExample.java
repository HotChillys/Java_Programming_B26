package day31_array;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {

        int [] a = {1, 2, 3};
        int [] b = {1, 2, 3};
        int [] c = a;

        System.out.println(a == b); // different object, cannot compare like this
        System.out.println(Arrays.equals(a, b)); // this compares 2 different Arrays object
        System.out.println(a == c); // this is comparing same object
        System.out.println(a.equals(b)); // this method is not Arrays.equals()

        boolean same = Arrays.equals(a, b);

        int [] d = {3, 2, 1};
        System.out.println(Arrays.equals(a, d));

    }
}
