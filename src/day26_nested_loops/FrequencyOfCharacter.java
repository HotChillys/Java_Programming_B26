package day26_nested_loops;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        /*
        check how many times letter appeared in a word
        input: apple
        output:
        a - 1
        p - 2
        p - 2
        l - 1
        e - 1
         */
        String s = "apple";
        String checked = "";

        for (int i = 0; i < s.length(); i++) {

            int count = 0; // everytime outer loop iterates, the counter is set back to 0. It is reset between every character.
            char letter = s.charAt(i);

            if (checked.contains(letter + "")) {
                continue;
            }

            for (int j = 0; j < s.length(); j++) {

                char eachLetter = s.charAt(j);

                if (letter == eachLetter) { // or  s.charAt(i) == s.charAt(j)
                    count++;
                }

            } // end of inner loop
            System.out.println(letter + " - " +count);
            checked += letter;


        }










    }
}
