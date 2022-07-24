package day65_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        //creating stream

        int [] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr);

        List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 2));
        list.stream();

        // distinct() : remove duplicates

        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 2, 5, 6, 3, 2, 8));
        System.out.println(list2.stream().distinct().collect(Collectors.toList()));
        /*
        .stream() converts the list to a stream
        .distinct() remove duplicate values
        .collect(Collectors.toList()) converts the stream back to a list
        newList = list2.stream().distinct().collect(Collectors.toList()) // we can reassign it
         */

        System.out.println(list2); // original list in untouched

        int [] arr2 = {1, 2, 2, 3, 3, 3, 4, 7, 7, 7, 6, 5, 4, 8};
        arr2 = Arrays.stream(arr2).distinct().toArray();
        System.out.println("arrays " + Arrays.toString(arr2));

        System.out.println();

        // skip(): skips the defined number of element

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list1.stream().skip(4).collect(Collectors.toList()));
        System.out.println(list1.stream().skip(7).collect(Collectors.toList()));

        String [] arr3 = {"java", "hello", "world", "pen", "computer"};
        System.out.println(Arrays.toString(Arrays.stream(arr3).skip(3).toArray()));

        //limit(): keeping a certain amount of elements

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list3.stream().limit(6).collect(Collectors.toList()));
        System.out.println(list3.stream().limit(5).skip(3).collect(Collectors.toList()));
        System.out.println(list3.stream().skip(3).limit(4).collect(Collectors.toList()));

        System.out.println();

        // count():
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 3, 4, 3, 5, 6, 6, 5, 7));
        System.out.println(list4.stream().count());
        System.out.println(list4.stream().distinct().count());

        // task: find how many different letters there is (not about duplicate)
        String s  = "aaabbbbccccddddeefgg";
        System.out.println(Arrays.stream(s.split("")).distinct().collect(Collectors.toList())); // I could have also done .toArray() instead of collect method
        System.out.println(Arrays.stream(s.split("")).distinct().count());


    }
}
