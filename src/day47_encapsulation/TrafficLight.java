package day47_encapsulation;

public class TrafficLight {

  private   String colour;

    public TrafficLight(String colour){
        setColour(colour);
    }

    public void setColour(String colour) {
        switch (colour.toLowerCase()) {
            case "red":
            case "yellow":
            case "green":
                this.colour = colour;
        }
    }

    public String getColour() {
        return colour;
    }


}
