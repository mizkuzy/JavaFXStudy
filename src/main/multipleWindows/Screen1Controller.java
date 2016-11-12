package main.multipleWindows;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author lrudkova <lyudmila.rudkova@t-systems.ru>
 */
public class Screen1Controller implements Initializable, ControlledScreenInt{

    ScreensController controller;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public void setScreenParent(ScreensController currentController) {
        controller = currentController;
    }

    @FXML
    private void goToScreen2(){
        controller.setScreen(ScreensFramework.screen2ID);
    }

    @FXML
    private void goToScreen3(){
        controller.setScreen(ScreensFramework.screen3ID);
    }
}
