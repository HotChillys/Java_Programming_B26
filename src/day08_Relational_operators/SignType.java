package day08_Relational_operators;

public class SignType {
    public static void main(String[] args) {

        /*
         Task:
            Declare and assign a number

            I want to know the sign of the number
                if the number positive
                is the number negative
                is the number 0
         */


        int num = 15;
        boolean positive = num > 0;
        boolean negative = num < 0;
        boolean isZero = num == 0;

        System.out.println("is this number positive: " + positive);
        System.out.println("is this number negative: " + negative);
        System.out.println("is this number zero: " + isZero);


    }
}
