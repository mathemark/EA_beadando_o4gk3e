/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eloadasok.Model;

/**
 *
 * @author markmathe
 */
public class EA_Beadando_O4GK3E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       Konferalok konf = new Konferalok();
       System.out.println(konf.getNev());
       Eloadok eloadok = new Eloadok("Peter","Fogászat",24);
       System.out.println(eloadok.getNev() + eloadok.getTema() + eloadok.getIdo());
       

    }

}
