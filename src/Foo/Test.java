package Foo;

import java.util.*;
import java.util.function.Function;

public class Test {
    //Name.      Tests Per Day
    //Addy.        7
    //Preetam.  3
    //Lisa        5
    //Mohan.   10
    //Lisa.        6
    //Satya.    12
    //Anda.       3
    //Mohan.    1
    //Andy         3
    //Addy         2
    //Mohan.     6
    //Output:
    //Name.     Total tests

    // print second least

    public static Map<String, Integer>  test(List<String> names, List<Integer> nums) {

        // #1
        Map<String, Integer> info = new HashMap<>();
        // #2
        Map<String, Integer> secondLeast = new HashMap<>();

        for (int i = 0; i < names.size(); i++) {
            if (!info.containsKey(names.get(i))){
                info.put(names.get(i), nums.get(i));
            } else {
                Integer n = info.get(names.get(i)) + nums.get(i);
                info.put(names.get(i), n);
            }
        }


        List<Integer> n = new ArrayList<>();
        for (Map.Entry<String, Integer> eachNumber : info.entrySet()){
            n.add(eachNumber.getValue());
        }
        Collections.sort(n);
        Integer second = 0;
        for (int i = 0; i < n.size(); i++) {
            if (n.get(i) < n.get(i+1) ){
                second = n.get(i+1);
                break;
            }
        }


        for (Map.Entry<String, Integer> each: info.entrySet()){

            if (each.getValue() == second){
                secondLeast.put(each.getKey(), each.getValue());
            }
        }

        return secondLeast;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Addy", "Preetam", "Lisa", "Mohan", "Lisa", "Satya", "Anda", "Mohan", "Andy", "Addy","Mohan");
        List<Integer> nums = Arrays.asList(7, 3, 5, 10, 6, 12, 3, 1, 3, 2, 6);
        System.out.println(test(names, nums));

        System.out.println();

        Map<String, Integer> info = new HashMap<>();

        for (int i = 0; i < names.size(); i++) {
            if (!info.containsKey(names.get(i))){
                info.put(names.get(i), nums.get(i));
            } else {
                Integer n = info.get(names.get(i)) + nums.get(i);
                info.put(names.get(i), n);
            }
        }

        System.out.println(info);








/*
        Function<Map<String, Integer>, Map<String, Integer>> secondLeast = (nums) -> {

            for (int i = 0; i < names.size(); i++) {
                if (!nums.containsKey(names.get(i))){
                    nums.put(names.get(i), num.get(i));
                } else {
                    Integer add = nums.get(names.get(i)) + num.get(i);
                    nums.put(names.get(i), add);
                }
            }
            return nums;
        };
*/

    }






}
