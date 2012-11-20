/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.*;
/**
 *
 * @author luis
 */
public class Jukebox {
    private List<Cancion> lista;  
 
 public Jukebox(){
     
     lista=new ArrayList<Cancion>();
     
 }
 public List<Cancion> play (Comparator comparador){
     if (comparador==null){
     
     List<Cancion> listaDev= this.lista;
     
     return listaDev;
     
     }
     else{
     List<Cancion> listaDev= this.lista;
     
     Collections.sort(listaDev, comparador);
        
     return listaDev;
     }
 }
    
}
