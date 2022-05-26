/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eloadasok.Model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
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
    private String eloadokTxt = "src/res/eloadok.txt";
    private String eloadasTxt = "src/res/eloadas.txt";

    public void beolvas(String fajlNeve) {
        try {
            eloadokLista = Files.readAllLines(Paths.get(fajlNeve));
        } catch (IOException ex) {
            Logger.getLogger(Listazo.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    public void beírEloadok(String sor) {
        try {
            FileWriter fileWriter = new FileWriter("src/rsc/Eloadok.txt", true);
            BufferedWriter Writer = new BufferedWriter(fileWriter);
            Writer.write(sor);
            Writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
        public void felülírEloadok() {
        try {
            FileWriter Writer = new FileWriter("src/rsc/Eloadok.txt", false);
            for (Eloadok e : eloadas) {
                Writer.write(e+"\n");
            }
            Writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
        
    public void sorFelülírEloadok(Eloadok sor) {
            for (Eloadok e : eloadas) {
                //System.out.println(e.getNev() + " " +sor.getNev());
                if(e.getNev().equals(sor.getNev())){
                    
                    e.setTema(sor.getTema());
                    e.setPerc(sor.getPerc());
                } 
                
            }

    }

    private void beírEloadas() {
        try {
            FileWriter Writer = new FileWriter("src/res/eloadás.txt");
            for (Eloadok e : eloadas) {
                Writer.write("" + e);
            }
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
            System.out.println(e);
        }
    }

    public void hashKi() {
        Set<Eloadok> halmaz = new HashSet<>(eloadas);
        for (Eloadok dal : halmaz) {
            System.out.println(dal);
        }
    }

    public void treeKi() {
    Set<Eloadok> faHalmaz = new TreeSet<>(eloadas);
        for (Eloadok e : faHalmaz) {
            System.out.println(e);
        }
    }
    public void sorByName(){
    Collections.sort(eloadas, new EloadokComparator());
        kiir();
    }
    
    public void sorByTheme(){
    Collections.sort(eloadas, new TemaComparator());
        kiir();
    }
    
    public void sorByTime(){
        
    Collections.sort(eloadas, new IdoComparator());
        kiir();
    }
    }
    