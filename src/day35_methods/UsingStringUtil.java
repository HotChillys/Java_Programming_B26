package day35_methods;

import my_utilities.StringUtil;

public class UsingStringUtil {
    public static void main(String[] args) {


        System.out.println(StringUtil.reverse("apple"));
        System.out.println(StringUtil.fixFormat("jAmEs0"));

        System.out.println(StringUtil.frequencyOfCharacter("apple", 'p'));
        System.out.println(StringUtil.frequencyOfCharacter("apple", 'z'));

        System.out.println(StringUtil.uniqueCharacter("aaaaabcccdeeff"));

        System.out.println(StringUtil.uniqueCharacter("java"));

        System.out.println(StringUtil.uniqueCharacter("eeiioo"));


    }
}
