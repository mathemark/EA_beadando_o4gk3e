/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eloadasok.Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author markmathe
 */
public class Listazo {

    private List<String> eloadokLista;
    private ArrayList<String> eloadokNeve;
    private ArrayList<Eloadok> eloadas;

    public void beolvas(String fajlNeve) {
        try {
            eloadokLista = Files.readAllLines(Paths.get(fajlNeve));
        } catch (IOException ex) {
            Logger.getLogger(Listazo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void hozzaAd(String sor){
        eloadokLista.add(sor);
    }
    

    private void createTxt(String fajlNeve) {
        try {
            File myObj = new File("src/res/eloadok.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    private void beírEloadok(){
        try {
      FileWriter Writer = new FileWriter("src/res/eloadok.txt");
      
      Writer.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
     private void beírEloadas(){
        try {
      FileWriter Writer = new FileWriter("src/res/eloadás.txt");
      for (Eloadok e : eloadas){
      Writer.write(""+e);}
      Writer.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
    public void feltolt() {
        eloadas = new ArrayList<>();
        for (String sor : eloadokLista) {
            eloadas.add(new Eloadok(sor));
        }
    }

    public void kiir() {
        for (Eloadok e : eloadas) {
            System.out.println();
        }
    }

}
