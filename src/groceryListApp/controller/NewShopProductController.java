package groceryListApp.controller;

import groceryListApp.database.DatabaseController;
import groceryListApp.model.Shop;
import groceryListApp.views.ErrorPageController;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

public class NewShopProductController implements Initializable {//preload load things
    @FXML
    ChoiceBox shopsDropDown;

    private DatabaseController dbController;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dbController = new DatabaseController();
        try {
            List<Shop> shops = dbController.getAllShops();
            ObservableList shopObservableList = FXCollections.observableList(shops);//this will observe your list in realtime for any changes and updates
            shopsDropDown.getItems().clear();
            shopsDropDown.setItems(shopObservableList);
            shopsDropDown.getSelectionModel().selectFirst();
        } catch (Exception ex) {
            ErrorPageController.displayErrorPage(ex.getMessage());
        }
    }
}
