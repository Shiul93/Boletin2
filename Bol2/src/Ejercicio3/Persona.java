/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author miguel
 */
public class Persona extends Cliente {
    
    private String fecha_nacimiento;
    
    public Persona (int ID, String nombre, String domicilio, String fecha){
        
        super(ID, nombre, domicilio);
        this.fecha_nacimiento=fecha;
    }
    

    @Override
    public String getPLazo() {
        return "1 mes";
    }
    
        @Override
    public String toString(){
       String s=super.toString();
       return (s+"\nFECHA DE NACIMIENTO: "+this.fecha_nacimiento+"\nPLAZO:" +this.getPLazo());
    }
    
}
