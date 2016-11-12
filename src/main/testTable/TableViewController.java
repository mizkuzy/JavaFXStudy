package main.testTable;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import javax.swing.text.*;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author lrudkova <lyudmila.rudkova@t-systems.ru>
 */
public class TableViewController implements Initializable {

    @FXML
    public TableView<Employee> tableID;
    public TableColumn<Employee, Integer> id;
    public TableColumn<Employee, String> name;
    public TableColumn<Employee, String> surname;
    public TableColumn<Employee, Integer> age;
    public TextField city;

    private int countID = 0;
    public ObservableList<Employee> data = FXCollections.observableArrayList(
            new Employee(countID++, "Bomg", "Nyuh", 1)/*,
            new Employee(countID++, "Bomg", "Nyuh", 1),
            new Employee(countID++, "Bomg", "Nyuh", 1),
            new Employee(countID++, "Bomg", "Nyuh", 1),
            new Employee(countID++, "Bomg", "Nyuh", 1),
            new Employee(countID++, "Bomg", "Nyuh", 1),
            new Employee(countID++, "Bomg", "Nyuh", 1),
            new Employee(countID++, "Bomg", "Nyuh", 1),
            new Employee(countID++, "Bomg", "Nyuh", 1),
            new Employee(countID++, "Bomg", "Nyuh", 1),
            new Employee(countID++, "Bomg", "Nyuh", 1),
            new Employee(countID++, "Bomg", "Nyuh", 1),
            new Employee(countID++, "Bomg", "Nyuh", 1),
            new Employee(countID++, "Bomg", "Nyuh", 1),
            new Employee(countID++, "Bomg", "Nyuh", 1),
            new Employee(countID++, "Bomg", "Nyuh", 1),
            new Employee(countID++, "Bomg", "Nyuh", 1),
            new Employee(countID++, "Bomg", "Nyuh", 1),
            new Employee(countID++, "Bomg", "Nyuh", 1)*/

    );

    @FXML
    public void clickBtn() {
        System.out.println("the btn was clicked");
        System.out.println("City is " + city.getText());

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        id.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("id"));
        name.setCellValueFactory(new PropertyValueFactory<Employee, String>("name"));
        surname.setCellValueFactory(new PropertyValueFactory<Employee, String>("surname"));
        age.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("age"));
        tableID.setItems(data);
    }
}
