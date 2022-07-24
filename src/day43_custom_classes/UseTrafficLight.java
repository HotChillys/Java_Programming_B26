package day43_custom_classes;

import day03_comments_escape_sequence.TabAndNextLine;

public class UseTrafficLight {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Green");
        System.out.println(light.colour);

        TrafficLight light2 = new TrafficLight("Red");
        System.out.println(light.colour);
    }
}
