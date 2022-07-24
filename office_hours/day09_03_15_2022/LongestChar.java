package day09_03_15_2022;

public class LongestChar {
    public static void main(String[] args) {
        /*
        Write a program that accepts String array.Count how many names have the same first and last letter

          				Input : "Anna", "Mike", "Aliya", "Donald", "Saim", "Remus", "Mehmet","Asya"

          				Output :    4

          			Small Task --> 	Find  the longest word at the same time  --> Donald
         */
        String [] names = { "Anna", "Mike", "Aliya", "Donald", "Saim", "Remus", "Mehmet","Asya"};

        int count = 0;
        String longest = "";
        for (int i = 0; i < names.length; i++) {

            if (names[i].length() > longest.length()) {
                longest = names[i];
            }

            names[i] = names[i].toLowerCase();
            if (names[i].charAt(0) == names[i].charAt(names[i].length() - 1)) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println(longest);














    }
}
