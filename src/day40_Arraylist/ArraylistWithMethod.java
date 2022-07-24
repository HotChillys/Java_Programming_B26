package day40_Arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistWithMethod {
    public static void main(String[] args) {
        System.out.println(getDaysOfWeek()); // this line is not reusable, can't access to it

        ArrayList<String> days = getDaysOfWeek();// this line is reusable
        System.out.println(days.get(0));

        System.out.println(getDaysOfWeek().get(0)); // this line is not reusable, can't access to it

        System.out.println(printList(getDaysOfWeek()));

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "there"));
        System.out.println(printList(list));

    }

    public static String printList(ArrayList<String> list){

        String str = "LIST: ";
       for (String each : list) {
           str += "\n~\t" + each;
       }
        return str;
    }


    public static ArrayList<String> getDaysOfWeek(){
        ArrayList<String> days = new ArrayList<>(Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        ));
        return days;

        /*

        String = "abc";
        a.toUpperCase().replace("a", "d").trim();
        a.toUpperCase()
        .replace("a", "d")
        .trim();

         */




    }


}
