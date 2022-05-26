/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eloadasok.Model;

import java.awt.Desktop;
import java.sql.Timestamp;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TableView;

/**
 *
 * @author markmathe
 */
public class Listazo extends Thread {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm");
    private List<String> eloadokLista;
    private ArrayList<String> eloadokNeve;
    private ArrayList<Eloadok> eloadas;
    private String eloadokTxt = "src/res/eloadok.txt";
    private String eloadasTxt = "src/res/eloadas.txt";
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    String Time = sdf.format(timestamp);

    public void beolvas(String fajlNeve) {
        try {
            eloadokLista = Files.readAllLines(Paths.get(fajlNeve));
        } catch (IOException ex) {
            Logger.getLogger(Listazo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createTxt() {
        try {

            System.out.println(Time);
            File file = new File("src/res/eloadásos.txt");
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void beírEloado(String sor) {
        try {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
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
                Writer.write(e + "\n");
            }
            Writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void sorFelülírEloadok(Eloadok sor) {
        for (Eloadok e : eloadas) {
            if (e.getNev().equals(sor.getNev())) {
                e.setTema(sor.getTema());
                e.setPerc(sor.getPerc());
            }

        }

    }

    public void beírEloadas() {
        try {
            FileWriter Writer = new FileWriter("src/rsc/Eloadás.txt", false);
            for (Eloadok e : eloadas) {
                Writer.write(e + "\n");
            }
            Writer.write(Time);
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

    public void kiir(TableView t) {
        for (Eloadok e : eloadas) {
            t.getItems().add(e);
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

    public void sorByName() {
        Collections.sort(eloadas, new EloadokComparator());
    }

    public void sorByTheme() {
        Collections.sort(eloadas, new TemaComparator());
    }

    public void sorByTime() {

        Collections.sort(eloadas, new IdoComparator());
    }

    public void open() {
        try {
//constructor of file class having file as argument  
            File file = new File("src/rsc/Eloadás.txt");
            if (!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
            {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) //checks file exists or not  
            {
                desktop.open(file);              //opens the specified file  
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
