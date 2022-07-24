package day12_03_22_2022;

public class RemoveSpaces {
    /*
        Write a method that can remove  all extra space from String

    			 Input: "  Hello world      I      love      Java    "
        	     Output: Hello world I love Java
     */
    public static void removeSpaces(String sentence) {
        String [] words = sentence.split(" ");

        String withoutSpace = "";

        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                withoutSpace += words[i] + " ";
            }
        }

        System.out.println(withoutSpace.trim());
    }

    public static void main(String[] args) {
        String sentence =  "  Hello world      I      love      Java    ";
        removeSpaces(sentence);
    }
}
