package main.multipleWindows;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author lrudkova <lyudmila.rudkova@t-systems.ru>
 */
public class Screen3Controller implements Initializable, ControlledScreenInt{
    private ScreensController controller;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public void setScreenParent(ScreensController currentController) {
        controller = currentController;
    }

    @FXML
    private void goToScreen1(){
        controller.setScreen(ScreensFramework.screen1ID);
    }

    @FXML
    private void goToScreen2(){
        controller.setScreen(ScreensFramework.screen2ID);
    }
}
