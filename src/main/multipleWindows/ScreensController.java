package main.multipleWindows;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

import java.io.IOException;
import java.util.HashMap;

/**
 * @author lrudkova <lyudmila.rudkova@t-systems.ru>
 */
public class ScreensController extends StackPane {

    private HashMap<String, Node> screens = new HashMap<>();

    public ScreensController() {
        super();
    }

    public void addScreen(String name, Node string) {
        screens.put(name, string);
    }

    public Node getScreen(String name) {
        return screens.get(name);
    }

    public boolean loadScreen(String name, String resource){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(resource));
            Parent loadedScreen = (Parent) loader.load();
            ControlledScreenInt screenContoller = ((ControlledScreenInt) loader.getController());
            screenContoller.setScreenParent(this);
            addScreen(name, loadedScreen);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

    public boolean setScreen(final String name){
        if(screens.get(name) != null){//screen loaded
            final DoubleProperty opacity = opacityProperty();
            if (!getChildren().isEmpty()){ // if there is more than one screen
                Timeline fade = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(opacity, 1.0)),
                        new KeyFrame(new Duration(1000), new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                getChildren().remove(0);//remove the displayed screen
                                getChildren().add(0,screens.get(name)); //add the screen
                                Timeline fadeIn = new Timeline(
                                  new KeyFrame(Duration.ZERO, new KeyValue(opacity, 0.0)),
                                        new KeyFrame(new Duration(800), new KeyValue(opacity, 1.0))
                                );
                                fadeIn.play();
                            }
                        }, new KeyValue(opacity,0.0)));
                fade.play();
            }else {
                setOpacity(0.0);
                getChildren().add(screens.get(name)); //no one else been displayed, then just show
                Timeline fadeIn = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(opacity, 0.0)),
                        new KeyFrame(new Duration(2500), new KeyValue(opacity, 1.0))
                );
                fadeIn.play();
            }
            return true;
        }else {
            System.err.println("screen hasn't been loaded");
            return false;
        }
    }

    //This method will remove the screen with the given name from the collection of screens
    public boolean unloadScreen(String name) {
        if (screens.remove(name) == null) {
            System.out.println("Screen didn't exist");
            return false;
        } else {
            return true;
        }
    }


}
