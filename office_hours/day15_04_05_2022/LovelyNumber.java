package day15_04_05_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LovelyNumber {
         /*
        We consider a number to be lovely if it contains fewer than
               three instances of any distinct digit (in decimal representation).

                    Examples of lovely numbers: 0, 100, 1232 and 9922;
                    Examples of numbers that are not lovely:
                               1000 (contains three copies of digit '0'),
                               33533 (contains four copies of digit '3').
                       Examples:
                       lovelyNumber(0)    ---returns 1
                       lovelyNumber(100)  ---returns 1
                       lovelyNumber(111)  ---returns 0
                       lovelyNumber(1232) ---returns 1
                       lovelyNumber(9922) ---returns 1
                       lovelyNumber(99922)---returns 0

                       In your solution, focus on correctness. The performance of your
                       solution will not be the focus of the assessment.
         */

    public static void main(String[] args) {

        int n = 992;
        System.out.println(lovelyNumber(n));

    }

    public static int lovelyNumber(int n) {

        String str = Integer.toString(n);

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        for (int i = 0; i < list.size(); i++) {
            if (Collections.frequency(list, list.get(i)) > 2) {
                return 0;
            }
        }
        return 1;
    }
}
