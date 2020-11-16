package groceryListApp.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class GroceryList {

    private LocalDateTime dateTime;
    private String category;
    private ArrayList<Product> products;
    private int groceryId;
    private static int listCounter;

    public GroceryList(LocalDateTime dateTime, String category) {
        this.dateTime = dateTime;
        this.category = category;
        this.products = new ArrayList<>();
        listCounter++;
        this.groceryId = listCounter;
    }

    public int getGroceryId() {
        return groceryId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
