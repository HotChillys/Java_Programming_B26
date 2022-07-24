package day18_string;

public class StartAnsEnd {
    public static void main(String[] args) {

        String str = "Apples";
        System.out.println(str.startsWith("App")); //true
        System.out.println(str.startsWith("app")); // false

        System.out.println(str.startsWith("Apples")); // true

        String s = "App";
        System.out.println(str.startsWith(s)); // does the String str starts with the String s?

        System.out.println(str.startsWith(" App")); //space is a character, so false
        System.out.println(str.startsWith(   "App")); // spaces are in the code, doesn't affect the String

        System.out.println(str.startsWith("Aoo")); // checks the whole String if it's true or not, not only the first character

        String sentence = "today was a good day";
        System.out.println(sentence.startsWith("today was a")); //ture

        System.out.println(sentence.endsWith("day")); // true
        System.out.println(sentence.endsWith(" day")); // true
        System.out.println(sentence.endsWith("good")); // false
        System.out.println(sentence.endsWith("today was a good day")); // true







    }
}
