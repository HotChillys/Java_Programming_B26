package Foo_IQ.mentor_java_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Move0ToEnd {
    /*
    2) Array - Move Zeros to the End
        Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
        Ex:
        input:  {1,0,2,0,3,0,4,0};
        output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 0, 6, 0, 8, 6, 0, 8));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                list.remove(list.get(i));
                list.add(0);
            }
        }

        System.out.println(list);


    }


}
