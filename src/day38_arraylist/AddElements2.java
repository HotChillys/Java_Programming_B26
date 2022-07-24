package day38_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AddElements2 {
    /*
  Practice flow:

Create an ArrayList of Strings
add these elements:
	Iron Man, Spider Man, Thor, Captain America, Hawkeye

	remove Thor by index

	remove Iron Man by element

	remove the first index

Print the ArrayList after each action to see how the change is made

     */
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
        list.add("Iron Man");
        list.add("Spider Man");
        list.add("Thor");
        list.add("Captain America");
        list.add("Hawkeye");
        System.out.println(list);

        list.remove(2);
        list.remove("Iron Man");
        list.remove(0);
        System.out.println(list);


    }
}
