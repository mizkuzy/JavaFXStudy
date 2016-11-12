package main.validators;

import javafx.scene.control.IndexRange;
import javafx.scene.control.TextField;

/**
 * @author lrudkova <lyudmila.rudkova@t-systems.ru>
 */
public class NumberTextField extends TextField {
    public NumberTextField() {
        this.setPromptText("Enter Only numbers");
    }

    @Override
    public void replaceText(int start, int end, String text) {
        if (text.matches("[0-9]") || text.isEmpty()) {
            super.replaceText(start, end, text);
        }
    }

    @Override
    public void replaceSelection(String replacement) {
        super.replaceSelection(replacement);
    }
}
