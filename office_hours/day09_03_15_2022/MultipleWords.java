package day09_03_15_2022;

public class MultipleWords {
    public static void main(String[] args) {
        /*
                Given a String of words that are separate by commas. Find and print any words that have more than one word

        Example

            Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

            Output:
            wooden spoons
            trash can
            dish washer
         */
        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String [] each = words.split(",");

        for (String a : each) {
            a = a.trim();
            if (a.contains(" ")) {
                System.out.println(a);
            }
        }







    }
}
