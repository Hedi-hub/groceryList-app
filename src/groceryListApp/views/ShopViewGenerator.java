package groceryListApp.views;

import groceryListApp.database.DatabaseController;
import groceryListApp.model.Product;
import groceryListApp.model.Shop;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;


import java.sql.SQLException;
import java.util.ArrayList;

public class ShopViewGenerator {

    private final static int initialx = 15;
    private int initialy = 70;
    private final static int gap = 190;

    private DatabaseController databaseController;

    public ShopViewGenerator() {
        this.databaseController = new DatabaseController();
    }

    public AnchorPane createShopView(ArrayList<Shop> shops, AnchorPane mainAnchorPane) throws SQLException {
        int shopCounter = 1;
        int current =0;
        int previousValue = 0;


        for(Shop shop : shops) {
            //having label
            AnchorPane shopWrap = new AnchorPane();
            ScrollPane scrollPane = new ScrollPane();
            scrollPane.setContent(shopWrap);
            //this statement would display the scroll bar always
            scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

            scrollPane.setPrefWidth(575);
            scrollPane.setPrefHeight(170);
            //add border lines to the page
            //shopWrap.setStyle("-fx-border-color: green; -fx-border-width:1px 1px 1px 1px");
            scrollPane.setLayoutX(15);

            if(shopCounter== 1){
                scrollPane.setLayoutY(initialy);
                previousValue = initialy;
            }else{
                //prv = previousvalue + gaps
                current =previousValue + gap;
                scrollPane.setLayoutY(current);
                previousValue = current;

            }
            shopCounter++;


            ArrayList<String> products = databaseController.getProductsForShop(shop);
            //TODO: add code here that display the products on the shop container
            shopWrap.getChildren().add(new Label(shop.getTitle()));

            double tempLayout = 0;
            for (  String product : databaseController.getProductsForShop(shop)){
                CheckBox box = new CheckBox(product);
                box.setLayoutY(tempLayout + 20);
                tempLayout = box.getLayoutY();
                shopWrap.getChildren().add(box);
            }// to loop through products
            mainAnchorPane.getChildren().add(scrollPane);

        }

        return mainAnchorPane;
    }
}
