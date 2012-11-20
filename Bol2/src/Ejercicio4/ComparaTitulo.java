package Ejercicio4;


import Ejercicio4.Cancion;
import java.util.Comparator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author l.f.llamas
 */
public class ComparaTitulo implements Comparator<Cancion>{
 @Override   
 public int compare(Cancion c1, Cancion c2) {
 
return c1.getTitulo().compareTo(c2.getTitulo());
 
 }  
    
}