package day15_switch_statement;

public class NumberWords {
    public static void main(String[] args) {

        /*
        take a number and print the number as a word version
        1 -> ont
        2 - > two
         */

        int n = 7;

        // as if statement

        if (n == 1) {
            System.out.println("one");
        } else if (n == 2) {
            System.out.println("two");
        } else if (n == 3) {
            System.out.println("three");
        } else if (n == 4) {
            System.out.println("four");
        } else if (n == 5) {
            System.out.println("five");
        } else {
            System.out.println("Invalid number");
        }


        //as switch statement

        switch (n) {
            case 1: // in if statement: if(n == 1){
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("invalid number from switch");
                break;

        }



    }
}
