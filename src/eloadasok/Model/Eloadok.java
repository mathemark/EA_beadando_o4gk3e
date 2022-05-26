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

class EloadokComparator implements Comparator<Eloadok>, Runnable{

    @Override
    public int compare(Eloadok egyik, Eloadok masik) {
        
        Collator col = Collator.getInstance();
        return col.compare(egyik.getNev(), masik.getNev());
    } 

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

class TemaComparator implements Comparator<Eloadok>{

    @Override
    public int compare(Eloadok egyik, Eloadok masik) {
        
        Collator col = Collator.getInstance();
        return col.compare(egyik.getTema(), masik.getTema());
    } 
}
class IdoComparator implements Comparator<Eloadok>{

    @Override
    public int compare(Eloadok egyik, Eloadok masik) {
        
        Collator col = Collator.getInstance();
        return col.compare(egyik.getPerc(), masik.getPerc());
    } 
}
public class Eloadok implements Comparable<Eloadok> {

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

    public Eloadok() {}

    @Override
    public int compareTo(Eloadok that) {
        
        Collator col = Collator.getInstance();
        return col.compare(this.perc, that.perc);
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
    public void setNev(String nev) {
        this.nev = nev;
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






    
    
}
