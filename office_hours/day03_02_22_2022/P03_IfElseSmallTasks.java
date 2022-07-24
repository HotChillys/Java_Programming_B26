package day03_02_22_2022;

public class P03_IfElseSmallTasks {
    public static void main(String[] args) {

     /*
        2- Take values of length and width of a rectangle from user and check if it is square or not.
        ( Scanner Class can be used )
        */


        int x = 5;
        int y = 4;

        if (x == y) {
            System.out.println("Square");
        }else {
            System.out.println("Rectangle");
        }


        String result = x == y ? "Square" : "Rectangle";
        System.out.println(result);



    }

    }


