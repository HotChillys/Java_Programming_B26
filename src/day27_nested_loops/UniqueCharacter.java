package day27_nested_loops;

public class UniqueCharacter {
    public static void main(String[] args) {

        String str = "AAABCCDEEF";


        for (int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char inner = str.charAt(j);

                if (letter == inner) {
                    count++;
                }
            }//inner end

            if (count == 1) {  //the counter will be one when tha character was unique. the character will always match with itself one time. so it will never be 0. but is the counter value is more than 1, then that character matched with multiple other character, which means it is not unique.
                System.out.print(letter);
            }

        }
    }
}
