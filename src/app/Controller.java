package app;


import app.model.User;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Controller {


    @FXML
    private TableView<User> table_view;

    @FXML
    private TableColumn<User, String> col_country;

    @FXML
    private TableColumn<User, String> col_custName;

    @FXML
    private TableColumn<User, String> col_buyerUnitNum;


    private void initTable(){

    }

    private void initColumns(){


    }
}
