package day52_inheritance.final_example;

import day52_inheritance.final_example.FinalExample;

public class UseFinalExample {
    public static void main(String[] args) {

        System.out.println(FinalExample.PLANET);
        //FinalExample.PLANET = "Mars"; // we can't change the Final variable

        FinalExample obj = new FinalExample(20);
        System.out.println(obj.a);
        System.out.println(obj.b);

//        obj.a = 4;
//        obj.b = 40;
        // these doesn't change because of Final keyword

        System.out.println();
        FinalExample obj2 = new FinalExample(100);
        System.out.println(obj2.a);
        System.out.println(obj2.b);







    }
}
