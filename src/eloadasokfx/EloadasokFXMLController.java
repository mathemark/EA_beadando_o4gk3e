/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package eloadasokfx;

import eloadasok.Model.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author markmathe
 */
public class EloadasokFXMLController implements Initializable {

    @FXML
    private TextField nevTextEdit;
    @FXML
    private TextField eloadasText;
    @FXML
    private TextField idoText;
    @FXML
    private Button eloadoButton;
    @FXML
    private Button cancelButton;
    @FXML
    private Button konferButton;
    @FXML
    private Button redezveny;
    @FXML
    private TextField eloadasTextEdit;
    @FXML
    private TextField idoTextEdit;
    @FXML
    private Button cancelButton1;
    @FXML
    private TextField nevText;
    @FXML
    private TableView<Eloadok> tableview;
    @FXML
    private TableColumn<Eloadok, String> nev;
    @FXML
    private TableColumn<Eloadok, String> tema;
    @FXML
    private TableColumn<Eloadok, String> perc;
    @FXML
    private Button eloadoEditButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Listazo l = new Listazo();
        nev.setCellValueFactory(new PropertyValueFactory<Eloadok, String>("nev"));
        tema.setCellValueFactory(new PropertyValueFactory<Eloadok, String>("tema"));
        perc.setCellValueFactory(new PropertyValueFactory<Eloadok, String>("perc"));
        l.beolvas("src/rsc/Eloadok.txt");
        l.feltolt();
        
        l.kiir(tableview);
        perc.setSortType(TableColumn.SortType.DESCENDING);
        tableview.getSortOrder().add(perc);
    }

    @FXML
    private void enterEloadoData(ActionEvent event) {
         if(nevText.getText().trim().isEmpty() || eloadasText.getText().trim().isEmpty()|| idoText.getText().trim().isEmpty()){
        Alert a = new Alert(AlertType.WARNING,"Something is missing");
        a.show();
        }else{
        Listazo l = new Listazo();
        Eloadok e = new Eloadok(nevText.getText(),
                eloadasText.getText(), idoText.getText());
        System.out.println(e);
        l.beírEloado(e.toString() + "\n");
        tableview.getItems().add(e);
        nevText.clear();
        eloadasText.clear();
        idoText.clear();
         }
    }

    @FXML
    private void enterKonferData(ActionEvent event) {
        Listazo l = new Listazo();
        Eloadok k = new Konferalok();
        l.beírEloado(k.toString() + "\n");
        l.beolvas("src/rsc/Eloadok.txt");
        l.feltolt();
        tableview.getItems().clear();
        l.kiir(tableview);

    }

    @FXML
    private void rendezveny(ActionEvent event) {
        Listazo l = new Listazo();
        l.beolvas("src/rsc/Eloadok.txt");
        l.feltolt();
        l.beírEloadas();
        l.open();
        
    }

    @FXML
    private void clearTop(ActionEvent event) {
        nevText.clear();
        eloadasText.clear();
        idoText.clear();
    }

    @FXML
    private void editEloadoData(ActionEvent event) {

        Listazo l = new Listazo();
        if(nevTextEdit.getText().trim().isEmpty() || eloadasTextEdit.getText().trim().isEmpty()|| idoTextEdit.getText().trim().isEmpty()){
        Alert a = new Alert(AlertType.WARNING,"Something is missing");
        a.show();
        }else{
        Eloadok sor = new Eloadok(nevTextEdit.getText(),
                eloadasTextEdit.getText(), idoTextEdit.getText());
        l.beolvas("src/rsc/Eloadok.txt");
        l.feltolt();
        l.sorFelülírEloadok(sor);
        l.felülírEloadok();
        l.beolvas("src/rsc/Eloadok.txt");
        l.feltolt();
        tableview.getItems().clear();
        l.kiir(tableview);}

    }

    @FXML
    private void clearEditData(ActionEvent event) {
        nevTextEdit.clear();
        eloadasTextEdit.clear();
        idoTextEdit.clear();
    }


}
