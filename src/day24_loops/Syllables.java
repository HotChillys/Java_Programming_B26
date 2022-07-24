package day24_loops;

public class Syllables {
    public static void main(String[] args) {
        /*
        Given a String separated by dashes calculate how many syllables the
        words are
        Ex:
        Input:
        ja-va
        Output:
        2
         */

        String word = "ja-va";
        int count = 1;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == '-') {
                count++;
            }

        }

        System.out.println("Syllables : " + count);









    }
}
