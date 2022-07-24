package day61_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLooping {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,3,5,6,12,35,6,2,5,6,2,1,4,5));

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) < 5) {
//                list.remove(i);
//            }
//        }

//        for (int each : list) {
//            if (each < 5) {
//                list.remove(each);
//            }
//        }

        // removing in for loop or for each loop is invalid, because we cannot change the size of the arraylist/collection when looping in loops


        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) { // hasNext method checks if there is an element next to pin
            if (it.next() <= 5) { //move to the next element and return it
                it.remove();     // removes the element from the list
            }
        }


        System.out.println(list);





    }
}
