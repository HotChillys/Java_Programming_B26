package coding_bat.string_2;

import java.util.ArrayList;
import java.util.Collections;

public class HaveThree {
    /*
    Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

    haveThree([3, 1, 3, 1, 3]) → true
    haveThree([3, 1, 3, 3]) → false
    haveThree([3, 4, 3, 3, 4]) → false
     */
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 3};

        System.out.println(haveThree(arr));

    }

    public static boolean haveThree(int[] nums) {

        boolean check = true;
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : nums) {
            list.add(each);
        }

        int n = Collections.frequency(list, 3);

        if (n != 3) {
            return false;
        }

        for (int i = 0; i < list.size(); i++) {
            if (i+1 < list.size() && list.get(i) == 3 && list.get(i + 1) == 3 && n == 3) {
                return false;
            }
        }
        return true;
    }

}
