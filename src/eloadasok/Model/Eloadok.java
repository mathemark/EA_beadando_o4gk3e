/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eloadasok.Model;

import java.text.Collator;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author markmathe
 */
public class Eloadok implements Comparator<Eloadok> {

    private String nev;
    private String tema;
    private String perc;

    public Eloadok(String nev, String tema, String perc) {
        this(nev + " / " + tema + " / "  + perc);
    }

    public Eloadok(String sor) {
        String[] s = sor.split("/");
        nev = s[0].trim();
        tema = s[1].trim();
        perc = s[2].trim();
    }

    public Eloadok() {
    }


    public int compareTo(Eloadok that) {
        
        Collator col = Collator.getInstance();
        return col.compare(this.nev, that.nev);
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

    public String getPerc() {
        return perc;
    }

    public void setPerc(String minutes) {
        this.perc = minutes;
    }
    
    @Override
    public String toString() {

        return nev + " / " + tema + " / "  + perc;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Eloadok other = (Eloadok) obj;
        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        if (!Objects.equals(this.tema, other.tema)) {
            return false;
        }
        return Objects.equals(this.perc, other.perc);
    }

    @Override
    public Comparator<Eloadok> reversed() {
        return Comparator.super.reversed(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }



    @Override
    public int compare(Eloadok o1, Eloadok o2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
