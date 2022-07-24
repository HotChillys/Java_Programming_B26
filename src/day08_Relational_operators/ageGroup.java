package day08_Relational_operators;

public class ageGroup {
    public static void main(String[] args) {

        /*
          declare and assign an age variable

        is the person a kid ( up to 13, include 13)

        is the person a senior citizen ( 65 and above)
         */

       int age = 3;

       boolean isKid = age <= 13;
        boolean     isSenior = age >= 65;

        System.out.println("you are a kid: " + isKid);
        System.out.println("you are a senior citizen: " + isSenior);




    }
}
