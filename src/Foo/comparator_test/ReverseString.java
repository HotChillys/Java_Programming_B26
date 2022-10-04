package Foo.comparator_test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Canada", "US", "Japan");

        list.sort(new Sort_Comparator());

        System.out.println(list);

    }


    public static class Sort_Comparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    }

}
