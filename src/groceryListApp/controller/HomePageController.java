package groceryListApp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class HomePageController {

    @FXML
    public void createList() {

    }

    @FXML
    void showNewShopPage(ActionEvent event) throws IOException {
        // stage = new window
        Stage showNewShopPage = new Stage();
        //load the contents of our fxml into root
        Parent root = FXMLLoader.load(getClass().getResource("../views/add-new-shop.fxml"));
        Scene scene = new Scene(root);
        showNewShopPage.setScene(scene);
        showNewShopPage.show();
    }
}
