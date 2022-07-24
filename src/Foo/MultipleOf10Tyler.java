package Foo;

import java.util.Arrays;

public class MultipleOf10Tyler {
    public static void main(String[] args) {

        //Create the number_array as a bunch of ints
        int[] number_array = {5, 4, 40, 1, 60, 2, 30, 34, 70, 43, 2, 80, 67};

        //Go through the entire array length
        for(int i = 0; i < number_array.length; i++)
        {

            //Check that we are within the array bounds (Not on the first number) to prevent errors and that the current number (i) in number_array is divisible by 10
            if(i - 1 >= 0 && i - 1 < number_array.length && number_array[i] % 10 == 0)
            {

                //If the number is divisible by 10, do nothing. We do not want to change the number if it's already divisible by 10.
                System.out.println(number_array[i] + " is already divisible by 10 and will not change.");
            }

            //Check that we are within the array bounds (Not on the first number) to prevent errors and that the last number (i - 1) in the number_array is divisible by 10
            else if(i - 1 >= 0 && i - 1 < number_array.length && number_array[i - 1] % 10 == 0)
            {
                //If the last number is divisible by 10, then we will change the current number (i) to the last number (i - 1) because the current number isn't divisible by 10
                System.out.println(number_array[i] + " is not divisible by 10 and will change to : " + number_array[i - 1]);
                number_array[i] = number_array[i - 1];
            }
        }
        System.out.println(Arrays.toString(number_array));











    }
}