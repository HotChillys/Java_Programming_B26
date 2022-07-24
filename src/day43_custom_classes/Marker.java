package day43_custom_classes;

public class Marker {

    String type;
    String brand;
    String colour;

    public Marker (String inputType, String inputBrand, String inputColour){
        type = inputType;
        brand = inputBrand;
        colour = inputColour;
    }

    @Override
    public String toString() {
        return "Marker type: " + type +
                ", \nbrand: " + brand +
                ", \ncolour: " + colour;
    }
}
