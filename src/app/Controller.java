package app;


import app.model.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{


    @FXML
    private TableView<User> table_view;

    @FXML
    private TableColumn<User, String> col_country;

    @FXML
    private TableColumn<User, String> col_custName;

    @FXML
    private TableColumn<User, String> col_buyerUnitNum;

    @Override
    public void initialize (URL location, ResourceBundle resource){
        initTable();
        loadData();
    }



    private void initTable(){
        initColumns();
    }

    private void initColumns(){

        //country, customerName, buyerUnitNumber
        col_country.setCellValueFactory(new PropertyValueFactory<>("country"));
        col_custName.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        col_buyerUnitNum.setCellValueFactory(new PropertyValueFactory<>("buyerUnitNumber"));
    }

    private void loadData(){
        ObservableList<User> table_data = FXCollections.observableArrayList();


            for (int i = 0; i < 10; i++) {
                table_data.add(new User("", "", ""));
            }
        table_view.setItems(table_data);

    }
}
