package day42_custom_classes;

public class Item {

    String name;
    double price;

    @Override // can ignore or delete
        public String toString() {
        return "Item : " + "Name = '" + name + '\'' + ", price = " + price;
    }
}
