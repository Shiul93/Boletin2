/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author miguel  

 */
public class Factura {
    
   private String Fecha_expedicion;
   private String concepto;
   private String Precio;
   private Cliente cliente;
   

    
    public Factura (String Fecha_expedicion, String concepto, String Precio, Cliente c){
        
        this.Fecha_expedicion=Fecha_expedicion;
        this.Precio=Precio;
        this.concepto=concepto; 
        this.cliente=c;
             
    }
    
    public String getFecha(){
        
        return this.Fecha_expedicion;
        
    }
    
    public Cliente getCliente(){
        
        return this.cliente;
    }
    
    @Override
    public String toString(){
        
        String Datos_factura;
        String Datos_cliente;
        Datos_factura="FECHA DE EXPEDICIÓN: "+this.Fecha_expedicion+"\nPRECIO: "+this.Precio+"\nCONCEPTO: "+this.concepto;
        Datos_cliente=cliente.toString();
        return Datos_factura+"\n"+Datos_cliente;
    }
}
