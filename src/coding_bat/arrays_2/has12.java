package coding_bat.arrays_2;

public class has12 {
    public static void main(String[] args) {
        /*
        Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
         */
int [] nums = {3, 1, 2};
        System.out.println(has12(nums));

    }

    public static boolean has12(int [] nums){

        int index = 0;
        int length = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                index = i;
                length = nums.length - index;

            }


            for (int j = index ; j < nums.length; j++) {
                if (nums[j] == 2) {
                    return true;
                }
            }


        }
        return false;
    }

}
