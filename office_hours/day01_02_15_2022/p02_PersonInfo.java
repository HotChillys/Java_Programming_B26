package day01_02_15_2022;

public class p02_PersonInfo {
    public static void main(String[] args) {

        /*
         Task02:   Variables(Primitives - Non Primitives ),Concatenation and Escape Sequences

                      Create class named "PersonInfo" and make a main method

                            Create variables and give value related to you:

                                - String name
                                - byte age
                                - char gender
                                - boolean student
                                - short number of siblings
                                - long favorite number
                                - int number of seasons in your area
                                - double birth date: (month.day)
                                - int year
                                - String full birthday date with year
                                - String favorite quote
                                - Print the person information with using concat/escape characters

         */
String name = "Gulie";
byte age = 32;
char gender = 'F';
boolean student = true;
short numberOfSibling = 1;
long favNumber = 123456789L;
int numberOfSeason = 4;
double birthdate = 6.30;
int birthYear = 1989;
String fullBirthDay = "0" +birthdate + "0." + birthYear;
String favQuote = "What comes around goes around!";
        System.out.println("Enter your personal information please\nYour name: " +name+ "\nYour age: " +age+ "\nYour gender: " +gender+ "\nAre you student? " +student+ "\nHow many siblings do you have? " +numberOfSibling+ "\nWhat is your favorite number? " +favNumber+ "\nHow many season are in your country? " +numberOfSeason+ "\nWhen is your birthday? " +fullBirthDay+ "\nWhat is your favorite quote? " +favQuote);














    }
}
