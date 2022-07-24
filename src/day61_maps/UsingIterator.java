package day61_maps;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("james");
        names.add("emre");
        names.add("bruce");
        System.out.println(names);

        Iterator<String> it = names.iterator(); // pin is created before the first element

        System.out.println(it.next()); // remove the pin, and return the element
        System.out.println(it.next()); //  remove the pin, and return the element
        System.out.println(it.next()); //  remove the pin, and return the element
      //  System.out.println(it.next()); //  remove the pin, and return the element
        // there is no 4th element, so exception happens

        System.out.println(names);









    }
}
