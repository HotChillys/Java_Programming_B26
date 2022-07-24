package day30_array;

public class ReverseSentence {
    public static void main(String[] args) {
        /*
            given a sentence
                today is monday
            reverse the sentence
         */

        String sentence = "today is monday";
        String [] words = sentence.split(" ");
        String reverse = "";


        for (int n = words.length - 1; n >= 0; n--) {
            reverse += words[n] + " ";
        }
        System.out.println(reverse.trim());









    }
}
