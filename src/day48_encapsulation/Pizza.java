package day48_encapsulation;

public class Pizza {
    /*
     create a class called Pizza

        - data:

            size (String), number of toppings

        - constructor

            - create a constructor that creates a Pizza object with the siz & number of topping

            	call setters here

        - encapsulate the Pizza class

        	- setter condition:
        		size can only be:
        			small, medium, or large

        		number of toppings must be a positive number

        - other methods methods:

            - calculatePrice()
            		calculate the price of the pizza based on:

            			small base: $4
            			medium base: $6
            			large base: $8

            			each topping adds $0.75 to the price

            			calculate the total price and return the cost

            - toString()
                print the size, number of toppings, and cost of the pizza

    Create a separate class to create and test the Pizza objects
     */
    private String size;
    private int numberOfTopping;

    public Pizza(String size, int numberOfTopping) {
        setSize(size);
        setNumberOfTopping(numberOfTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")){
            this.size = size;
        }
    }

    public int getNumberOfTopping() {
        return numberOfTopping;
    }

    public void setNumberOfTopping(int numberOfTopping) {
        if (numberOfTopping >= 0) {
            this.numberOfTopping = numberOfTopping;
        }
    }

    public double calculatePrice(){

        if (size == null) {
            return -1;
        }

        double price = size.equalsIgnoreCase("small") ? 4 : size.equalsIgnoreCase("medium") ? 6 : 8;
        return price + (numberOfTopping * 0.75);
    }

    public String toString(){
        return "Pizza size: " + size + ", number of topping: " + numberOfTopping + ", price = $" +calculatePrice();
    }

}
