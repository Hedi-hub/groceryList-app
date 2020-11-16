package groceryListApp.views;

import javafx.scene.control.Alert;

public class ErrorPageController {

    public static void displayErrorPage(String message){
        Alert errorPage = new Alert(Alert.AlertType.ERROR);
        errorPage.setContentText(message);//you can also put your own message in ()
        errorPage.show();
    }

    public static void displayWarning(String message){
        Alert errorPage = new Alert(Alert.AlertType.WARNING);
        errorPage.setContentText(message);//you can also put your own message in ()
        errorPage.show();
    }

}
