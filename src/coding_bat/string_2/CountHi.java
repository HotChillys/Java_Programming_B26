package coding_bat.string_2;

public class CountHi {
    /*
    Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
     */

    public static int countHi(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i+1 < str.length() && str.charAt(i) == 'h' && str.charAt(i+1) == 'i') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abc hi ho";
        System.out.println(countHi(str));
    }

}
