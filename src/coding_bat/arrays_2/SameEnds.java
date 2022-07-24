package coding_bat.arrays_2;

import java.util.ArrayList;

public class SameEnds {
    /*
    Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.

    sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
    sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
    sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
     */
    public static void main(String[] args) {

        int [] nums = {1, 2, 5, 2, 1};
        int len = 1;
        System.out.println(sameEnds(nums, len));

    }

    public static boolean sameEnds(int [] nums, int len) {

        if(nums.length < 2 || nums.length == len) {
            return true;
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            list1.add(nums[i]);
        }

        for (int i = nums.length - len; i <nums.length; i++) {
            list2.add(nums[i]);
        }

        if (list1.equals(list2)) {
            return true;
        }
        return false;
    }

}
