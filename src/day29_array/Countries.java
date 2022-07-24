package day29_array;

import java.util.Scanner;

public class Countries {
    public static void main(String[] args) {
        /*
        Given a String array of countries:
        String[] countries = {
        "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
        "Albania", "Portugal", "Philippines", "Armenia", "Colombia",
        "Honduras", "Indonesia", "United States"
        };
        - Find and print all the first and last characters of each country
        - Find and print all the countries that end with the letter ‘a’
        - Create “contains logic” to check if there is a certain country in the array. Can check for
        the United States, or use Scanner to check any country
         */
        Scanner input = new Scanner(System.in);

        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines", "Armenia", "Colombia", "Honduras", "Indonesia", "United States" };

        String first = "";
        String last = "";

        for (int i = 0; i < countries.length; i++) {
            first = countries[i].substring(0,1);
            last = countries[i].substring(countries[i].length()-1).toUpperCase();
            System.out.print(first + last + ", ");
        }

        String a  = "";
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].charAt(countries[i].length() - 1) == 'a') {
                a += countries[i] + ", ";
            }
        }
        System.out.println();
        System.out.print(a);
        System.out.println();

        for (int i = 0; i < countries.length; i++) {
            System.out.println("Enter your country");
            String country = input.nextLine();
            if (countries[i].contains(country)) {
                System.out.println(countries[i]);
            } else {
                System.out.println("This country doesn't exist");
            }
        }



    }
}
