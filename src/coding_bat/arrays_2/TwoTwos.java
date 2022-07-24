package coding_bat.arrays_2;

public class TwoTwos {
    /*
    Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false

     */

    public static void main(String[] args) {
        int [] nums = {2};
        System.out.println(twoTwos(nums));
    }

    public static boolean twoTwos(int [] nums) {

        boolean check = false;
        int count = 0;

        for (int each : nums) {
            if (each == 2) {
                count++;
            }
        }

        if (count == 0) {
            check = true;
        } else if (nums.length == 0) {
            check = true;
        } else if (nums.length == 1 && nums[0] == 2) {
            check = false;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i+1 < nums.length && nums[i] == 2 && nums[i+1] == 2) {
                check = true;
                i+=2;
            } else if (i+1 < nums.length && nums[i] == 2 && nums[i+1] != 2) {
                check = false;
            } else if(i-1 > 0 && nums[i] == 2 && nums[i-1] != 2 && i+1 >= nums.length) {
                check = false;
            }
        }
        return check;

    }








}
