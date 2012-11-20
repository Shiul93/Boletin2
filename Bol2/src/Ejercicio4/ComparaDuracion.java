/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Comparator;

/**
 *
 * @author luis
 */
public class ComparaDuracion  implements Comparator<Cancion>{
 @Override   
 public int compare(Cancion c1, Cancion c2) {
 
return c1.getDuracion().compareTo(c2.getDuracion());
 
 }  
    
}
