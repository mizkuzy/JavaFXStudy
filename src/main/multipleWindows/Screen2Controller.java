package main.multipleWindows;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author lrudkova <lyudmila.rudkova@t-systems.ru>
 */
public class Screen2Controller  implements Initializable, ControlledScreenInt{

    ScreensController controller;

    @Override
    public void setScreenParent(ScreensController currentController) {
        controller = currentController;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void goToScreen1(){
        controller.setScreen(ScreensFramework.screen1ID);
    }

    @FXML
    private void goToScreen3(){
        controller.setScreen(ScreensFramework.screen3ID);
    }
}
