package main.validators;

import javafx.scene.control.TextField;

/**
 * @author lrudkova <lyudmila.rudkova@t-systems.ru>
 */
public class CityNameTextField extends TextField {

    public CityNameTextField() {
        this.setPromptText("Enter your cityname");
    }

    @Override
    public void replaceText(int start, int end, String text) {
        if (text.matches("[a-zA-Z]") || text.isEmpty()){
            super.replaceText(start,end,text);
        }
    }

    @Override
    public void replaceSelection(String replacement) {
        super.replaceSelection(replacement);
    }
}
