/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eloadasokfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author markmathe
 */
public class eloadsokFx extends Application{

    @Override
    public void start(Stage stage) throws Exception {

       Parent root= FXMLLoader.load(getClass().getResource("EloadasokFXML.fxml"));
       Scene scene = new Scene(root);
       stage.setTitle("Eloadasok");
       stage.setScene(scene);
       stage.show();    
    }
    
    public static void main(String[] args){
    launch(args);
    }
}
