package groceryListApp;

import groceryListApp.database.DatabaseController;
import groceryListApp.model.Shop;
import groceryListApp.views.ShopViewGenerator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    DatabaseController databaseController;

    @Override
    public void start(Stage primaryStage) throws Exception{
        databaseController = new DatabaseController();
        ArrayList<Shop> shops = databaseController.getAllShops();

        Parent root = FXMLLoader.load(getClass().getResource("views/GroceryList.fxml"));

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(root);
        //this statement would display the scroll bar always
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

        ShopViewGenerator generator = new ShopViewGenerator();
        root = generator.createShopView(shops,(AnchorPane) root);//DB shop--->arraylist



        primaryStage.setTitle("Grocery List");
        primaryStage.setScene(new Scene(scrollPane));
        primaryStage.show();
        // this is not allowing us to resize the primarystage
        primaryStage.setResizable(false);
    }


    public static void main(String[] args) {
        launch(args);
    }


}
