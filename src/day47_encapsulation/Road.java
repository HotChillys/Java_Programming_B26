package day47_encapsulation;

public class Road {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("red");

//        System.out.println(light.colour);
//
//        light.colour = "pink";

        TrafficLight light2 = new TrafficLight("red");
        System.out.println(light2.getColour());
        light2.setColour("grey");
        System.out.println(light2.getColour());

        TrafficLight light3 = new TrafficLight("black");
        System.out.println(light3.getColour());






    }
}
