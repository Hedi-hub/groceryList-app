package groceryListApp.model;

public class Product {

    private int productId;
    private String title;
    private Shop shop;
    private static int productCounter;

    public Product (String title,
                    double price,
                    Shop shop){
        this.title = title;
        this.shop = shop;
        productCounter++;
        this.productId = productCounter;

    }

    public int getProductId() {
        return productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
