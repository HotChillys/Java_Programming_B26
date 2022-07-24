package day33_methods;

public class PrintCharacter {
    /*
    create a method that accepts a String and print each character of the
    String on a separate line
     */
    public static void printCharacter(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }

    public static void main(String[] args) {
        String word = "java";
        printCharacter(word);
    }
}
