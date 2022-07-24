package day48_encapsulation.static_imports;

import my_utilities.StringUtil;

import java.util.Arrays;

public class Normal {
    public static void main(String[] args) {

        int [] a = {4, 12, 5, 25};
        Arrays.sort(a); // this variable is static
        System.out.println(Arrays.toString(a));

        System.out.println(Math.PI); // this variable is static // this method is on lang package, so it doesn't import

        System.out.println(StringUtil.reverse("java"));





    }
}
