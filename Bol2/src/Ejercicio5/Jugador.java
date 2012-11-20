/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class Jugador {
    
   private List<Carta> mano;
   private int bazas;
  
   
   public Jugador(){
       mano=new ArrayList<Carta>();
       bazas=0;
      }

    public List<Carta> getMano() {
        return mano;
    }

    public void setMano(Carta carta) {
        this.mano.add(carta);
    }

    public int getBazas() {
        return bazas;
    }

    public void setBazas(int bazas) {
        this.bazas = bazas;
    }
   
   
   
    
}
