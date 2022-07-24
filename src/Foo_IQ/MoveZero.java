package Foo_IQ;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZero {
/*
int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
        ArrayList<Integer> list = new ArrayList<>();
output
[1, 2, 3, 49, 6, 5, 0, 0, 0]
 */
public static void main(String[] args) {

    int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};

    ArrayList<Integer> list = new ArrayList<>();

    for (int each : arr){
        list.add(each);
    }

    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) == 0) {
            list.remove(list.get(i));
            list.add(0);
        }
    }
    System.out.println(list);
}
}
