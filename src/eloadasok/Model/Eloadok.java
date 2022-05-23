/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eloadasok.Model;

import java.io.Serializable;


/**
 *
 * @author markmathe
 */
public class Eloadok implements Serializable{


    private String nev;
    private String tema;
    private int ido;

    public Eloadok(String nev, String tema, int ido) {
        this.nev = nev;
        this.tema = tema;
        this.ido = ido;
    }

    public String getNev() {
        return nev;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getIdo() {
        return ido;
    }

    public void setIdo(int ido) {
        this.ido = ido;
    }



}
