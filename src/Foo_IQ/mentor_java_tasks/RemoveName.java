package Foo_IQ.mentor_java_tasks;

import java.util.*;

public class RemoveName {
    /*
    1. ArrayList--Remove "Ahmed"
    Given a list of people' names: "Ahmed", "John", "Eric", "Ahmed"...
    Write a java operation to remove all the names named Ahmed
     */

    public static ArrayList<String> removeAhmed(ArrayList<String> list){
        //List<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        list.removeIf(name -> name.equals("Ahmed"));

        return list;

    }




    /*
    ArrayList -- Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */
    public static ArrayList<Integer> removeNumbers(ArrayList<Integer> list) {

        list.removeIf(number -> number > 100);

        return list;
    }




    /*
    ArrayList -- sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method
     */
    public static ArrayList<Integer> sort(ArrayList<Integer> list) {

        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(i) < list.get(j)) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
return list;
    }




/*
ArrayList -- sorting in descending order
Write a method that can sort the ArrayList in descending order without using the sort method
 */
    public static List<Integer> sortDescend(List<Integer> list) {

        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(i) > list.get(j)) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        return list;
    }





    public static void main(String[] args) {
        System.out.println("********Remove Name********");
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(list);
        System.out.println("removeAhmed(list) = " + removeAhmed(list));
        System.out.println();

        System.out.println("********Remove Number********");
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2, 45, 765, 98,495));
        System.out.println(removeNumbers(list1));
        System.out.println();

        System.out.println("********Sort Ascend********");
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 45, 765, 98,495));
        System.out.println(list2);
        System.out.println(sort(list2));
        System.out.println();

        System.out.println("********Sort Descend********");
        List<Integer> list3 = new ArrayList<>(Arrays.asList(2, 45, 765, 98,495));
        System.out.println(sortDescend(list3));
    }





}
