/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eloadasok.Model;

/**
 *
 * @author markmathe
 */
public class Konferalok extends Eloadok{
    static String nev = "Konfer";
    static String tema = "Átvezető";
    static String perc = "1";
      
    public String Konferalok() {
        return nev + " / " + tema + " / " + perc;
    }
    @Override
    public String toString(){
    return nev + " / " + tema + " / " + perc;
    }
    public Konferalok(){};

    public String getNev() {return nev;}
    public String getTema() {return tema;}
    public String getIdo() {return perc;}

  
}
