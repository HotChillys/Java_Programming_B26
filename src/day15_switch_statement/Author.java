package day15_switch_statement;

import java.util.Scanner;

public class Author {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please select from one of the following genre\n1)\tFantasy\n2)\tDetective\n3)\tScience Fiction\n4)\tShort Story");
        int genre = input.nextInt();
        int pageLength = 0; int profit = 0; int sequels = 0; int countries = 0;
        String message = "";

        switch (genre) {

            case 1:
                pageLength = 500; profit = 1_000_000; sequels = 5; countries = 50;
                break;
            case 2:
                pageLength = 350; profit = 700_000; sequels = 3; countries = 45;
                break;
            case 3:
                pageLength = 720; profit = 900_500; sequels = 4; countries = 30;
                break;
            case 4:
                pageLength = 150; profit = 300_000; sequels = 1; countries = 40;
                break;
            default:
                message = "Invalid Entry";

        }
        message = "Genre of Fantasy, page length of " +pageLength+ ", have profit over $" +profit+ ", total sequels of " +sequels+ " and published in " +countries+ " countries.";

        System.out.println(message);

    }
}
