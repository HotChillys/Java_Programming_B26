package day40_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;

public class UsingCollectionsClass {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3, 6, 2, 67, 22, 230, 12));
        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        ArrayList<Character> letter = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D'));
    Collections.reverse(letter);
        System.out.println(letter);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        System.out.println(Collections.max(letter));
        System.out.println(Collections.min(letter));

        Collections.swap(letter, 0, 3);
        System.out.println(letter);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11, 11, 20, 11, 20, 30));
        System.out.println(Collections.frequency(numbers, 11));

        ArrayList<String> words = new ArrayList<>(Arrays.asList("one", "two", "one", "one", "one", "three"));
        System.out.println(Collections.frequency(words, "one"));






    }
}
