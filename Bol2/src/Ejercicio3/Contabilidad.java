/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Contabilidad {
    
     List<Factura> contabilidad;
     
     //CONSTRUCTOR
     
     public Contabilidad(){
        
        this.contabilidad=new ArrayList<Factura>();
         
     }
     
     
     public boolean IncluirFactura(Factura f){
         
        boolean add = contabilidad.add(f);
        return add;
        
     }
     
     public void EliminarFactura(Cliente c){
         
        Factura f;
        Cliente c1;
        Iterator i = contabilidad.iterator();
        
        while (i.hasNext()){
             
             f=(Factura) i.next();
             c1=f.getCliente();
                      
             if (c1.equals(c)==true)
                 
             {
                 i.remove();
             }   
             
         }
         
     }
     public void ProcesarContabilidad(){
         
         Factura f;
         Iterator i = contabilidad.iterator();
         
         while (i.hasNext()) {
             
             f=(Factura) i.next();
             System.out.println(f.toString()+"\n\n");
             
         }
         
     }
}

