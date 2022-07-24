package day05_variables;

public class MyName {

    public static void main(String[] args) {
        // create a class MyName
        //    create a main method
        //    create multiple char variables, one for each letter of your name
        //    print your name
        //        print each letter in a different line
        //        print your name in the same line

        char one = 'G';
        char two = 'u';
        char three = 'l';
        char four = 'i';
        char five = 'e';

        System.out.println("" +one+ "\n"+ two+ "\n" + three+ "\n" + four+ "\n"+ five); //different line
        System.out.println("My name is " + one + two + three + four + five);
        //same line

       //or you can make a variable of the name

        String name = "" + one + two + three + four + five;
        //String name = Gulie
        System.out.println("My name is " + name);




    }
}
