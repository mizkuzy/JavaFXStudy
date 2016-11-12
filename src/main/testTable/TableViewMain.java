package main.testTable;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author lrudkova <lyudmila.rudkova@t-systems.ru>
 */
public class TableViewMain extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("/main/testTable/tableView.fxml"));
        Scene scene = new Scene(parent);
        stage.setTitle("Test Table");
        stage.setScene(scene);
        stage.show();
    }
}
