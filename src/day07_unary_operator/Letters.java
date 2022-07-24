package day07_unary_operator;

public class Letters {
    public static void main(String[] args) {

        // Task: define a character, print next characters on new lines

            char letter = 'G';
        System.out.println("original " + letter++);
        System.out.println("next four: ");
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);

    }
}
