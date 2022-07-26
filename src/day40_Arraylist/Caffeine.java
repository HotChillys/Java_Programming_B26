package day40_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("energy drink");
        drinks.add("soda");
        System.out.println(drinks);

        ArrayList<String> drinks2 = new ArrayList<>(drinks);
        System.out.println(drinks2);

        String [] allDrinks = {"coffee", "tea", "energy drink", "soda"};
        //ArrayList<String> drinks3 = new ArrayList<>(allDrinks); not valid because the array is not valid argument
        ArrayList<String> drinks3 = new ArrayList<>(Arrays.asList(allDrinks));
        System.out.println(drinks3);

        ArrayList<String> drink4 = new ArrayList<>(Arrays.asList("coffee", "tea", "energy drink", "soda"));
        System.out.println(drink4);

        ArrayList<String> drink5 = new ArrayList<>();
        drink5.addAll(Arrays.asList("coffee", "tea", "energy drink", "soda"));









    }
}
