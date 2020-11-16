package groceryListApp.model;

import java.util.ArrayList;

public class Shop {

    private String title;
    private ArrayList<Product> products;
    private int shopId;
    private static int shopCounter;

    public Shop(String title){
        this.title = title;
        this.products = new ArrayList<>();
        shopCounter++;
        this.shopId = shopCounter; // create a new shop
    }

    public Shop (String title, int id){
        this.title = title;
        this.shopId = id;
        this.products = new ArrayList<>();
    } // the cases you have a shop and just creating a container

    public int getShopId() {
        return shopId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return title + "("+ products.size() + ")";

    }
    
}
