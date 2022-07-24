package day12_multi_if_statement;

public class CheckCharacter {
    public static void main(String[] args) {

        /*
        create a char variable with a letter (can only do this one hardcoded, no
        Scanner method for char)
        find out if the letter is an uppercase letter or lowercase letter. Print
        the type of letter it is
        ex:
        'b'
        lowercase
        ex:
        'U'
        uppercase
         */

        char letter = 'D';

//        if(letter >= 97 && letter <= 122) {
//            System.out.println("lowercase letter");}

        if (letter >= 'a' && letter <= 'z') {
            System.out.println("lowercase letter");
        }

        if (letter >= 'A' && letter < 'Z'){
            System.out.println("uppercase letter");}


    }
}
