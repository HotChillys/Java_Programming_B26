package day32_array;

import java.util.Arrays;

public class Group {
    public static void main(String[] args) {

        String [][] cydeo = new String[4][];
//        String [][] cydeo = new String[4][3];
        // result og above is below --> 4 inner arrays that each have a size of 3
        // [[null, null, null], [null, null, null], [null, null, null], [null, null, null]]
        System.out.println(Arrays.deepToString(cydeo));

        String [] groupOne = {"Emre", "Yasir", "Eda"};
        cydeo[0] = groupOne;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Adding group 2");

        String [] groupTwo = {"Basri", "Demet", "Shina", "Ismayil"};
        cydeo[1] = groupTwo;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Adding group three");

        cydeo[2] = new String [] {"Mustafa", "Lima"}; // syntax to creat an array without a reference
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Same group 3 as group 4");
        cydeo[3] = cydeo[2];
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println();

        for (String [] innerArray : cydeo) { // loops through the 2D array, cydeo

            for (String eachWord : innerArray){ // loops through String element in each 1S inner array
                System.out.println(eachWord);
            }

        }





    }
}
