
package main.testTable;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;


public class FXMLScreen extends Stage{

    public FXMLScreen() {
    }

    public FXMLScreen(ScreenController controller, URL fxml, Window owner) {
        this(controller, fxml, owner, StageStyle.DECORATED);
    }

    public FXMLScreen(ScreenController controller, URL fxml, Window owner, StageStyle style) {

/*super(style);
        initOwner(owner);*/

        initModality(Modality.APPLICATION_MODAL);
        FXMLLoader loader = new FXMLLoader(fxml);
        try {
            loader.setControllerFactory(clazz -> controller);
            controller.setScreen(this);
            setScene(new Scene(loader.load()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
