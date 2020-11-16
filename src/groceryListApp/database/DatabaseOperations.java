package groceryListApp.database;

import groceryListApp.model.Product;
import groceryListApp.model.Shop;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DatabaseOperations {

    public ArrayList<Shop> getAllShops() throws SQLException;
    public ArrayList<String> getProductsForShop(Shop shop) throws SQLException;
    public void addShop(Shop shop);

    public void addProductToShop();

    public void removeShop(Shop shop);

    public void removeProductFromShop(Product product, Shop shop);



}
