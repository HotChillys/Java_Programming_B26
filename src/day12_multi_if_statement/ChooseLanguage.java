package day12_multi_if_statement;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {

        /*
        ask the user to enter a number based on the language they wanted to use.
        1 - English
        2 - Spanish
        3 - Turkish
        4 - Russian
        5 - French
        based on the number they picked print a message:
        1 : "hello, thank for your call"
        2 : "hola, gracias para llamar"
        3 : "merhaba, aradiginiz icin tesekkurler"
        4 : "privet, spasibo za vash zvonok"
        5 : "Merci ,pour votre appel"
        any other number: "We will use English by default"
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Choose your preferred language" +
                "\nEnter 1 for English" +
                "\nEnter 2 for Spanish" +
                "\nEnter 3 for Turkish" +
                "\nEnter 4 for Russian" +
                "\nEnter 5 for French");
        int  language = input.nextInt();

        if (language == 1) {
            System.out.println("hello, thank for your call");
        } else if (language == 2) {
            System.out.println("hola, gracias para llamar");
        } else if (language == 3) {
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        } else if (language == 4) {
            System.out.println("privet, spasibo za vash zvonok");
        } else if (language == 5) {
            System.out.println("Merci ,pour votre appel");
        } else {
            System.out.println("We will use English by default");}


    }
}
