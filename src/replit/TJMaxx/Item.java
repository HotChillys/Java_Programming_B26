package replit.TJMaxx;

public class Item {

    //private instance variables
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    public Item(String name,int quantity,int catalogNumber, double price)
    {
        this.name = name;
        this.quantity = quantity;
        this.catalogNumber = catalogNumber;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {

        return price;
    }

    public String getName(){


        return name;
    }


    public int getQuantity(){

        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getCatalogNumber(){

        return catalogNumber;
    }

    public void setCatalogNumber(int catalogNumber) {
        this.catalogNumber = catalogNumber;
    }


}
