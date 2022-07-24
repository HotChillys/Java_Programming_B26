package day08_03_08_2022;

public class Anagram_OfficeHour {
    public static void main(String[] args) {

/*
            Given two Strings determine if they are anagram or not. Strings are anagram if
                        they are built up of the same characters
                 Ex:
                    listen vs silent
                    funeral vs  real fun
                    a gentleman vs elegant man

                 -> anagram
                 Hint: look up and use replaceFirst() method

 */


String a = "a gentleman";
String b = "elegant man";

a = a.replace(" ", "").toLowerCase(); // agentleman
b = b.replace(" ", "").toLowerCase(); // elegantman

        if (a.length() == b.length()) { // this is preconditioning to check if words are anagram

            for (int i = 0; i < a.length(); i++) {

                char each = a.charAt(i);

                b = b.replaceFirst("" + each, "");

            }

            if (b.isEmpty()) {
                System.out.println("Is anagram");
            } else {
                System.out.println("Not anagram");
            }


        } else {
            System.out.println("Not anagram");
        }
    }
}
