package day05_variables;

public class CharExamples {

    public static void main(String[] args) {

        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        char letterThree = 65;
        System.out.println(letterThree);// char letterThree = 'A';

        System.out.println(letterOne + letterTwo + letterThree + numberOne + specialOne); //it's doing math, adding them together (97+90+65+57+36)

        System.out.println(letterOne + " "+letterTwo +" "+ " "+letterThree+" " +numberOne + " "+specialOne); //spaces between each other

        System.out.println("chars: " +letterOne + letterTwo + letterThree + numberOne + specialOne);// string in the beginning

        System.out.println("" +letterOne + letterTwo + letterThree + numberOne + specialOne);// string in the beginning



    }
}
