package day63_functional_interface.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
        /*
        Create a function that can verify if a number contains duplicate digits
         */
        Predicate<Integer> dupDigit = nums -> {
            String s = String.valueOf(nums);
            List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
            for (int i = 0; i < list.size(); i++) {
                int count = 0;
                if (Collections.frequency(list, list.get(i)) > 1) {
                    return true;
                }
            }
            return false;
        };
        System.out.println(dupDigit.test(5678));

        /*
        2 Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:
		        Password must be at least have 8 characters long, and should not contain space
		        Password should at least contain one upper case letter
		        Password should at least contain one lower case letter
		        Password should at least contain one special characters
		        Password should at least contain a digit
         */
        Predicate<String> strongPassword = str -> {
            if (str.length() < 8 || str.contains(" ")) {
                return false;
            }
            int upper = 0;
            int lower = 0;
            int special = 0;
            int digit = 0;

            for (int i = 0; i < str.length(); i++) {

                if (Character.isUpperCase(str.charAt(i))) {
                    upper++;
                } else if (Character.isLowerCase(str.charAt(i))) {
                    lower++;
                } else if (Character.isDigit(str.charAt(i))) {
                    digit++;
                } else if (str.contains("!") || str.contains("~") || str.contains("@") || str.contains("#") || str.contains("$") || str.contains("%") || str.contains("^") || str.contains("&") || str.contains("*") || str.contains("(") || str.contains(")") || str.contains("?")) {
                    special++;
                }
            }
            if (upper >= 1 && lower >= 1 && special >= 1 && digit >= 1) {
                return true;
            }
            return false;
        };
        System.out.println(strongPassword.test("19860222gW@"));


    }
}
