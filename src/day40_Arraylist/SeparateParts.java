package day40_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {
        /*
        Write a program that can extract the special characters, digits and letters
        from a string and stores them into separate ArrayLists of Characters
        Ex:
        str = "ABCD123$%#@&456EFG!"
        list1: {$, %, #, @, &, !}
        list2: {A, B, C, D, E, F, G}
        list3: {1, 2, 3, 4, 5, 6}
         */
        String s = "ABCD123$%#@&456EFG!";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println(list);

        ArrayList<String> numbers = new ArrayList<>(list);
        numbers.retainAll(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
        System.out.println(numbers);

        ArrayList<String> specialChars = new ArrayList<>(list);
        specialChars.retainAll(Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "~"));
        System.out.println(specialChars);

        ArrayList<String> letters = new ArrayList<>(list);
        letters.removeAll(numbers);
        letters.removeAll(specialChars);
        System.out.println(letters);


    }
}
