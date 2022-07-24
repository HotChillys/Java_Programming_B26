package day38_arraylist;

import java.util.ArrayList;

public class AddElements {
    /*
    Practice flow:

Create an ArrayList of Strings
add these elements:
	add Hat
	add Shoes
	add Jacket in middle of Hat and Shoes
	add Towel in the beginning
	add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made
     */
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
        list.add("Hat");
        list.add("Shoes");
        list.add(1, "Jacket");
        list.add(0, "Towel");
        list.add(1, "Car");
        System.out.println(list);




    }
}
