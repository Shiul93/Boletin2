/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author miguel
 */
public abstract class Cliente  {
    
    private int ID;
    private String nombre;
    private String domicilio;
    
     public Cliente (int ID, String nombre, String domicilio){
         this.ID=ID;
         this.domicilio=domicilio;
         this.nombre=nombre;
     }
    
    public abstract String getPLazo();
    
    @Override
    public String toString(){
        
        return ("ID: "+this.ID+ "\nNOMBRE: "+this.nombre+"\nDOMICILIO: "+this.domicilio);
    }
}
