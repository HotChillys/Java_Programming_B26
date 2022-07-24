package day05_variables;

public class House {
    public static void main(String[] args) {

        /*
        Create a class House
    Create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park nearby, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
         */
        String houseType = "detached house";
        byte numberOfBedroom = 4;
        byte numberOfBathroom = 3;
        byte numberOfKitchen = 2;
        byte basement = 1;
        char attic = '1';
        String pool = "no";
        String forSale = "yes";
        int cost = 899_999;
        String address = "786 boolean ave, Java, Ontario";
        String zipCode = "L4N 5V2";
        String parkNearby = "yes";
        char schoolDistrictRating = '4';

//approach 1
        System.out.println("A: Can you send me the detail of the house that was listed this morning please?");
        System.out.println("B: It is a " + houseType + " unit with " + numberOfBedroom + " bedrooms, " + numberOfBathroom + " bathroom and " + numberOfKitchen + " kitchens. It has " + basement + " basement, " + attic + " attic, and it has " + pool + " pool. And " + forSale + " the house is for sale for $" + cost + ". The address is " + address + " " + zipCode + "\n Also, the nearby school rating is " + schoolDistrictRating + " and " + parkNearby + " the park is in walking distance.");

        System.out.println();

//approach 2
        String houseInfo = "The " + houseType + " on " + address + ", " + zipCode + " costs $" + cost + ".\nThe " + houseType + " had" + numberOfBedroom + " bedrooms, " + numberOfBathroom + " bathrooms. " + numberOfKitchen + " kitchens.\nIt also includes a basement: " + basement + ",\nhas an attic: " + attic + ", \nhas pool: " + pool + ", \nis on sale: " + forSale + " \nhas a park: " + parkNearby + ".\nThe school in this district has a rating of " + schoolDistrictRating + ".";

        System.out.println(houseInfo);

    }
}
