package day36_methods;

import my_utilities.ArrayUtil;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = addElement(a,4);
        System.out.println(Arrays.toString(b));
    }
    public static int [] addElement(int [] original, int elementToAdd) {
        int [] newArray =  new int[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            newArray[i] = original[i];
        }
        // instead of doing a loop ourselves, we could have used Array.copyOf()
        newArray[newArray.length - 1] = elementToAdd; //adding new element to the end of the new array
        return newArray;
    }
    public static String [] addElement(String [] original, String element) {

        return null;
    }
    public static int [] addElement(int [] original, int [] elementsToAdd) {
        int [] newArray = new int[original.length + elementsToAdd.length];

        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i < original.length) {
                newArray[i] = original[i]; // adding the elements from the original array in the
            } else {
                newArray[i] = elementsToAdd[j++]; // adding the new elements to the new array
            }
        }
        return newArray;
    }
}
