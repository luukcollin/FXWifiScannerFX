package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;


public class HomeController {
    @FXML private Button infoButton;
    @FXML private Button scanButton;
    @FXML private PasswordField passwordField;
    @FXML private TableView<Netwerk> netwerkenTableView;
    @FXML private TableColumn<Netwerk, ImageView> fotocolumn;
    @FXML private TableColumn<Netwerk, String> signaalSterkte;
    @FXML private TableColumn<Netwerk, String> netwerkNaam;
    @FXML private TableColumn<Netwerk, String> netwerkEncryptie;

    private Netwerk netwerk;

    @FXML
    public void populateTable(){
        ObservableList<Netwerk> netwerken = FXCollections.observableArrayList();
        ObservableList<CustomImage> images = FXCollections.observableArrayList();

        Netwerk netwerk1 = new Netwerk("Interniet", 20, "WEP");
        Netwerk netwerk2 = new Netwerk("Hotspot", 69, "WPA2");
        Netwerk netwerk3 = new Netwerk("Grand Cafe", 81, "WPA");

        netwerken.add(netwerk1);
        netwerken.add(netwerk2);
        netwerken.add(netwerk3);

        netwerkenTableView.setItems(netwerken);

    }

    public void handleTableViewClick(){
        ObservableList<Netwerk> rowList = netwerkenTableView.getItems();
        System.out.println("rowlist: " + rowList);
        netwerk = netwerkenTableView.getSelectionModel().getSelectedItem();
        System.out.println(netwerkenTableView.getSelectionModel().getSelectedItem());
        if(netwerk != null){
            scanButton.setDisable(false);
            passwordField.setDisable(false);
        }
    }

    public void handleScanButton(){

        System.out.println(passwordField.getText());
    }

    public void initialize(){
        netwerkEncryptie.setCellValueFactory(new PropertyValueFactory<Netwerk, String>("encryptie"));
        netwerkNaam.setCellValueFactory(new PropertyValueFactory<Netwerk, String>("naam"));
        signaalSterkte.setCellValueFactory(new PropertyValueFactory<Netwerk, String>("signaalsterkte"));
        fotocolumn.setCellValueFactory(new PropertyValueFactory<Netwerk, ImageView>("image"));
        scanButton.setDisable(true);
        passwordField.setDisable(true);
    }


}

