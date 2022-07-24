package coding_bat.string_2;

public class CatAndDog {
    /*
    Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
     */

    public static boolean catAndDog(String str){
        int cat = 0;
        int dog = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i+3 < str.length() && str.substring(i, i+3).equals("cat")) {
                cat++;
            } else if (i+3 < str.length() && str.substring(i, i+3).equals("dog")) {
                dog++;
            }
        }
        return cat == dog;
    }



    public static void main(String[] args) {
        String s = "catdog";
        System.out.println(catAndDog(s));
    }



}
// TODO: 2022-04-26