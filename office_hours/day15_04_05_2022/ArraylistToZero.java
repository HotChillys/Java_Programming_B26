package day15_04_05_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistToZero {
    /*
     write a program that can set the last element of the Integer arraylist to zero
                        ex:
                            list = [1,2,3,4,5];
                            output: [1,2,3,4,0];

     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.add(0);
        System.out.println(list);

           /*
    write a program that can swap the first and last elements of an ArrayList
     */

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6));

        Collections.swap(list2,0, list2.size() - 1);
        System.out.println(list2);

        /*
         write a program that can multiply each odd number by 2
                        ex: list = [1,2,3,4,5];
                            output: [2,2,6,4,10]
         */

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        for (Integer each : list3) {
            if (each % 2 == 1) {
                each = each * 2;
            }
            System.out.print(each + " ");
        }
        System.out.println();

     /*
        write a program that can combine two String arrays into one arrayList
                        ex:
                            arr1 = {"A", "B", "C"};
                            arr2 = {"D", "E", "F", "G"};
                            list ==> {"A", "B", "C", "D", "E", "F", "G"}
      */
        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};
        ArrayList<String> myList = new ArrayList<>();

        for (String each : arr1) {
            myList.add(each);
        }
        for (String each : arr2) {
            myList.add(each);
        }
        System.out.println(myList);
        System.out.println("======or======");


        ArrayList<String> result = new ArrayList<>();
        result.addAll(Arrays.asList(arr1));
        System.out.println(result);
        result.addAll(Arrays.asList(arr2));
        System.out.println(result);










    }


}
