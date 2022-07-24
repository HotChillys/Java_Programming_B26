package replit.TJMaxx;

import java.util.List;

public class TJMaxx {


    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    public TJMaxx() {

    }

    public void addRegularItem(Item item) {
    regularItems.add(new Item(item.getName(), item.getQuantity(), item.getCatalogNumber(), item.getPrice()));
    }

    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(new OnSaleItem(item.getName(), item.getQuantity(), item.getCatalogNumber(), item.getPrice(), item.getDiscount()));
    }

    public List<Item> getRegularItems() {
        return regularItems;
    }

    public List<OnSaleItem> getOnSaleItems() {
        return onSaleItems;
    }

    public int regularItemsCount() {
        return regularItems.size();
    }


    public int onSaleItemsCount() {
        return onSaleItems.size();
    }

    public List<String> getAllItemNames() {

        return null;
    }

    public double getItemPrice(int catalogNumber) {

        return 0.0;
    }

    public OnSaleItem getOnSaleItem(String name) {


        return null;
    }

    public void removeItem(int catalogNumber) {

    }

    public void buyItem(int catalogNumber) {


    }
}
