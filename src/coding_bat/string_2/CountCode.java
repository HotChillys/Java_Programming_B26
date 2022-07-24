package coding_bat.string_2;

public class CountCode {
    /*
    Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
     */

    public static int countCode(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {

            if(i+3 < str.length() && str.substring(i, i+4).startsWith("co") && str.substring(i, i+4).endsWith("e")  )
                count++;
        }
        return count;

    }

}
