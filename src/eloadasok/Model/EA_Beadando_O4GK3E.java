/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eloadasok.Model;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author markmathe
 */
public class EA_Beadando_O4GK3E {
        
    /**
     * @param args the command line arguments
     */
    static String eloadokTxt = "src/rsc/Eloadok.txt";
    private String eloadasTxt = "src/rsc/Eloadas.txt";
    
    public static void main(String[] args) {
        Listazo l = new Listazo();
        
        Eloadok e = new Eloadok("Aladár", "Vendetta","20");
        Eloadok c = new Eloadok("Béla", "Csíra","3333");
        Eloadok k = new Konferalok();
        //l.beírEloadok(e.toString() + "\n");
        //l.beírEloadok(k.toString() + "\n");
//        l.beírEloadok(c.toString()+ "\n");
//        l.beírEloadok(k.toString() + "\n");
        l.beolvas(eloadokTxt);
        l.feltolt();
        
        l.hashKi();
        
        System.out.println("------------->");
        l.treeKi();
        System.out.println("------------->");
        l.sorByName();
        l.felülírEloadok();
        System.out.println("------------->");
        l.sorByTheme();
        System.out.println("------------->");
        l.sorByTime();
        System.out.println("------------->");
        l.beolvas(eloadokTxt);
        l.feltolt();
        l.kiir();
        System.out.println("------------->");
        Eloadok g = new Eloadok("Béla","Samsonite","21");
        l.sorFelülírEloadok(g);
        l.felülírEloadok();
        l.kiir();
    }
    }
