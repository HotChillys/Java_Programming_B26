package day42_custom_classes;

import day10_scanner.RateCalculator;

public class UsingRectangle {
    public static void main(String[] args) {

        Rectangle first = new Rectangle();
        first.width = 3;
        first.height = 4;
        System.out.println(first);

        System.out.print("Perimeter is: ");
        first.setPerimeter();
        System.out.print("Area is: ");
        first.setArea();





    }
}
