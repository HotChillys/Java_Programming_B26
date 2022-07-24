package Foo_IQ.mentor_java_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        int [] arr = {4, 4, 4, 5,  6, 6, 6};

        System.out.println(test(arr));

        Arrays.sort(arr);
    }
    public static int test(int [] arr){
        int res = 0;
        List<Integer> list = new ArrayList<>();

        for (int each : arr) {
            list.add(each);
        }

        for (int i = 0; i < list.size(); i++) {
            if ( Collections.frequency(list, list.get(i)) < 2 ) {

                return res = list.get(i);
            }
        }
        return 0;
    }
}
