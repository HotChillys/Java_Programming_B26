package day33_methods;

public class ArrayAndNumber {
    /*
    Create a method that accepts an int array and a number. Check if the array
    contains that number or not
    Ex:
    input: ( {1, 2, 3, 4}, 4 ) -> true
    input: ( {1, 2, 3, 4}, 7 ) -> false
     */
    public static void arrayAndNumber(int[] nums, int number) {
        boolean contains = true;
        for (int i = 0; i < nums.length; i++) {
            if (number == nums[i]) {
                contains = true;
                break;
            } else if (number != nums[i]) {
                contains = false;
            }
        }
        System.out.println(contains);

    }


    public static void main(String[] args) {
        int[] numbers = {50, 0, 10, 500, 20, 40, 124};
        int num = 10;
        arrayAndNumber(numbers, num);
    }
}

